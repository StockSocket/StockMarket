package com.example.stock.stockInfo.domain.service;

import static com.example.stock.constants.ResponseCode.INVALID_REQUEST;

import com.example.stock.exception.ApiException;
import com.example.stock.stockInfo.constants.StockSearchType;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetStockInfoFactory {

    private final Map<StockSearchType, GetStockInfoStrategy> findStockInfoStrategy;

    @Autowired
    public GetStockInfoFactory(Set<GetStockInfoStrategy> getStockInfoStrategySet) {
        this.findStockInfoStrategy = Maps.newHashMap();
        getStockInfoStrategySet.forEach(strategy -> strategy.getChangeReqCode()
            .forEach(changeReqCode -> findStockInfoStrategy.put(changeReqCode, strategy)));
    }

    public GetStockInfoStrategy findStrategy(StockSearchType stockSearchType) {
        validateMethod(stockSearchType);
        return findStockInfoStrategy.get(stockSearchType);
    }

    private void validateMethod(StockSearchType stockSearchType) {
        if (!findStockInfoStrategy.containsKey(stockSearchType)) {
            throw new ApiException(INVALID_REQUEST);
        }
    }
}
