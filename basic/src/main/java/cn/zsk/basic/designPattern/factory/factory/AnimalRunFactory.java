package cn.zsk.basic.designPattern.factory.factory;

import cn.zsk.basic.designPattern.factory.service.AnimalRunService;
import cn.zsk.basic.designPattern.factory.service.impl.BirdRunServiceImpl;
import cn.zsk.basic.designPattern.factory.service.impl.CatRunServiceImpl;
import cn.zsk.basic.designPattern.factory.service.impl.DogRunServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-06   14:56
 */
@Slf4j
public class AnimalRunFactory {

    //使用 animalType 方法获取形状类型的对象
    public AnimalRunService getStartRunService(String animalName){
        if(animalName == null){
            return null;
        }
        if(animalName.equalsIgnoreCase("dogName")){
            return new DogRunServiceImpl();
        } else if(animalName.equalsIgnoreCase("catName")){
            return new CatRunServiceImpl();
        } else if(animalName.equalsIgnoreCase("birdName")){
            return new BirdRunServiceImpl();
        }else {
            log.error("获取AnimalNameService异常，未知的名称。animalName:{}", animalName);
            return null;
        }
    }
}
