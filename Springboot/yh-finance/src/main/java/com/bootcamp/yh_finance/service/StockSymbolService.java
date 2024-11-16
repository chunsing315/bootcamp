package com.bootcamp.yh_finance.service;

import java.util.List;

import com.bootcamp.yh_finance.entity.StockEntity;

public interface StockSymbolService {

    List<StockEntity> saveAll(List<StockEntity> symbolsList);

    void deleteAll();
}
