package com.bootcamp.bc_forum_tutorial.model;

import lombok.Getter;

@Getter
public enum Scheme {
    HTTP("http"), //
    HTTPS("https"), //
    ;

    private String protocol;

    private Scheme(String protocol) {
        this.protocol = protocol;
    }
}
