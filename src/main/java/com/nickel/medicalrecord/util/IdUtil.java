package com.nickel.medicalrecord.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IdUtil {

    public static String getUserId(String head, int num) {
        String numStr = String.valueOf(num + 1);
        StringBuffer sb = new StringBuffer(head);
        sb.append(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        for (int i = numStr.length(); i < 4; i++) {
            sb.append("0");
        }
        sb.append(numStr);
        return sb.toString();
    }

    public static String getToday(String head) {
        StringBuffer sb = new StringBuffer(head);
        sb.append(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        return sb.toString();
    }

}
