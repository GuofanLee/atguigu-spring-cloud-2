package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2020-03-05 23:51
 */
@Mapper
public interface PaymentDao {

    int add(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
