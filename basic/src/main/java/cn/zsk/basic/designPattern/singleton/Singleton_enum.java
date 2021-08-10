package cn.zsk.basic.designPattern.singleton;

/**
 * 单例模式-枚举
 *
 * @Author : zsk
 * @CreateTime : 2021-08-09   15:19
 */
//枚举类型本来就是final，不会被继承
public enum Singleton_enum {
    INSTANCE;

    Singleton_enum(){
        System.out.println("INSTANCE will be initialized immediately");
    }

    public static void method(){
        //调用该方法会主动使用Singleton_enum，INSTANCE将会被初始化
    }

    public static Singleton_enum getInstance(){
        return INSTANCE;
    }


    public void doSomething(){
        System.out.println("可以做点其他事情了");
    }
}
