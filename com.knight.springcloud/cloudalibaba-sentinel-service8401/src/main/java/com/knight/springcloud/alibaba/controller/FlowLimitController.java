package com.knight.springcloud.alibaba.controller;

import com.knight.springcloud.alibaba.service.FlowLimitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;


import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author TortoiseKnightB
 * @date 2022/01/19
 */
@RestController
@Slf4j
public class FlowLimitController {

    @Resource
    private FlowLimitService flowLimitService;

    @GetMapping("/testA")
    public String testA() {
        return "------testA" + flowLimitService.sentinelChain();
    }

    @GetMapping("/testB")
    public String testB() {
        log.info("a");
        log.info(Thread.currentThread().getName() + "\t" + "...testB");
        return "------testB" + flowLimitService.sentinelChain();
    }

    @GetMapping("/testD")
    public String testD() {
        log.info("testD 测试RT");
        //暂停几秒钟线程
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "------testD";
    }


    @GetMapping("/testE")
    public String testE() {
        log.info("testE 测试异常比例");
        int age = 10 / 0;
        return "------testE 测试异常比例";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "dealHandler_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        int age = 10 / 0;
        return "------testHotKey";
    }

    public String dealHandler_testHotKey(String p1, String p2, BlockException exception) {
        return "-----dealHandler_testHotKey";
    }


}
