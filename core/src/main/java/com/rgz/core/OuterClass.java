package com.rgz.core;

/**
 * Created by rgz on 15/2/5.
 */
public class OuterClass {

    public OuterClass() {
        InterClass ic = new InterClass();
        System.out.println("OuterClass Create");
    }

    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
    }

    // interclass
    private class InterClass {
        public InterClass() {
            System.out.println("InterClass Create");
        }
    }

}
