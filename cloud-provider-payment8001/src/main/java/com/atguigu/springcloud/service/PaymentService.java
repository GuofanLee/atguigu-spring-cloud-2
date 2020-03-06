package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2020-03-06 00:14
 */
public interface PaymentService {

    int add(Payment payment);

    Payment getPaymentById(Long id);

}
