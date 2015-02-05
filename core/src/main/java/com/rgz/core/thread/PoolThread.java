package com.rgz.core.thread;

import java.util.concurrent.BlockingQueue;

/**
 * Created by rgz on 15/2/5.
 */
public class PoolThread extends Thread {
    private BlockingQueue<Runnable> taskQueue = null;
    private boolean isStopped = false;

    public PoolThread(BlockingQueue<Runnable> queue) {
        taskQueue = queue;
    }

    @Override
    public void run() {
        while (!isStopped) {
            try {
                Runnable runnable = taskQueue.take();
                runnable.run();
            } catch (Exception e) {
                // 写日志或者报告异常
                // 但保持线程池运行
            }

        }
    }

    public synchronized void toStop() {
        isStopped = true;
        this.interrupt(); // 打断池中线程的dequeue()调用。
    }

    public synchronized boolean isStopped() {
        return isStopped;
    }

}
