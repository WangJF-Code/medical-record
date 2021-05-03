package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.dto.*;
import com.nickel.medicalrecord.model.entity.DetectItem;
import com.nickel.medicalrecord.model.enums.DetectItemType;
import com.nickel.medicalrecord.repository.*;
import com.nickel.medicalrecord.service.IAdvancedSearchService;
import com.nickel.medicalrecord.util.DateTimeUtil;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@Slf4j
public class AdvancedSearchService implements IAdvancedSearchService {

    public static final Integer HOSPITAL_RECORD_TYPE = 1;

    public static final Integer FOLLOWUP_RECORD_TYPE = 2;

    private IAdvancedSearchMapper mapper;

    private IDetectAntiplateletDrugGenesMapper detectAntiplateletDrugGenesMapper;

    private IDetectBiochemicalFullItemMapper detectBiochemicalFullItemMapper;

    private IDetectBloodRoutineMapper detectBloodRoutineMapper;

    private IDetectClottingRoutineMapper detectClottingRoutineMapper;

    private IDetectEkgMapper detectEkgMapper;

    private IDetectInflammatoryMediaMapper detectInflammatoryMediaMapper;

    private IDetectSwiMapper detectSwiMapper;

    private IDetectThirteenBloodLipidsMapper detectThirteenBloodLipidsMapper;

    private IDetectThyroidFunctionMapper detectThyroidFunctionMapper;

    @Autowired
    public AdvancedSearchService(IDetectAntiplateletDrugGenesMapper detectAntiplateletDrugGenesMapper, IDetectBiochemicalFullItemMapper detectBiochemicalFullItemMapper, IDetectBloodRoutineMapper detectBloodRoutineMapper, IDetectClottingRoutineMapper detectClottingRoutineMapper, IDetectEkgMapper detectEkgMapper, IDetectInflammatoryMediaMapper detectInflammatoryMediaMapper, IDetectItemMapper detectItemMapper, IDetectSwiMapper detectSwiMapper, IDetectThirteenBloodLipidsMapper detectThirteenBloodLipidsMapper, IDetectThyroidFunctionMapper detectThyroidFunctionMapper, IAdvancedSearchMapper mapper) {
        this.detectAntiplateletDrugGenesMapper = detectAntiplateletDrugGenesMapper;
        this.detectBiochemicalFullItemMapper = detectBiochemicalFullItemMapper;
        this.detectBloodRoutineMapper = detectBloodRoutineMapper;
        this.detectClottingRoutineMapper = detectClottingRoutineMapper;
        this.detectEkgMapper = detectEkgMapper;
        this.detectInflammatoryMediaMapper = detectInflammatoryMediaMapper;
        this.detectSwiMapper = detectSwiMapper;
        this.detectThirteenBloodLipidsMapper = detectThirteenBloodLipidsMapper;
        this.detectThyroidFunctionMapper = detectThyroidFunctionMapper;
        this.mapper = mapper;
    }

    @Override
    public Page<HospitalRecordsDTO> hospitalList(AdvancedSearchHospitalDTO search, Integer pageCurrent, Integer pageSize) {
        List<String> idList = new ArrayList<>();
        if (Objects.nonNull(search.getDiagnosticRecords())) {
            List<String> diagnosticRecordsIdList = mapper.findDiagnosticRecordsIdList(search.getDiagnosticRecords());
            idList.addAll(diagnosticRecordsIdList);
        }
        if (Objects.nonNull(search.getTreatmentRecords())) {
            List<String> treatmentRecordsIdList = mapper.findTreatmentRecordsIdList(search.getTreatmentRecords());
            idList.addAll(treatmentRecordsIdList);
        }
        if (Objects.nonNull(search.getDetectItemMultipleSingle())) {
            idList.addAll(findDataIdList(HOSPITAL_RECORD_TYPE, search.getDetectItemMultipleSingle()));
        }
        if (Objects.nonNull(search.getMedicationDrugRecordList()) && search.getMedicationDrugRecordList().size() > 0) {
            idList.addAll(findDataIdList(HOSPITAL_RECORD_TYPE, search.getMedicationDrugRecordList()));
        }
        Integer count = mapper.findHospitalCount(search, idList);
        List<HospitalRecordsDTO> list = mapper.findHospitalPage(search, idList, pageCurrent * pageSize - pageSize, pageSize);
        return Page.<HospitalRecordsDTO>builder()
                .count(count)
                .currPage(pageCurrent)
                .pageSize(pageSize)
                .data(list)
                .build();
    }

    @Override
    public Page<HospitalFollowupDTO> followupList(AdvancedSearchFollowupDTO search, Integer pageCurrent, Integer pageSize) {
        List<String> idList = new ArrayList<>();
        Integer count = mapper.findFollowupCount(search, idList);
        List<HospitalFollowupDTO> list = mapper.findFollowupPage(search, idList, pageCurrent * pageSize - pageSize, pageSize);
        return Page.<HospitalFollowupDTO>builder()
                .count(count)
                .currPage(pageCurrent)
                .pageSize(pageSize)
                .data(list)
                .build();
    }

    @Override
    public AuxiliaryCheckDTO getAuxiliaryCheck(Integer type, String dataId) {
        AuxiliaryCheckDTO dto = AuxiliaryCheckDTO.builder().build();
        dto.setAntiplateletDrugGenesList(detectAntiplateletDrugGenesMapper.selectList(type, dataId).stream().map(EntityTransformUtils::transform).collect(Collectors.toList()));
        dto.setBiochemicalFullItemList(detectBiochemicalFullItemMapper.selectList(type, dataId).stream().map(EntityTransformUtils::transform).collect(Collectors.toList()));
        dto.setBloodRoutineList(detectBloodRoutineMapper.selectList(type, dataId).stream().map(EntityTransformUtils::transform).collect(Collectors.toList()));
        dto.setClottingRoutineList(detectClottingRoutineMapper.selectList(type, dataId).stream().map(EntityTransformUtils::transform).collect(Collectors.toList()));
        dto.setEkgList(detectEkgMapper.selectList(type, dataId).stream().map(EntityTransformUtils::transform).collect(Collectors.toList()));
        dto.setInflammatoryMediaList(detectInflammatoryMediaMapper.selectList(type, dataId).stream().map(EntityTransformUtils::transform).collect(Collectors.toList()));
        dto.setSwiList(detectSwiMapper.selectList(type, dataId).stream().map(EntityTransformUtils::transform).collect(Collectors.toList()));
        dto.setThirteenBloodLipidsList(detectThirteenBloodLipidsMapper.selectList(type, dataId).stream().map(EntityTransformUtils::transform).collect(Collectors.toList()));
        dto.setThyroidFunctionList(detectThyroidFunctionMapper.selectList(type, dataId).stream().map(EntityTransformUtils::transform).collect(Collectors.toList()));
        List<DetectItem> itemList = mapper.selectDetectItemList(type, dataId);
        setDetectItem(dto, itemList);
        return dto;
    }

    private List<String> findDataIdList(Integer type, List<Integer> medicationDrugRecordList) {
        return mapper.findDataIdListByMedicationRecord(type, medicationDrugRecordList);
    }

    private List<String> findDataIdList(Integer type, DetectItemMultipleSingleConditionDTO detectItemMultipleSingle) {
        String multipleSingle = detectItemMultipleSingle.getMultipleSingle();
        detectItemMultipleSingle.setMultipleSingleList(Arrays.asList(multipleSingle.split(";")));
        return mapper.findDataIdListByDetectItemMultipleSingle(type, detectItemMultipleSingle);
    }

    private void setDetectItem(AuxiliaryCheckDTO dto, List<DetectItem> itemList) {
        for (DetectItem detectItem : itemList) {
            switch (detectItem.getDetectType()) {
                case 101:
                    dto.getValue101List().add(transformValue(detectItem));
                    break;
                case 102:
                    dto.getValue102List().add(transformValue(detectItem));
                    break;
                default:
            }
        }
    }

    private DetectItemValueDTO transformValue(DetectItem item) {
        DetectItemValueDTO dto = DetectItemValueDTO.builder().build();
        BeanUtils.copyProperties(item, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(item.getCheckTime()));
        return dto;
    }

    private DetectItemSingleDTO transformSingle(DetectItem item) {
        DetectItemSingleDTO dto = DetectItemSingleDTO.builder().build();
        BeanUtils.copyProperties(item, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(item.getCheckTime()));
        return dto;
    }

    private DetectItemMultipleDTO transformMultiple(DetectItem item) {
        DetectItemMultipleDTO dto = DetectItemMultipleDTO.builder().build();
        BeanUtils.copyProperties(item, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(item.getCheckTime()));
        return dto;
    }

    private DetectItemMultipleSingleDTO transformMultipleSingle(DetectItem item) {
        DetectItemMultipleSingleDTO dto = DetectItemMultipleSingleDTO.builder().build();
        BeanUtils.copyProperties(item, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(item.getCheckTime()));
        return dto;
    }

    private DetectItemOutcomeDTO transformOutcome(DetectItem item) {
        DetectItemOutcomeDTO dto = DetectItemOutcomeDTO.builder().build();
        BeanUtils.copyProperties(item, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(item.getCheckTime()));
        return dto;
    }

}
