package com.shop.item;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
* 通用common_item
* */
@SpringBootApplication//(exclude= {DataSourceAutoConfiguration.class})
//@EnableEurekaClient //only support eurekaClient register
@EnableDiscoveryClient //support Eureka and ZooKeeper
@MapperScan(basePackages = {"com.shop.mapper"})
public class CommonItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonItemApplication.class);
    }
}
