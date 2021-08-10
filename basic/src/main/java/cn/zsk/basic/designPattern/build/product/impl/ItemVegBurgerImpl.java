package cn.zsk.basic.designPattern.build.product.impl;

import cn.zsk.basic.designPattern.build.product.abs.ItemBurgerAbs;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-07   16:52
 */
public class ItemVegBurgerImpl extends ItemBurgerAbs {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
