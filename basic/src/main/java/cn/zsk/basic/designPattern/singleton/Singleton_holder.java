package cn.zsk.basic.designPattern.singleton;

/**
 * 单例模式-holder方式
 *
 * @Author : zsk
 * @CreateTime : 2021-08-09   15:11
 */
public final class Singleton_holder {
    private Singleton_holder(){

    }

    //在静态内部类中持有Singleton_holder的实例，并且可以直接被初始化
    private static class Holder{
        private static Singleton_holder instance = new Singleton_holder();
    }

    //调用getInstance方法，事实上是获取holder的instance静态属性
    public static Singleton_holder getInstance(){
        return Holder.instance;
    }

}
