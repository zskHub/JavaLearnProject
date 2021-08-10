package cn.zsk.basic.designPattern.abstrackFactory.service.impl;

import cn.zsk.basic.designPattern.abstrackFactory.service.AnimalNameService;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-06   16:05
 */
public class DogNameServiceImpl implements AnimalNameService {
    @Override
    public void getName() {
        System.out.println("欧拉欧拉，我是大黄");
    }
}
