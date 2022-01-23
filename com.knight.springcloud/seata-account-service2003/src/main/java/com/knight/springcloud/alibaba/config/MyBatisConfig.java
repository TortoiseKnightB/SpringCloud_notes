package com.knight.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author TortoiseKnightB
 * @date 2022/01/23
 */
@Configuration
@MapperScan({"com.knight.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
