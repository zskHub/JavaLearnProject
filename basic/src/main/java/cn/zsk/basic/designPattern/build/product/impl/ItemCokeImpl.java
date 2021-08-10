package cn.zsk.basic.designPattern.build.product.impl;

import cn.zsk.basic.designPattern.build.product.abs.ItemColdDrinkAbs;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-07   17:04
 */
public class ItemCokeImpl extends ItemColdDrinkAbs {
    @Override
    public float price() {
        return 250.0f;
    }

    @Override
    public String name() {
        return "coke coldDrink";
    }
}
