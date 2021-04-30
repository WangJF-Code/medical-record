package com.nickel.medicalrecord.util;


import com.nickel.medicalrecord.error.ServerException;
import com.nickel.medicalrecord.model.api.ApiCode;
import com.nickel.medicalrecord.model.api.ApiResult;

public class ApiResultUtil {

    public static ApiResult okay() {
        return result(ApiCode.OKAY, ApiCode.OKAY_MSG, null);
    }

    public static <T> ApiResult<T> okay(T data) {
        return result(ApiCode.OKAY, ApiCode.OKAY_MSG, data);
    }

    public static <T> ApiResult<T> result(int code, String message, T data) {
        ApiResult<T> result = new ApiResult<>();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static ApiResult error(ServerException exception) {
        return result(exception.getCode(), exception.getMessage(), null);
    }

}
