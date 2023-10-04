package com.example.stock.exception;

import static com.example.stock.constants.ResponseCode.INVALID_SEARCH_TYPE;

public class InvalidStockSearchTypeException extends BusinessException {

    public InvalidStockSearchTypeException() {
        super(INVALID_SEARCH_TYPE);
    }
}

