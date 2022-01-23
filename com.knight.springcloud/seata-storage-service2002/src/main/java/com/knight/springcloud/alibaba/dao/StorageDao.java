package com.knight.springcloud.alibaba.dao;

/**
 * @author TortoiseKnightB
 * @date 2022/01/23
 */

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageDao {
    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
