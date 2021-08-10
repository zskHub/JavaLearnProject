package cn.zsk.basic.designPattern.build.product.abs;

import cn.zsk.basic.designPattern.build.product.Item;
import cn.zsk.basic.designPattern.build.product.PackingService;
import cn.zsk.basic.designPattern.build.product.impl.PackingWrapperServiceImpl;

/**
 * 抽象的建造者
 *
 * @Author : zsk
 * @CreateTime : 2021-08-07   16:30
 */
public abstract class ItemBurgerAbs implements Item {

    @Override
    public PackingService packing() {
        return new PackingWrapperServiceImpl();
    }

    @Override
    public abstract float price();
}
