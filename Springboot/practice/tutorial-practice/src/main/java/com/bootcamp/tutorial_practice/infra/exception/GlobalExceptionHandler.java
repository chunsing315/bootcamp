package com.bootcamp.tutorial_practice.infra.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bootcamp.tutorial_practice.infra.GeneralResponse;

/* 
 * Happy flow: A > B > C = return >B >A
 * Throw flow: A>B>C = throw exception > B handle exception or > A handle exception
 * Spring throw flow: A>B>C = throw => Catcher handler
 * 
 * this is like a space, every thrown will pass through here
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    // Try to catch
    @ExceptionHandler(BusinessException.class)
    public ErrorResponse businessExceptionHandler2(ErrorCode errorCode) {
        return ErrorResponse.builder()
                .code(errorCode.getCode())
                .message(errorCode.getMessage())
                .build();
    }

    // This is like a catch of the last resort
    // @ExceptionHandler(Exception.class)
    // public ErrorResponse businessExceptionHandler(BusinessException e) {
    //     return ErrorResponse.builder()
    //             .code(e.getCode())
    //             .message(e.getMessage())
    //             .build();
    // }

    @ExceptionHandler(Exception.class)
    public GeneralResponse<Object> exceptionHandler (Exception e) {
        return GeneralResponse.<Object>builder()
                .code("900000")
                .message("Fail.")
                //.data(List.of())
                .data(new ArrayList<>())
                .build();
    }
}
