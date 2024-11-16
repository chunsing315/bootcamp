package com.bootcamp.yh_finance.infra;

import org.springframework.stereotype.Component;

@Component
public class YahooFinance {
    public static final String DOMAIN = "fc.yahoo.com";
    public static final String CRUMB_DOMAIN = "query1.finance.yahoo.com";

    public static final String VERSION_CRUMB = "v1";
    public static final String ENDPOINT_CRUMB = "v1";

    public static final String VERSION_QUOTE = "v7";
    public static final String ENDPOINT_QUOTE = "finance/quote";
}
