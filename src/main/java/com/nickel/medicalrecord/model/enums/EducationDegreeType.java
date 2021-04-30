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
 * @ClassName EducationDegreeType
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/18 20:21
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
public enum EducationDegreeType {

    PRIMARY_SCHOOL(1, "小学"),
    JUNIOR_HIGH_SCHOOL(2, "初中"),
    HIGH_SCHOOL(3, "中专/高中"),
    UNIVERSITY(4, "大专/大本"),
    MASTER(5, "硕士及以上"),
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
