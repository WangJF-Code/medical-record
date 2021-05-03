package com.nickel.medicalrecord.model.enums;

import com.nickel.medicalrecord.model.CommonOptions;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum DetectItemType {

    /**
     * 检测类型:
     * 101-血沉,102-糖化血红蛋白;
     * 201-经颅多普勒检查, 202-颅内血管高分辨磁共振成像(HMR), 203-尿流动力学检查, 204-下肢静脉血管超声;
     * 301-颅脑核磁共振(MRI);
     * 401-颈部血管彩超检查, 402-锁骨下动脉彩超检查, 403-磁共振血管成像(MRA), 404-磁共振弥散成像（DWI）, 405-CT 血管造影(CTA), 406-CT灌注成像（CTP）;
     * 501-24小时心电监测（Holter）, 502-心脏超声, 503-颅脑计算机 X 线体层摄影(CT), 504-磁共振灌注成像(ASL), 505-磁共振(DTI), 506-眼底OCTA, 507-眼底照相;
     */
    NAME101(101, "血沉"),
    NAME102(102, "糖化血红蛋白"),
    NAME201(201, "经颅多普勒检查"),
    NAME202(202, "颅内血管高分辨磁共振成像(HMR)"),
    NAME203(203, "尿流动力学检查"),
    NAME204(204, "下肢静脉血管超声"),
    NAME301(301, "颅脑核磁共振(MRI)"),
    NAME401(401, "颈部血管彩超检查"),
    NAME402(402, "锁骨下动脉彩超检查"),
    NAME403(403, "磁共振血管成像(MRA)"),
    NAME404(404, "磁共振弥散成像(DWI)"),
    NAME405(405, "CT 血管造影(CTA)"),
    NAME406(406, "CT灌注成像(CTP)"),
    NAME501(501, "24小时心电监测(Holter)"),
    NAME502(502, "心脏超声"),
    NAME503(503, "颅脑计算机 X 线体层摄影(CT)"),
    NAME504(504, "磁共振灌注成像(ASL)"),
    NAME505(505, "磁共振(DTI)"),
    NAME506(506, "眼底OCTA"),
    NAME507(507, "眼底照相"),
    ;

    private final int code;
    private final String description;

    public static List<CommonOptions> list() {
        return Arrays.stream(LivingStatus.values())
                .map(alarmType -> CommonOptions.builder()
                        .value(alarmType.getCode())
                        .label(alarmType.getDescription())
                        .build())
                .collect(Collectors.toList());
    }

}
