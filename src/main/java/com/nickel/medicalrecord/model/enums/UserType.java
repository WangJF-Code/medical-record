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
 * @ClassName UserType
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/18 20:46
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
public enum UserType {

    SYS(0, "系统用户"),
    NORMAL(1, "普通用户"),
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
