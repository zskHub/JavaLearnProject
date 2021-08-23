package cn.zsk.concurrency.Thread;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-18   14:27
 */
public class ThreadDemo extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("哦，我跑起来了");
        System.out.println("线程名称" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        //run是当前线程中跑，线程名称是：main
//        threadDemo.run();
        //start方法，另起一个线程跑，线程名称就不是main了
        threadDemo.start();


        //使用lambda写法
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("哦，我跑起来了");
                System.out.println("线程名称" + Thread.currentThread().getName());
            }
        });

        thread.start();
    }
}
