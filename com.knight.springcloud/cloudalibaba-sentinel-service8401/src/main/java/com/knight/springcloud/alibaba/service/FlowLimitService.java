package com.knight.springcloud.alibaba.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author TortoiseKnightB
 * @date 2022/01/20
 */
@Service
public class FlowLimitService {

    @SentinelResource(value = "sentinelChain")
    public String sentinelChain() {
        return "----sentinelChain";
    }
}
