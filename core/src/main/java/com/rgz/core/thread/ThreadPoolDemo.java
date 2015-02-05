package com.rgz.core.thread;

/**
 * Created by rgz on 15/2/5.
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(5, 10);
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 1");
            }
        });

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable");
            }
        };

        pool.execute(runnable);
        pool.stop();
    }
}
