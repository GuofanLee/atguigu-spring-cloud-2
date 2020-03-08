package com.atguigu.springcloud;

import com.atguigu.mybalancerule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2020-03-06 14:50
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "cloud-payment-service", configuration = MySelfRule.class)
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

}
