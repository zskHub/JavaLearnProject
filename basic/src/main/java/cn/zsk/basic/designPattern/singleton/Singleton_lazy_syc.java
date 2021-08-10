package cn.zsk.basic.designPattern.singleton;

/**
 * 单例模式-懒汉模式-增加同步机制
 *
 *保证了只有一个实例，但是影响性能，每次只有一个线程可以获取这个方法
 *
 * @Author : zsk
 * @CreateTime : 2021-08-08   15:17
 */
public class Singleton_lazy_syc {
    private Singleton_lazy_syc(){

    }

    private static Singleton_lazy_syc instance = null;

    public synchronized Singleton_lazy_syc getInstance(){
        if (null == instance){
            instance = new Singleton_lazy_syc();
        }
        return instance;
    }
}
