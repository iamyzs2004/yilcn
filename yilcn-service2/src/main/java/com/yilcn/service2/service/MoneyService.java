package com.yilcn.service2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yilcn.service2.mapper.MoneyInfoMapper;
import com.yilcn.service2.vo.MoneyInfo;

@Service
public class MoneyService {

	@Autowired
	MoneyInfoMapper moneyMapper;
	
	public void reduce(MoneyInfo moeny) {
		moneyMapper.insert(moeny);
	}
}
