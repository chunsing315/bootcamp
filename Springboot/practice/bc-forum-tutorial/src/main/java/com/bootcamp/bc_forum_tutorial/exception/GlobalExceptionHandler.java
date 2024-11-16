package com.bootcamp.bc_forum_tutorial.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ UserNotFindException.class })
    @ResponseStatus(HttpStatus.NOT_FOUND) // 404
    public ErrorResponse handleUserNotFindException() {
        return ErrorResponse.builder()//
                .code(ErrorCode.USER_NOT_FOUND.getCode())//
                .message(ErrorCode.USER_NOT_FOUND.getMessage())//
                .build();
    }

    @ExceptionHandler({ NumberFormatException.class })
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ErrorResponse handleInvalidInputExpcetion() {
        return ErrorResponse.builder()
                .code(ErrorCode.ILLEGAL_INPUT.getCode())
                .message(ErrorCode.ILLEGAL_INPUT.getMessage())
                .build();
    }

    @ExceptionHandler({ RuntimeException.class })
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleRuntimeExpcetion() {
        return ErrorResponse.builder()
                .code(ErrorCode.RUNTIME_ERROR.getCode())
                .message(ErrorCode.RUNTIME_ERROR.getMessage())
                .build();
    }
    @ExceptionHandler({Exception.class })
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleExpcetion() {
        return ErrorResponse.builder()
                .code(ErrorCode.UNKNOWN_ERROR.getCode())
                .message(ErrorCode.UNKNOWN_ERROR.getMessage())
                .build();
    }

}
