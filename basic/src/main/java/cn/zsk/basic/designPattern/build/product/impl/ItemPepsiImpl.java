package cn.zsk.basic.designPattern.build.product.impl;

import cn.zsk.basic.designPattern.build.product.abs.ItemColdDrinkAbs;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-07   17:05
 */
public class ItemPepsiImpl extends ItemColdDrinkAbs {
    @Override
    public String name() {
        return "pepsi ColdDrink";
    }

    @Override
    public float price() {
        return 520.0f;
    }
}
