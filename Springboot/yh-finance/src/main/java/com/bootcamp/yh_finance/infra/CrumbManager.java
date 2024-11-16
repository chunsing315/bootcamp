package com.bootcamp.yh_finance.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class CrumbManager {
    private CookieManager cookieManager;
    @Autowired
    private RestTemplate restTemplate;

    public CrumbManager(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.cookieManager = new CookieManager(restTemplate);
    }

    public String getCrumb() {
        String cookie = this.cookieManager.getCookies();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Cookie", cookie);
        headers.add("User-Agent", "Mozilla/5.0")
        HttpEntity<String> entity = new HttpEntity<>(headers);
        return restTemplate
                .exchange("https://query1.finance.yahoocom/v1/test/getcrumb",
                        HttpMethod.GET,
                        entity,
                        String.class)
                .getBody();
    }
}