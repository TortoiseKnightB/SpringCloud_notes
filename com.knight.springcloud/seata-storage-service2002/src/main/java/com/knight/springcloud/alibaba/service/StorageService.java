package com.knight.springcloud.alibaba.service;

/**
 * @author TortoiseKnightB
 * @date 2022/01/23
 */
public interface StorageService {

    void decrease(Long productId, Integer count);
}
