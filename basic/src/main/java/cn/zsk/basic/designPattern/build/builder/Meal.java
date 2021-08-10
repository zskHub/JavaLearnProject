package cn.zsk.basic.designPattern.build.builder;

import cn.zsk.basic.designPattern.build.product.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-07   17:08
 */
public class Meal {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public float getCost(){
        float cost = 0f;
        for (Item item : itemList){
            cost += item.price();
        }
        return cost;
    }

    public void showItemList(){
        for (Item item : itemList){
            System.out.println("Item:" + item.name());
        }
    }
}
