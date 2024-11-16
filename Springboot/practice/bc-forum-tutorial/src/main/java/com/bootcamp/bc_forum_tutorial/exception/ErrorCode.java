package com.bootcamp.bc_forum_tutorial.exception;

import lombok.Getter;

@Getter

public enum ErrorCode {
    USER_NOT_FOUND(1, "user not exist."),
    POST_NOT_FOUNG(2, "Post not found."),
    COMMENT_NOT_FOUND(3, "comment not exist."),
    EMAIL_NOT_FOUND(4, "User email not exist."),
    MOBILE_NOT_FOUND(5, "Mobile not exist."),
    ILLEGAL_INPUT(6,"Illegal input"),
    RUNTIME_ERROR(7,"runtime error"),
    UNKNOWN_ERROR(8,"unknown error.")
    ;

    private int code;
    private String message;

    private ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
