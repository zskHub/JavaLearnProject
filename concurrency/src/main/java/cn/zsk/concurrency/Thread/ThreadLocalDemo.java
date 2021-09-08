package cn.zsk.concurrency.Thread;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-24   14:51
 */
public class ThreadLocalDemo {
    static final ThreadLocal<String> sThreadLocal = new ThreadLocal<String>();
    public static void main(String[] args) {

        sThreadLocal.set("test");
        sThreadLocal.set("test1");
        String result = sThreadLocal.get();
        System.out.println(result);
    }
}
