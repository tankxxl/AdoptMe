package com.rgz.core.sync;

/**
 * Created by rgz on 15/2/5.
 */
public class MyThread extends Thread {

    private int id = 0;

    private Common common;

    public MyThread(String name, int no, Common object) {
        super(name);
        common = object;
        id = no;
    }

    @Override
    public void run() {
        System.out.println("Running Thread :" + this.getName());
        try {
            if (id == 0) {
                common.synchronizedMethod1();
            } else {
//                common.method1();
                common.synchronizedMethod2();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Common c = new Common();
        MyThread t1 = new MyThread("MyThread-1", 0, c); // synchronized method
        MyThread t2 = new MyThread("MyThread-2", 1, c); // mehtod

        t1.start();
        t2.start();
    }
}
