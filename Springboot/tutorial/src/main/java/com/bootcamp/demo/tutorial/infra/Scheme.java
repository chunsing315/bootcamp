package com.bootcamp.demo.tutorial.infra;

import lombok.Getter;

@Getter
public enum Scheme {
    HTTP("http://"),HTTPS("https://"),;

    private String protocol;

    private Scheme(String protocol){
        this.protocol = protocol;
    }
}
