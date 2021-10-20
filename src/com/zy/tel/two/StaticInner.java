package com.zy.tel.two;

/**
 * 静态内部类
 */
public class StaticInner {
    int age = 20;
    public static int temp = 2;

    public void eat() {
        System.out.println("吃东西!");
    }


    /**
     * 静态内部类中,只能直接访问外部类的静态成员 如果需要调用非静态成员 可以通过对象实例
     * 静态内部类对象实例时,可以不依赖于外部类对象
     * 可以通过外部类.内部类.静态成员的方式 访问内部类的静态成员
     * 当内部类属性和外部类中的属性同名时,默认直接调用内部类中的成员
     * 如果需要访问外部类的静态属性,可以通过外部类.属性的方式
     * 如果需要访问外部类的非静态属性,可以通过new 外部类.属性
     */
    public static class Heart {
        public static int age = 23;
        int temp = 1;

        public static void say() {
            System.out.println("hello" + StaticInner.temp);
        }

        public String beat() {
            new StaticInner().eat();
            return new StaticInner().age + "岁的心加快了!" + temp;
        }
    }
}
