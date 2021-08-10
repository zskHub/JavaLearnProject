package cn.zsk.basic.designPattern.singleton;

/**
 * 单例模式-懒汉模式
 *
 * 只用使用类时才会初始化。
 * 缺点：多线程下，不能保证实例只有一个。（多个线程同时进入到getInstance方法。详细的不多介绍了，自己了解吧）
 *
 *
 * @Author : zsk
 * @CreateTime : 2021-08-08   15:07
 */
public final class Singleton_lazy {
    //私有构造器，不允许new
    private Singleton_lazy(){

    }
    private static Singleton_lazy instance = null;

    public Singleton_lazy getInstance(){
        if (null == instance){
            instance = new Singleton_lazy();
        }
        return instance;
    }

}
