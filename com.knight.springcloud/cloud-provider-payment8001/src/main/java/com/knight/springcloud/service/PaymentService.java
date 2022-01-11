package com.knight.springcloud.service;

import com.knight.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author TortoiseKnightB
 * @date 2022/01/11
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
