package cn.zsk.basic.designPattern.singleton;

/**
 * 单例模式-枚举-添加懒加载
 *
 *  @Author : zsk
 * @CreateTime : 2021-08-09   15:19
 */
//枚举类型本来就是final，不会被继承
public class Singleton_enum_lazy {


    private Singleton_enum_lazy(){
    }

    public static void method(){
        //调用该方法会主动使用Singleton_enum，INSTANCE将会被初始化
    }

    public enum EnumHolder{
        INSTANCE;
        private Singleton_enum_lazy instance;

        EnumHolder(){
            this.instance = new Singleton_enum_lazy();
        }
        private Singleton_enum_lazy getInstance(){
            return instance;
        }
    }

    public static Singleton_enum_lazy getInstance(){
        return EnumHolder.INSTANCE.getInstance();
    }

    public void doSomething(){
        System.out.println("可以做点其他事情了");
    }
}
