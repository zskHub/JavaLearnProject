package cn.zsk.basic.proxy;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-25   17:36
 */
public class InterceptorDemo {
    public void before(){
        System.out.println("Before-------->" + this.getClass().getSimpleName());
    }

    public void after(){
        System.out.println("after-------->" + this.getClass().getSimpleName());
    }
}
