package com.yilcn.service2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
 
@SpringBootApplication 
@EnableEurekaClient
@MapperScan(basePackages = {"com.yilcn.service2.mapper"})
@EnableDistributedTransaction
public class Service2Application {

	public static void main(String[] args) {
		 SpringApplication.run(Service2Application.class, args);

	}

}
