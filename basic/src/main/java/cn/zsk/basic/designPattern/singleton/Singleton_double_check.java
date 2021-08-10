package cn.zsk.basic.designPattern.singleton;

import java.net.Socket;
import java.sql.Connection;

/**
 * 双重校验
 *
 *
 * @Author : zsk
 * @CreateTime : 2021-08-08   16:09
 */
public final class Singleton_double_check {

    private Singleton_double_check(){

    }

    /**
     * java重新排序的原因。有可能导致connection和socket空指针异常
     * 即线程A和线程B，进入方法，然后instance为空，A去完成instance的创建
     * 此时B进来了，发现instance不为空，直接返回了，但是由于重排的原因，instance创建好了，connection和socket并未完成创建
     *
     * 解决办法：给instance加上volatile，防止指令重排
     *
     * */
    private static volatile Singleton_double_check instance = null;

    Connection connection;
    Socket socket;

    public static Singleton_double_check getInstance(){

        //region 单例生成
        if (null == instance){
            //region 加锁了
            synchronized (Singleton_double_check.class){
                if (null == instance){
                    instance = new Singleton_double_check();
                }
            }
            //endregion
        }
        //endregion
        return instance;
    }

}
