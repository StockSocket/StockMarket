package com.example.stock.stockInfo.constants;

import com.example.stock.exception.InvalidStockSearchTypeException;
import com.google.common.collect.ImmutableMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Getter;

@Getter
public enum StockSearchType {
    POPULAR("P", "인기"),
    INCREASE("I", "상승"),
    DEGRADATION("D", "하락"),
    TRADING_VOLUME("T", "거래량");

    private final String code;
    private final String typeName;

    private static final ImmutableMap<String, StockSearchType> codes = ImmutableMap.copyOf(
        Stream.of(values())
            .collect(Collectors.toMap(StockSearchType::getCode, Function.identity())));

    StockSearchType(String code,
        String typeName) {
        this.code = code;
        this.typeName = typeName;
    }

    public static StockSearchType findByCode(final String value) {
        if (!codes.containsKey(value)) {
            throw new InvalidStockSearchTypeException();
        }
        return codes.get(value);
    }
}
