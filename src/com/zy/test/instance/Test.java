package com.zy.test.instance;

public class Test {
    public static void main(String[] args) {
        SingletonOne singletonOne = SingletonOne.getInstance();
        SingletonOne singletonOne1 = SingletonOne.getInstance();
        System.out.println(singletonOne);
        System.out.println(singletonOne1);
        SingleonTwo singleonTwo = SingleonTwo.getInstance();
        SingleonTwo singleonTwo1 = SingleonTwo.getInstance();
        System.out.println(singleonTwo);
        System.out.println(singleonTwo1);

    }
}
