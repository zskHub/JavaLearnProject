package cn.zsk.basic.designPattern.abstrackFactory.factory;


import lombok.extern.slf4j.Slf4j;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-06   16:35
 */
@Slf4j
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("RUN")) {
            return new AnimalRunFactory();
        } else if (choice.equalsIgnoreCase("NAME")) {
            return new AnimalNameFactory();
        } else {
            log.error("未知的工厂名称。choice:{}", choice);
            return null;
        }
    }
}
