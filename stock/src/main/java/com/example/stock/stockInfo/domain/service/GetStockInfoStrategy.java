package com.example.stock.stockInfo.domain.service;

import com.example.stock.stockInfo.constants.StockSearchType;
import java.util.List;

public interface GetStockInfoStrategy {

    List<StockSearchType> getChangeReqCode();
    // void changeGiftStatus(GiftStatusChangeCommand command, String customerId);


}
