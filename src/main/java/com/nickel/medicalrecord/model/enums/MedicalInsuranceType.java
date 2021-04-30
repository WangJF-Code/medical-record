package com.nickel.medicalrecord.model.enums;

import com.nickel.medicalrecord.model.CommonOptions;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 类描述：
 *
 * @ClassName MedicalInsuranceType
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/18 20:31
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
public enum MedicalInsuranceType {

    URBAN_WORKERS(1, "城镇职工基本医疗保险"),
    NEW_TOWNSPEOPLE(2, "新城镇居民基本医疗保险"),
    NEW_RURAL(3, "新农村合作医疗"),
    POVERTY_RELIEF(4, "贫困救助"),
    COMMERCIAL_MEDICAL(5, "商业医疗保险"),
    PUBLIC_EXPENSE(6, "全公费"),
    OWN_EXPENSE(7, "全自费"),
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
