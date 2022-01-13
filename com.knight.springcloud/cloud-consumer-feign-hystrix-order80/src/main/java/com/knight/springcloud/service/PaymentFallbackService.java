package com.knight.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author TortoiseKnightB
 * @date 2022/01/13
 */
@Component
// 服务端8001出错调用这个方法，客户端出错调用前面的方法
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "ok 服务调用失败，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "timeout 服务调用失败，提示来自：cloud-consumer-feign-order80";
    }
}
