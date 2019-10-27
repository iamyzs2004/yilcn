package com.yilcn.service1.mapper;

import com.yilcn.service1.vo.OrderInfo;

public interface OrderInfoMapper {
    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);
}