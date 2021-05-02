package com.nickel.medicalrecord.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * 类描述：
 *
 * @ClassName DateTimeUtil
 * @Description TODO
 * @Author WangJF
 * @Date 2021/5/2 15:10
 * @Version 1.0
 */
public class DateTimeUtil {

    public static final DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String timestampToString(Long timestamp) {
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(timestamp / 1000, 0, ZoneOffset.ofHours(8));
        return localDateTime.format(datetimeformatter);
    }

    public static Long stringToTimestamp(String dateTimeStr) {
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, datetimeformatter);
        return localDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
    }

}
