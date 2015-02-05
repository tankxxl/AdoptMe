package com.rgz.core.sync;

/**
 * Created by rgz on 15/2/5.
 * 调用synchronzied方法时，其它线程还可以调用别的普通方法。
 *
 Running Thread :MyThread-1
 synchronizedMethod1 called
 Running Thread :MyThread-2
 Method1 1 called
 Method 1 done
 synchronizedMethod1 done
 */
public class Common {

    public synchronized void synchronizedMethod1() {
        System.out.println("synchronizedMethod1 called");
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("synchronizedMethod1 done");
    }

    public synchronized void synchronizedMethod2() {
        System.out.println("synchronizedMethod2 called");
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("synchronizedMethod2 done");
    }

    public void method1() {
        System.out.println("Method1 1 called");
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 done");
    }
}
