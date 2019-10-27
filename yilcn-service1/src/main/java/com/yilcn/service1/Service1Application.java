package com.yilcn.service1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
 
@SpringBootApplication 
@EnableEurekaClient
@MapperScan(basePackages = {"com.yilcn.service1.mapper"})
@EnableFeignClients(basePackages = "com.yilcn.controller.client") 
@EnableDistributedTransaction
public class Service1Application {

	public static void main(String[] args) {
		 SpringApplication.run(Service1Application.class, args);

	}

}
