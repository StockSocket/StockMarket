package com.example.stock.stockInfo.infrastructure;

import static com.example.stock.stockInfo.domain.model.aggregates.QStockInfo.stockInfo;

import com.example.stock.stockInfo.domain.model.aggregates.StockInfo;
import com.example.stock.stockInfo.domain.repository.StockInfoCustomRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class StockInfoCustomRepositoryImpl extends QuerydslRepositorySupport implements
    StockInfoCustomRepository {


    private final JPAQueryFactory jpaQueryFactory;

    @Autowired
    public StockInfoCustomRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        super(StockInfoCustomRepositoryImpl.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }


    @Override
    public Page<StockInfo> getStockInfo(Pageable pageable) {

        List<StockInfo> content = jpaQueryFactory
            .selectFrom(stockInfo)
            .offset(pageable.getOffset())
            .limit(pageable.getPageSize())
            .fetch();

        List<StockInfo> countList = jpaQueryFactory
            .selectFrom(stockInfo)
            .fetch();
        return new PageImpl<>(content, pageable, countList.size());
    }
}


































