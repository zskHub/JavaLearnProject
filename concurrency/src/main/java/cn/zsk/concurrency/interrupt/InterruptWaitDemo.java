package cn.zsk.concurrency.interrupt;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-18   21:27
 */
public class InterruptWaitDemo {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //让线程挂起
                try {
                    synchronized (this){
                        System.out.println(Thread.currentThread().getName() + " (" + Thread.currentThread().getState() + ")");
                        this.wait();
                        System.out.println(Thread.currentThread().getName() + " (" + Thread.currentThread().getState() + ")");
                    }

                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " (" + Thread.currentThread().getState() + ")" + "抛出InterruptedException了");
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        //主线程睡一会
        Thread.sleep(200);

        System.out.println(thread.getName() + " (" + thread.getState() + ")");

        thread.interrupt();

        Thread.sleep(300);

        System.out.println(thread.getName() + " (" + thread.getState() + ")");

    }
}
