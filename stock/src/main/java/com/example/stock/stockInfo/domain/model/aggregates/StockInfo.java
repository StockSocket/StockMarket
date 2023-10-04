package com.example.stock.stockInfo.domain.model.aggregates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@AllArgsConstructor
@Builder
@Table(name = "stock_info")
public class StockInfo {

    @Id
    @GeneratedValue
    @Column(name = "stock_no")
    private int stock_no;

    @Column(name = "stock_code")
    private String stockCode;

    @Column(name = "stock_name")
    private String stockName;

    @Column(name = "stock_price")
    private Integer stockPrice;

    @Column(name = "stock_end_price")
    private Integer stockEndPrice;

    @Column(name = "stock_count")
    private Integer stockCount;

    @Column(name = "stock_trade_amount")
    private Integer stockTradeAmount;

}
