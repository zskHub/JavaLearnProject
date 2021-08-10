package cn.zsk.basic.designPattern.build.product.abs;

import cn.zsk.basic.designPattern.build.product.Item;
import cn.zsk.basic.designPattern.build.product.PackingService;
import cn.zsk.basic.designPattern.build.product.impl.PackingBottleServiceImpl;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-07   16:48
 */
public abstract class ItemColdDrinkAbs implements Item {
    @Override
    public PackingService packing() {
        return new PackingBottleServiceImpl();
    }

    @Override
    public abstract float price();
}
