package com.nickel.medicalrecord.util;

import org.springframework.util.DigestUtils;

public class MD5Util {

    public static String getMD5(String str) {
        return DigestUtils.md5DigestAsHex(str.getBytes()).toUpperCase();
    }

}
