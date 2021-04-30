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
 * @ClassName IncomeType
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/18 20:39
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
public enum IncomeType {

    LESS_FIVE_HUNDRED(1, "小于500"),
    ONE_THOUSAND(2, "500~1000"),
    THREE_THOUSAND(3, "1001~3000"),
    FIVE_THOUSAND(4, "3001~5000"),
    MORE_FIVE_THOUSAND(5, "大于5000"),
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
