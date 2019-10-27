# yilcn
spring cloud , tx lcn 结合的demo

一、sql文件
txlcn需要的：/yilcn-tm/src/main/resources/tx-manager.sql 

业务需要的：yilcn-service1/src/main/resources/yilcn.sql

二.服务启动顺序
1.安装mysql,redis，并启动
2.按yilcn-eurakaserver,yilcn-tm,yilan-service1,yilan-service2顺序启动
3.运行测试类yilan-service1项目里的OrderTest
