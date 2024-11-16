package com.bootcamp.tutorial_practice.infra.exception;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class checker {
    public Boolean isValidId(String id, Long limit) {

        if (Long.valueOf(id) <= 0L) {
            throw new NonPositiveLongException("ID cannot be less than 1: " + id);
        }
        ;
        if (Long.valueOf(id) >= limit) {
            throw new NoSuchElementException("User not found with userID: " + id);
        }
        return true;
    }
}
