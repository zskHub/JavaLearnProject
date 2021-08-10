package cn.zsk.basic.designPattern.build_simple;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-07   22:43
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
