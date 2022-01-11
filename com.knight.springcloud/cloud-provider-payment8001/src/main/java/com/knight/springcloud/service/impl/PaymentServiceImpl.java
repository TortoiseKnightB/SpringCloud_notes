package com.knight.springcloud.service.impl;

import com.knight.springcloud.dao.PaymentDao;
import com.knight.springcloud.entities.Payment;
import com.knight.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author TortoiseKnightB
 * @date 2022/01/11
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
