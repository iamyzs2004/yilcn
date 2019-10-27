package com.yilcn.service2.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.yilcn.service2.service.MoneyService;
import com.yilcn.service2.vo.MoneyInfo;

@RequestMapping("/money")
@RestController
public class MoneyController {

	
	@Autowired
	MoneyService moneyService;
	
	@PostMapping("/reduce") 
	@Transactional
    @LcnTransaction
    public String reduceMoney(){
        String res ="success";
        MoneyInfo money = new MoneyInfo();
        
        money.setUserid("u1");
        money.setMoney(new BigDecimal("1"));
        int i =1/0;
        	moneyService.reduce(money);
        
        return res;
    }
}
