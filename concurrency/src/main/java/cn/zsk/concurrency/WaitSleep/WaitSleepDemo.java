package cn.zsk.concurrency.WaitSleep;

public class WaitSleepDemo {
    public static void main(String[] args) {
        final Object lock = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread A is waiting to get lock");
                synchronized (lock){
                    try {
                        System.out.println("thread A get lock");
                        //睡一会，注意睡的时候是不让出来锁的，这个时候线程B依旧获取不到锁
                        Thread.sleep(20);
                        System.out.println("thread A do wait method");
                        //使用wait方法时，让出了锁，这个时候线程B就能获取锁了
                        lock.wait();
                        System.out.println("thread A is done");
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        try{
            Thread.sleep(10);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread B is waiting to get lock");
                synchronized (lock){
                    try {
                        System.out.println("thread B get lock");
                        System.out.println("thread B is sleeping 10 ms");
                        Thread.sleep(10);
                        //唤醒等待池中的所有线程
                        lock.notifyAll();
                        //执行yield方法，让出cpu，但是没有让出锁，这个时候线程A因为在等待锁，依旧不会执行，直到线程B执行结束。
                        Thread.yield();
                        Thread.sleep(2000);
                        System.out.println("thread B is done");
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }
}
