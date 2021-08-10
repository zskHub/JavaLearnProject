package cn.zsk.basic.designPattern.build.product;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-06   18:43
 */
public interface Item {
    /**
     * 名称
     * */
    String name();

    /**
     * 价格
     * */
    float price();

    /**
     * 打包方式
     * */
    PackingService packing();
}
