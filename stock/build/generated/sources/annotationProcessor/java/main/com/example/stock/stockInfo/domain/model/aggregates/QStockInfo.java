package com.example.stock.stockInfo.domain.model.aggregates;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QStockInfo is a Querydsl query type for StockInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStockInfo extends EntityPathBase<StockInfo> {

    private static final long serialVersionUID = -1077961754L;

    public static final QStockInfo stockInfo = new QStockInfo("stockInfo");

    public final NumberPath<Integer> stock_no = createNumber("stock_no", Integer.class);

    public final StringPath stockCode = createString("stockCode");

    public final NumberPath<Integer> stockCount = createNumber("stockCount", Integer.class);

    public final NumberPath<Integer> stockEndPrice = createNumber("stockEndPrice", Integer.class);

    public final StringPath stockName = createString("stockName");

    public final NumberPath<Integer> stockPrice = createNumber("stockPrice", Integer.class);

    public final NumberPath<Integer> stockTradeAmount = createNumber("stockTradeAmount", Integer.class);

    public QStockInfo(String variable) {
        super(StockInfo.class, forVariable(variable));
    }

    public QStockInfo(Path<? extends StockInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStockInfo(PathMetadata metadata) {
        super(StockInfo.class, metadata);
    }

}

