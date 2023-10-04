package com.example.stock.stockInfo.domain.model.queries;

import com.example.stock.stockInfo.constants.StockSearchType;
import java.awt.print.Pageable;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StocksQuery {

    private StockSearchType stockSearchType;
    private Pageable pageable;
}
