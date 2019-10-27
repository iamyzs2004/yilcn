package com.yilcn.service1.vo;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class OrderInfo {
    private String userid;

    private String orderid;

    private String productid;

    private BigDecimal productprice;

    private Integer salesum;

    
}