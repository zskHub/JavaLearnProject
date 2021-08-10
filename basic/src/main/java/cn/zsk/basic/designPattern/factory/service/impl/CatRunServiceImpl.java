package cn.zsk.basic.designPattern.factory.service.impl;

import cn.zsk.basic.designPattern.factory.service.AnimalRunService;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-06   14:54
 */
public class CatRunServiceImpl implements AnimalRunService {
    @Override
    public void startRun() {
        System.out.println("Oh yeah,cat running");
    }
}
