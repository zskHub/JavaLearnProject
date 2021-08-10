package cn.zsk.basic.designPattern.abstrackFactory;

import cn.zsk.basic.designPattern.abstrackFactory.factory.AbstractFactory;
import cn.zsk.basic.designPattern.abstrackFactory.factory.FactoryProducer;
import cn.zsk.basic.designPattern.abstrackFactory.service.AnimalNameService;
import cn.zsk.basic.designPattern.abstrackFactory.service.AnimalRunService;

import java.awt.*;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-06   16:38
 */
public class AbstractFactoryPatterDemo {
    public static void main(String[] args) {

        //获取DogRun工厂
        AbstractFactory runFactory = FactoryProducer.getFactory("run");

        //获取 DogRun 的对象
        AnimalRunService dogRunService = runFactory.getStartRunService("dogRun");
        //调用 dogRun 的 startRun 方法
        dogRunService.startRun();

        AnimalRunService catRunService = runFactory.getStartRunService("catRun");
        catRunService.startRun();

        AnimalRunService birdRunService = runFactory.getStartRunService("birdRun");
        birdRunService.startRun();

        //获取动物名称工厂
        AbstractFactory nameFactory = FactoryProducer.getFactory("name");

        //获取dog的名称的对象
        AnimalNameService dogNameService = nameFactory.getNameService("dogName");
        //调用 dogName 的 getName 方法
        dogNameService.getName();

        AnimalNameService catNameService = nameFactory.getNameService("catName");
        catNameService.getName();

        AnimalNameService birdNameService = nameFactory.getNameService("birdName");
        birdNameService.getName();
    }
}
