package cn.zsk.concurrency.Runnable;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-18   14:31
 */
public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("哦，我跑起来了");
        System.out.println("线程名称" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread1 = new Thread(runnableDemo);
        //run是当前线程中跑，线程名称是：main
//        thread1.run();
        //start方法，另起一个线程跑，线程名称就不是main了
        thread1.start();
    }
}
