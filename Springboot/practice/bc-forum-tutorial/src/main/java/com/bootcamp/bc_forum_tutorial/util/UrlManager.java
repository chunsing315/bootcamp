package com.bootcamp.bc_forum_tutorial.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import com.bootcamp.bc_forum_tutorial.model.Scheme;

@Component
public class UrlManager {

    @Value("${api.jsonplaceholder.domain}")
    private String domain;
    
    public String getUrl(String endpoint) {
        return UriComponentsBuilder.newInstance()
            .scheme(Scheme.HTTPS.name().toLowerCase())
            .host(domain)
            .path(endpoint)
            .build()
            .toUriString();
    }
}
