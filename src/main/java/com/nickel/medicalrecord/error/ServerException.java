package com.nickel.medicalrecord.error;

import lombok.Data;

@Data
public class ServerException extends Exception {

    private final int code;
    private final String message;

    public ServerException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

}