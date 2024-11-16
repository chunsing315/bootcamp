package com.bootcamp.yh_finance.util;

import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class UrlManager {

    
    // @PostConstruct
    public String getUrl(String domain, String endpoint) {
        return UriComponentsBuilder.newInstance()//
                .scheme(Scheme.HTTPS.getScheme())
                .host(domain)
                .path(endpoint)
                .build()
                .toUriString();
    }
}
