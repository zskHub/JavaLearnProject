package cn.zsk.basic.designPattern.abstrackFactory.factory;

import cn.zsk.basic.designPattern.abstrackFactory.service.AnimalRunService;
import cn.zsk.basic.designPattern.abstrackFactory.service.AnimalNameService;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-06   16:10
 */
public abstract class AbstractFactory {

    public abstract AnimalNameService getNameService(String animalName);

    public abstract AnimalRunService getStartRunService(String animalName);
}
