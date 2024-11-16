package com.bootcamp.tutorial_practice.infra;

import java.util.List;

import com.bootcamp.tutorial_practice.model.User;

import ch.qos.logback.core.pattern.color.GreenCompositeConverter;

// AKA API response
public class GeneralResponse<T> {
    private String code;
    private String message;
    private List<T> data;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public List<T> getData() {
        return data;
    }

    // static has to define <T>
    public static <U> Builder<U> builder() {
        return new Builder<>();
    }

    private GeneralResponse(Builder<T> builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.data = builder.data;
    }

    public static class Builder<T> {
        private String code;
        private String message;
        private List<T> data;

        public Builder<T> code(String code) {
            this.code = code;
            return this;
        }

        public Builder<T> message(String message) {
            this.message = message;
            return this;
        }

        public Builder<T> data(List<T> data) {
            this.data = data;
            return this;
        }

        public GeneralResponse<T> build() {
            return new GeneralResponse<>(this);
        }
    }
    @Override
    public String toString(){
        return "GeneralResponse( "//
        +"code" +this.code //
        +"message " + this.message //
        +"data " +this.data//
        +")";
    }

    public static void main(String[] args) {
        // .<User> builder () --> define <U>
        GeneralResponse<User> response = GeneralResponse.<User>builder() // define the Type of static method with Generic
                .code("00000")
                .message("Success.")
                .data(List.of(new User()))
                .build();
        System.out.println(response);
    }
}
