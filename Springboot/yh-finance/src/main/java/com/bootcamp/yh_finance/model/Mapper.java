package com.bootcamp.yh_finance.model;

import org.springframework.stereotype.Component;

import com.bootcamp.yh_finance.entity.StockEntity;

@Component
public class Mapper {
    public StockEntity map(String stock) {
        return StockEntity.builder()
                .symbol(stock)
                .build();
    }
}
