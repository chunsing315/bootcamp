package com.bootcamp.yh_finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.yh_finance.entity.StockEntity;

public interface StockSymbolRepository extends JpaRepository<StockEntity,Long>{
    
}
