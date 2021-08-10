package cn.zsk.basic.designPattern.abstrackFactory.factory;

import cn.zsk.basic.designPattern.abstrackFactory.service.AnimalRunService;
import cn.zsk.basic.designPattern.abstrackFactory.service.AnimalNameService;
import cn.zsk.basic.designPattern.abstrackFactory.service.impl.BirdNameServiceImpl;
import cn.zsk.basic.designPattern.abstrackFactory.service.impl.CatNameServiceImpl;
import cn.zsk.basic.designPattern.abstrackFactory.service.impl.DogNameServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-06   16:30
 */
@Slf4j
public class AnimalNameFactory extends AbstractFactory{
    @Override
    public AnimalNameService getNameService(String animalName) {
        if(animalName == null){
            return null;
        }
        if(animalName.equalsIgnoreCase("dogName")){
            return new DogNameServiceImpl();
        } else if(animalName.equalsIgnoreCase("catName")){
            return new CatNameServiceImpl();
        } else if(animalName.equalsIgnoreCase("birdName")){
            return new BirdNameServiceImpl();
        }else {
            log.error("获取AnimalName实例失败，未知的名称");
            return null;
        }

    }

    @Override
    public AnimalRunService getStartRunService(String animalName) {
        return null;
    }
}
