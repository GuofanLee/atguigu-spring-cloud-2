package com.atguigu.springcloud.api;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.*;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2020-03-09 15:15
 */
@RequestMapping("payment")
public interface PaymentApi {

    @PostMapping("add")
    CommonResult<Integer> add(@RequestBody Payment payment);

    @GetMapping("get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("discovery")
    Object discovery();

    @GetMapping("feign/timeout")
    String paymentFeignTimeOut();

}
