package com.bootcamp.tutorial_practice.infra.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    /* Review here: */
    OK(100,"Response OK."),
    CANNOT_LOGIN(200,"cannot login."),
    API_ERROR(500,"third part api error"),
    USER_ID_NOT_FOUND(404, "User ID Not Found"),
    BAD_INPUT(2, "Bad Input Type. Check Input Type."),
    LESS_THAN_ONE_INT(3, "ID Is Greater Than Zero"),
    BUSINESS_EXCEPTION(600,"Business Exception.")
    ;

    private int code;
    private String message;
    
    /* private for enum, no one can declare enum */
    private ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
