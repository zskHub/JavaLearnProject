package cn.zsk.basic.designPattern.factory;

import cn.zsk.basic.designPattern.factory.factory.AnimalRunFactory;
import cn.zsk.basic.designPattern.factory.service.AnimalRunService;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-06   14:57
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        AnimalRunFactory animalRunFactory = new AnimalRunFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        AnimalRunService animalRunService1 = animalRunFactory.getStartRunService("dogName");
        //调用 dog 的 run 方法
        animalRunService1.startRun();

        //获取 cat 的对象，并调用它的 run 方法
        AnimalRunService animalRunService2 = animalRunFactory.getStartRunService("catName");
        //调用 cat 的 run 方法
        animalRunService2.startRun();

        //获取 bird 的对象，并调用它的 run 方法
        AnimalRunService animalRunService3 = animalRunFactory.getStartRunService("birdName");
        //调用 bird 的 run 方法
        animalRunService3.startRun();
    }
}
