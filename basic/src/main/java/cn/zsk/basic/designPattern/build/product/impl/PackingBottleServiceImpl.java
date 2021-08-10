package cn.zsk.basic.designPattern.build.product.impl;

import cn.zsk.basic.designPattern.build.product.PackingService;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-07   16:26
 */
public class PackingBottleServiceImpl implements PackingService {
    @Override
    public String pack() {
        return "Oh,yeah.bottle";
    }
}
