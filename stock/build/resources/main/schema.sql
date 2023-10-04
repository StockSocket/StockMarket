use `stock`;

DROP TABLE IF EXISTS stock.stock_info;

create table if not exists stock.stock_info
(
    stock_no           int comment '주식ID',
    stock_code         varchar(10) comment '주식구분코드',
    stock_name         varchar(10) comment '주식명',
    stock_price        int comment '주식가격',
    stock_end_price    int comment '주식시장마감가격',
    stock_count        int comment '주식조회수',
    stock_trade_amount int comment '주식거래량',
    primary key (stock_no)
) comment ='주식정보';