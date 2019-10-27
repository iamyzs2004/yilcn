package com.yilcn.service2.mapper;

import com.yilcn.service2.vo.MoneyInfo;

public interface MoneyInfoMapper {
    int insert(MoneyInfo record);

    int insertSelective(MoneyInfo record);
}