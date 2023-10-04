package com.example.stock.stockInfo.application.queryservice;

import com.example.stock.stockInfo.domain.model.queries.StocksQuery;
import com.example.stock.stockInfo.domain.service.GetStockInfoFactory;
import com.example.stock.stockInfo.domain.service.GetStockInfoStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockQueryService {

    private final GetStockInfoFactory getStockInfoFactory;

    public void getStockInfo(StocksQuery stocksQuery){

        GetStockInfoStrategy stockInfoStrategy = getStockInfoFactory.findStrategy(
            stocksQuery.getStockSearchType()
        );

    }

}
