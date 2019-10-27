package com.yilcn.controller.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.yilcn.service2.vo.MoneyInfo;

@FeignClient(name = IMoneyInfoClient.SERVICE_ID)
public interface IMoneyInfoClient {
	
	String SERVICE_ID="yilcn-service2";

	@PostMapping("/money/reduce")
	public String reduce(MoneyInfo money);
}
