package cn.zsk.basic.designPattern.build.builder;

import cn.zsk.basic.designPattern.build.product.impl.ItemChickenBurgerImpl;
import cn.zsk.basic.designPattern.build.product.impl.ItemCokeImpl;
import cn.zsk.basic.designPattern.build.product.impl.ItemPepsiImpl;
import cn.zsk.basic.designPattern.build.product.impl.ItemVegBurgerImpl;

/**
 *
 * @Author : zsk
 * @CreateTime : 2021-08-07   17:14
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ItemVegBurgerImpl());
        meal.addItem(new ItemCokeImpl());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ItemChickenBurgerImpl());
        meal.addItem(new ItemPepsiImpl());
        return meal;
    }
}
