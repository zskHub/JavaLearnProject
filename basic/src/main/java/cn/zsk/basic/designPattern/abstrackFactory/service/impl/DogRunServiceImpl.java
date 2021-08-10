package cn.zsk.basic.designPattern.abstrackFactory.service.impl;

import cn.zsk.basic.designPattern.abstrackFactory.service.AnimalRunService;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-06   16:00
 */
public class DogRunServiceImpl implements AnimalRunService {
    @Override
    public void startRun() {
        System.out.println("Oh yeah,dog running");
    }
}
