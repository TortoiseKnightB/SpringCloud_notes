package com.knight.springcloud.alibaba.domain;

/**
 * @author TortoiseKnightB
 * @date 2022/01/23
 */

import lombok.Data;

@Data
public class Storage {

    private Long id;
    /**
     * 产品 id
     */
    private Long productId;
    /**
     * 总库存
     */
    private Integer total;
    /**
     * 已用库存
     */
    private Integer used;
    /**
     * 剩余库存
     */
    private Integer residue;
}
