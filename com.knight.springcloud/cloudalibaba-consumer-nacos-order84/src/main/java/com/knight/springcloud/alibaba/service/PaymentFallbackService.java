package com.knight.springcloud.alibaba.service;

import com.knight.springcloud.entities.CommonResult;
import com.knight.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author TortoiseKnightB
 * @date 2022/01/21
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回,没有该流水信息", new Payment(id, "errorSerial......"));
    }

}
