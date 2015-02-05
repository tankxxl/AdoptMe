package com.rgz.core;

/**
 * Created by rgz on 15/2/5.
 */
public class ChildClass extends FatherClass {

    public ChildClass() {
        System.out.println("ChildClass Create");
    }

    public static void main(String[] args) {
        FatherClass fc = new FatherClass();
        System.out.println("------------");
        ChildClass cc = new ChildClass();
    }
}
