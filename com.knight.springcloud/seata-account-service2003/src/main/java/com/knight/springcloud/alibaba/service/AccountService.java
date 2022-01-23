package com.knight.springcloud.alibaba.service;

/**
 * @author TortoiseKnightB
 * @date 2022/01/23
 */

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

public interface AccountService {
    /**
     * 扣减账户余额
     *
     * @param userId 用户 id
     * @param money  金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
