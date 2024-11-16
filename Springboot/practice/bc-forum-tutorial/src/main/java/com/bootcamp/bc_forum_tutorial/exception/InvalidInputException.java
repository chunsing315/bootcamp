package com.bootcamp.bc_forum_tutorial.exception;

public class InvalidInputException extends NumberFormatException{
    public InvalidInputException (String message){
        super(message);
    }    
}
