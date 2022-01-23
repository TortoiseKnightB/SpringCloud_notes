package com.knight.springcloud.alibaba.controller;

/**
 * @author TortoiseKnightB
 * @date 2022/01/23
 */

import com.knight.springcloud.alibaba.domain.CommonResult;
import com.knight.springcloud.alibaba.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200, " 扣减库存成功！ ");
    }
}
