package com.zy.tel.two;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * 成员内部类
 */
public class MemberInner {
    public static int age = 20;

    private String name = "Lily";

    public Heart getHeart() {
        return new Heart();
    }

    public void eat() {
        System.out.println("吃东西!");
    }


    /**
     * 内部类在外部使用时,无法直接实例化 需要由外部类信息才能完成实例化
     * 内部类的访问修饰符 可以任意 但是访问范围会受到影响
     * 内部类可以直接访问外部类的成员 如果出现同名属性 有心访问内部类汇中定义的
     * 可以使用外部类.this.成员的方式 访问外部类中同名的信息
     * 外部类访问内部类信息 需要通过内部类实例 无法直接访问
     * 内部类中是否可以包含与外部类相同方法签名的方法
     */
    public class Heart {
        int age = 23;

        public String beat() {
            eat();
            return MemberInner.age + "岁的心加快了!" + MemberInner.this.name;
        }
    }
}
