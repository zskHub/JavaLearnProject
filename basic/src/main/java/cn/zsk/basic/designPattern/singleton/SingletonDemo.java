package cn.zsk.basic.designPattern.singleton;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-07   22:52
 */
public class SingletonDemo {
    public static void main(String[] args) {
//        Singleton_hungry instance = Singleton_hungry.getInstance();
        Singleton_enum instance = Singleton_enum.getInstance();
        instance.doSomething();


    }
}
