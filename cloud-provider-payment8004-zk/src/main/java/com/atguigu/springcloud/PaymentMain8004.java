package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用 Zookeeper 作为注册中心
 *
 * @author GuofanLee
 * @date 2020-03-07 16:45
 */
@EnableDiscoveryClient          //该注解用于向使用 Zookeeper、Consul 作为注册中心时注册服务
@SpringBootApplication
public class PaymentMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }

}
