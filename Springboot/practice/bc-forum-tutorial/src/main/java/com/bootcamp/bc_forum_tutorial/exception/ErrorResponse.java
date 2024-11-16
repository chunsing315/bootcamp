package com.bootcamp.bc_forum_tutorial.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Builder

public class ErrorResponse {
    private int code;
    private String message;


}
