package com.example.stock.stockInfo.domain.repository;

import com.example.stock.stockInfo.domain.model.aggregates.StockInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StockInfoCustomRepository {

    Page<StockInfo> getStockInfo(Pageable pageable);
}
