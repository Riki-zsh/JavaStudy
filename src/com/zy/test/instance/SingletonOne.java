package com.zy.test.instance;


/**
 * 饿汉式单例模式
 * 在类加载时就创建实例
 * 典型的空间换时间
 */
public class SingletonOne {

    //创建该类型的私有静态实例
    private static SingletonOne singletonOne = new SingletonOne();

    //创建类构造私有化
    private SingletonOne() {

    }

    //创建公有静态方法返回静态实例对象
    public static SingletonOne getInstance() {
        return  singletonOne;
    }
}
