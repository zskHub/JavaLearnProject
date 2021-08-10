package cn.zsk.basic.designPattern.abstrackFactory.factory;

import cn.zsk.basic.designPattern.abstrackFactory.service.AnimalRunService;
import cn.zsk.basic.designPattern.abstrackFactory.service.AnimalNameService;
import cn.zsk.basic.designPattern.abstrackFactory.service.impl.BirdRunServiceImpl;
import cn.zsk.basic.designPattern.abstrackFactory.service.impl.CatRunServiceImpl;
import cn.zsk.basic.designPattern.abstrackFactory.service.impl.DogRunServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-06   16:19
 */
@Slf4j
public class AnimalRunFactory extends AbstractFactory {

    @Override
    public AnimalNameService getNameService(String animalType) {
        return null;
    }

    @Override
    public AnimalRunService getStartRunService(String animalName) {
        //使用 animalType 方法获取形状类型的对象
        if (animalName == null) {
            return null;
        }
        if (animalName.equalsIgnoreCase("dogRun")) {
            return new DogRunServiceImpl();
        } else if (animalName.equalsIgnoreCase("catRun")) {
            return new CatRunServiceImpl();
        } else if (animalName.equalsIgnoreCase("birdRun")) {
            return new BirdRunServiceImpl();
        }else {
            log.error("获取AnimalRun实例失败，未知的名称。animalType:{}", animalName);
            return null;
        }

    }
}
