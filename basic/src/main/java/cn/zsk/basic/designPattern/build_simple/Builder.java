package cn.zsk.basic.designPattern.build_simple;

/**
 * 抽象的建造者
 *
 * @Author : zsk
 * @CreateTime : 2021-08-07   22:38
 */
public abstract class Builder {
    protected Product product = new Product();
    //建造部分A
    public abstract void buildPartA();
    //建造部分B
    public abstract void buildPartB();
    //建造部分C
    public abstract void buildPartC();

    public Product getResult(){
        return product;
    }
}
