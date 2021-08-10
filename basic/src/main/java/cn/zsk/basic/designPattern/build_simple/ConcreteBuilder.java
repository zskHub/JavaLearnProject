package cn.zsk.basic.designPattern.build_simple;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-07   22:40
 */
public class ConcreteBuilder extends Builder{
    @Override
    public void buildPartA() {
        System.out.println("建造了 PartA");
        product.setPartA("建造了 PartA");
    }

    @Override
    public void buildPartB() {
        System.out.println("建造了 PartB");
        product.setPartB("建造了 PartB");
    }

    @Override
    public void buildPartC() {
        System.out.println("建造了 PartC");
        product.setPartC("建造了 PartC");
    }
}
