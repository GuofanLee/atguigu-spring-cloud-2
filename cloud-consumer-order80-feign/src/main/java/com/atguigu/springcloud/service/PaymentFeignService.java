package com.atguigu.springcloud.service;

import com.atguigu.springcloud.api.PaymentApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2020-03-09 00:51
 */
@FeignClient("cloud-payment-service")
public interface PaymentFeignService extends PaymentApi {

}
