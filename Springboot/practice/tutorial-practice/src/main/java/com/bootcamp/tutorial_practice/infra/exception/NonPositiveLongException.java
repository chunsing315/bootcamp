package com.bootcamp.tutorial_practice.infra.exception;

public class NonPositiveLongException extends RuntimeException {
    public NonPositiveLongException(String message){
        super(message);
    }
}
