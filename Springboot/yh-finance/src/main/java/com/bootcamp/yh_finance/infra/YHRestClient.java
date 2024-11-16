package com.bootcamp.yh_finance.infra;

import java.time.Duration;
import java.util.List;

import org.apache.hc.client5.http.cookie.BasicCookieStore;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.bootcamp.yh_finance.dto.YahooQuoteDTO;
import com.bootcamp.yh_finance.util.Scheme;
import com.fasterxml.jackson.databind.ObjectMapper;

// https://query1.finance.yahoo.com/v7/finance/quote?symbols=0388.HK&crumb=Fw1kjYJa8sP
public class YHRestClient {
    private static final String USER_AGENT = "Mozilla/5.0";
    private RestTemplate restTemplate;
    private CrumbManager crumbManager;
    private BasicCookieStore cookieStore;

    public YHRestClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.cookieStore = new BasicCookieStore();
        CloseableHttpClient httpClient = HttpClients.custom()
                .setDefaultCookieStore(this.cookieStore)
                .build();

        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setHttpClient(httpClient);

        this.restTemplate = new RestTemplateBuilder()
            .setConnectTimeout(Duration.of(10,"Second"));
    }

    public YahooQuoteDTO getQuote(List<String> symbols) {
        String crumb = crumbManager.getCrumb();
        String url = UriComponentsBuilder.newInstance()
                .host(Scheme.HTTPS.name().toLowerCase())
                .path(YahooFinance.DOMAIN)
                .path(YahooFinance.VERSION_QUOTE)
                .queryParam("symbols", List.of(String.join(',', symbols)))
                .queryParam("crumb", crumb).toUriString;

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return new ObjectMapper().readValue(response.getBody(), YahooQuoteDTO.class);
    }
    private static class UserAgentInterceptor implements ClientHttpRequestInterceptor{
        private final String userAgent;

        public UserAgentInterceptor(){

        }
    }

}
