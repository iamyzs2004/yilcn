package com.yilcn.service1.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.yilcn.controller.client.IMoneyInfoClient;
import com.yilcn.service1.service.OrderService;
import com.yilcn.service1.vo.OrderInfo;
import com.yilcn.service2.vo.MoneyInfo;
/**
 * 
 * @author Administrator
 *
 */
@RequestMapping("/order")
@RestController
public class OrderController {

	
	@Autowired
	OrderService orderService;
	@Autowired
	IMoneyInfoClient service2Client;
	
	@PostMapping("/create")
	@LcnTransaction
    @Transactional(rollbackFor = Exception.class)
    public String createOrder(){
        String res ="success";
        OrderInfo order = new OrderInfo();
        order.setOrderid("o1"); 
        order.setProductid("p1");
        order.setProductprice(new BigDecimal(10));
        order.setSalesum(2);
        order.setUserid("u1");
        
        	 orderService.createOrder(order);
        	 MoneyInfo money = new MoneyInfo();
        	 money.setUserid("u1");
        	 money.setMoney(new BigDecimal("1"));
        	 service2Client.reduce(money);
         
        return res;
    }
}
