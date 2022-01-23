package com.knight.springcloud.alibaba.controller;

/**
 * @author TortoiseKnightB
 * @date 2022/01/23
 */

import com.knight.springcloud.alibaba.domain.CommonResult;
import com.knight.springcloud.alibaba.domain.Order;
import com.knight.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, " 订单创建成功 !");
    }
}
