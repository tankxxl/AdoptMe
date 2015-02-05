package com.rgz.core.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by rgz on 15/2/5.
 */
public class ThreadPool {

    private BlockingQueue taskQueue = null;
    private List<PoolThread> threads = new ArrayList<PoolThread>();
    private boolean isStopped = false;

    public ThreadPool(int noOfThreads, int maxNoOfTasks) {
        taskQueue = new ArrayBlockingQueue(maxNoOfTasks);

        for (int i = 0; i < noOfThreads; i++) {
            threads.add(new PoolThread(taskQueue));
        }

        for (PoolThread thread : threads) {
            thread.start();
        }
    }

    public void execute(Runnable task) {
        if (this.isStopped)
            throw new IllegalStateException("ThreadPool is stopped");

        this.taskQueue.add(task);
    }

    public synchronized void stop() {
        this.isStopped = true;

        for (PoolThread thread : threads) {
            thread.stop();;
        }
    }


}
