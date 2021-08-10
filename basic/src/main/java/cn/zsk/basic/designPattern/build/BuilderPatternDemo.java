package cn.zsk.basic.designPattern.build;

import cn.zsk.basic.designPattern.build.builder.Meal;
import cn.zsk.basic.designPattern.build.builder.MealBuilder;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-07   17:20
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal:---------------->");
        vegMeal.showItemList();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal:--------------->");
        nonVegMeal.showItemList();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
