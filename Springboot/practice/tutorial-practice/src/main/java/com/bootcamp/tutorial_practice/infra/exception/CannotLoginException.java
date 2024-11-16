package com.bootcamp.tutorial_practice.infra.exception;

public class CannotLoginException extends RuntimeException {
    private int code;

    public CannotLoginException(ErrorCode errorCode) {
        this(errorCode.getCode(), errorCode.getMessage());

    };

    private CannotLoginException(int code, String message) {
        super(message);
        this.code = code;
    }

}
