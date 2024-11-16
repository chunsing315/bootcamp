package com.bootcamp.demo.tutorial.infra;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.Getter;

@Configuration
public class ApiUtil {
    @Value("${api.url.domain}") // before server start, base on the path, scan application.yml
    String domain;

    public String getUrl(Scheme scheme, String endpoint) {
        return UriComponentsBuilder.newInstance()
                .scheme(scheme.name())
                .host(domain)
                .path(endpoint)
                .build(true) //encode false
                .toUriString();
    }

    // public String getUrl(Scheme scheme, String endpoint, Map<String,String> requestParam) {
    //     return UriComponentsBuilder.newInstance()
    //             .scheme(scheme.name())
    //             .host(domain)
    //             .path(endpoint)
    //             .queryParam("",requestParam.get(""), )
    //             .toUriString();
    // }

}
