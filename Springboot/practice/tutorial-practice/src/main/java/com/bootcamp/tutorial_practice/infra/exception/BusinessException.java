package com.bootcamp.tutorial_practice.infra.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
    private int code;

    public BusinessException(ErrorCode errorCode) {
        /* calling the constructor downstairs */
        this(errorCode.getCode(),errorCode.getMessage());
        // super(errorCode.getMessage());
        // this.code = errorCode.getCode();
    }

    // private BusinessException(String message) {
    //     super(message);
    // }

    private BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

}
