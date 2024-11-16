package com.bootcamp.bc_forum_tutorial.exception;

public class UserNotFindException extends IllegalArgumentException {
    public UserNotFindException(String messgage) {
        super(messgage);
    }
}
