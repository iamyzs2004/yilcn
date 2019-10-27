package com.yilcn.service1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yilcn.service1.mapper.OrderInfoMapper;
import com.yilcn.service1.vo.OrderInfo;
 

@Service
public class OrderService {

	@Autowired
	OrderInfoMapper orderMapper;
	
	public void createOrder(OrderInfo order) {
		orderMapper.insert(order);
	}
}
