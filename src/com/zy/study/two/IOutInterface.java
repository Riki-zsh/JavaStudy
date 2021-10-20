package com.zy.study.two;

public interface IOutInterface {
    int TEMP = 100; //常量
    void abMethod();
    public default void deMethod(){
        System.out.println("接口中的默认方法!");
    }

    public static void stMethod(){
        System.out.println("接口中的静态方法!");
    }

    //普通内部类
    class InnerClass{
        public void show(){
            System.out.println("接口中可定义普通成员内部类");
        }
    }

    //抽象内部类
    public abstract class AbInnerClass{
        public abstract void abInfo();
        public void info(){
            System.out.println("接口中可定义抽象成员内部类");
        }
    }
}
