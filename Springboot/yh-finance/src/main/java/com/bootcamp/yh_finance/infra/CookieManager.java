package com.bootcamp.yh_finance.infra;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.bootcamp.yh_finance.util.Scheme;

@Component
public class CookieManager {
    private final String DOMAIN = "fc.yahoo.com";
    private final String VERSION_QUOTE = "v7";
    private final String GET_CRUMB = "v1/test/getcrumb";
    private final String HOSTCODE = "query1.finance.yahoo.com/";

    RestTemplate restTemplate;

    public CookieManager(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<String> getResponseEntity() {
        String getCrumbUrl = UriComponentsBuilder.newInstance()
                .scheme(Scheme.HTTPS.name().toLowerCase())
                .host(YahooFinance.DOMAIN)
                .path(YahooFinance.CRUMB_DOMAIN)
                .toUriString();
        return restTemplate.getForEntity(getCrumbUrl, String.class);
    }

    public String getCrumbString() {
        return this.getResponseEntity().getBody();
    }

    // public String getCookies(){
    // try {
    // List<String> cookies =
    // this.getResponseEntity().getHeaders().get("Set-Cookie");
    // return cookies != null ? cookies.get(0).split(";")[0] :null;
    // } catch {

    // }
}
