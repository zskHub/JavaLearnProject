package cn.zsk.basic.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-14   21:48
 */
public class ThreadPoolDemo {

    /**
     * corePoolSize：核心线程数量，会一直存在，除非allowCoreThreadTimeOut设置为true
     * maximumPoolSize：线程池允许的最大线程池数量
     * keepAliveTime：线程数量超过corePoolSize，空闲线程的最大超时时间
     * unit：超时时间的单位
     * workQueue：工作队列，保存未执行的Runnable 任务
     * threadFactory：创建线程的工厂类
     * handler：当线程已满，工作队列也满了的时候，会被调用。被用来实现各种拒绝策略。
     *
     *
     * public ThreadPoolExecutor(int corePoolSize,
     *                               int maximumPoolSize,
     *                               long keepAliveTime,
     *                               TimeUnit unit,
     *                               BlockingQueue<Runnable> workQueue,
     *                               ThreadFactory threadFactory,
     *                               RejectedExecutionHandler handler) { }
     */
    private static ExecutorService executorService = new ThreadPoolExecutor(10, 10,
            60L, TimeUnit.SECONDS, new ArrayBlockingQueue(10));
}
