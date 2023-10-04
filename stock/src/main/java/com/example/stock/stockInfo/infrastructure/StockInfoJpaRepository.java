package com.example.stock.stockInfo.infrastructure;

import com.example.stock.stockInfo.domain.model.aggregates.StockInfo;
import com.example.stock.stockInfo.domain.repository.StockInfoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockInfoJpaRepository extends JpaRepository<StockInfo, Integer>,
    StockInfoRepository {

}
