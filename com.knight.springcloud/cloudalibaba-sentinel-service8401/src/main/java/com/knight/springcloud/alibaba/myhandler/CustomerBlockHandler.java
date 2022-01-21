package com.knight.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.knight.springcloud.entities.CommonResult;

/**
 * @author TortoiseKnightB
 * @date 2022/01/21
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义的限流处理信息......CustomerBlockHandler");
    }

}
