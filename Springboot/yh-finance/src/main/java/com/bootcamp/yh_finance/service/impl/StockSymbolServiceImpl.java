package com.bootcamp.yh_finance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.yh_finance.entity.StockEntity;
import com.bootcamp.yh_finance.repository.StockSymbolRepository;
import com.bootcamp.yh_finance.service.StockSymbolService;

@Service
public class StockSymbolServiceImpl implements StockSymbolService {

    @Autowired
    StockSymbolRepository stockSymbolRepository;

    @Override
    public List<StockEntity> saveAll(List<StockEntity> symbolsList) {
        return stockSymbolRepository.saveAll(symbolsList);
    };

    @Override
    public void deleteAll() {
        stockSymbolRepository.deleteAll();
    }
}
