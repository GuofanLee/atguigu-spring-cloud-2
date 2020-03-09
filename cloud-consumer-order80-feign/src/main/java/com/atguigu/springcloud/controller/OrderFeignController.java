package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2020-03-09 01:07
 */
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("consumer/payment/create")
    public CommonResult<Integer> create(Payment payment) {
        return paymentFeignService.add(payment);
    }

    @GetMapping("consumer/payment/feign/timeout")
    public String paymentFeignTimeOut() {
        return paymentFeignService.paymentFeignTimeOut();
    }

}
