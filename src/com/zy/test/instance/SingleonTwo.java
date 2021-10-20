package com.zy.test.instance;

/**
 * 懒汉式单例模式
 * 第一次使用的时进行实例化
 * 典型的时间换空间
 */
public class SingleonTwo {
    private static SingleonTwo singleonTwo = null;

    private SingleonTwo() {

    }

    public static SingleonTwo getInstance() {
        if (singleonTwo == null) {
            singleonTwo = new SingleonTwo();
        }
        return singleonTwo;
    }
}
