package cn.zsk.basic.designPattern.build_simple;

/**
 * 指挥者
 *
 * @Author : zsk
 * @CreateTime : 2021-08-07   22:41
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
