package cn.zsk.basic.designPattern.singleton;

/**
 * 单例模式-饿汉模式
 *
 * 多线程下能保证只有一个类。
 *
 * 缺点：类直接初始化，占用内存资源少时可以的，如果占用资源多就不合适了。
 *
 * @Author : zsk
 * @CreateTime : 2021-08-07   22:49
 */
public final class Singleton_hungry {
    private static Singleton_hungry instance = new Singleton_hungry();

    private Singleton_hungry(){

    }
    public static Singleton_hungry getInstance(){
        return instance;
    }

    public void doSomething(){
        System.out.println("可以做点其他事情了");
    }
}
