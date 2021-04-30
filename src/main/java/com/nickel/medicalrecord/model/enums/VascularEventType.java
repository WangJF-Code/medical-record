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
 * @ClassName VascularEventType
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 18:51
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
public enum VascularEventType {

    JZXNGS(1, "进展性脑梗死"),
    ZFXNGS(2, "再发脑梗死"),
    NCX(3, "脑出血"),
    ZWMXQCX(4, "蛛网膜下腔出血"),
    GSHCXZH(5, "梗死后出血转化"),
    XJT(6, "心绞痛"),
    XJGS(7, "心肌梗死"),
    ZWDMSJ(8, "周围动脉事件"),
    XZSJMSJ(9, "下肢深静脉事件"),
    FBGR(10, "肺部感染"),
    MNXTGR(11, "泌尿系感染"),
    YJXKY(12, "应激性溃疡"),
    YC(13, "压疮"),
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
