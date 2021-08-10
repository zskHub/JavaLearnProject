package cn.zsk.basic.designPattern.build.product.impl;

import cn.zsk.basic.designPattern.build.product.abs.ItemBurgerAbs;

/**
 * 具体的建造者
 *
 * @Author : zsk
 * @CreateTime : 2021-08-07   16:55
 */
public class ItemChickenBurgerImpl extends ItemBurgerAbs {

    @Override
    public float price() {
        return 100.5f;
    }

    @Override
    public String name() {
        return "Chicken burger";
    }
}
