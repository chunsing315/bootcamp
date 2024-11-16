package com.bootcamp.yh_finance.config;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bootcamp.yh_finance.entity.StockEntity;
import com.bootcamp.yh_finance.model.Mapper;
import com.bootcamp.yh_finance.service.StockSymbolService;
import com.bootcamp.yh_finance.util.UrlManager;

@Configuration
@ComponentScan(basePackages = "com.bootcamp.yh_finance")
public class AppRunner implements CommandLineRunner {

    @Autowired
    private Mapper mapper;

    @Autowired
    private StockSymbolService stockSymbolService;


    @Value("${api.yahoofinance.endpoint.quote}")
    private String endpoint;
    
    @Value("${api.yahoofinance.domain.address}")
    private String domain;

    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Server started");
        String[] stocks = new String[] { "0388.HK", "0700.HK", "0005.HK" };
        List<StockEntity> stockEntityList = Arrays.stream(stocks)//
                .map(s -> mapper.map(s))
                .collect(Collectors.toList());
        this.stockSymbolService.saveAll(stockEntityList);
        UrlManager urlManager = new UrlManager();
        System.out.println("url: "+ urlManager.getUrl(domain,endpoint));
        System.out.println("Server saved all stock symbols...");

    }
}