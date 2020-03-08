package com.atguigu.mybalancerule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2020-03-08 19:11
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        //定义为随机
        return new RandomRule();
    }

}
