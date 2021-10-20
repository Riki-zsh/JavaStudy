package com.zy.tel.two;

public class Person {
    public static int age = 12;

    /**
     * 定义在方法内部 作用范围也在方法内
     * 和方法内部成员使用规则一样 class前不可以添加public private protected static
     * 类中不能包含静态成员
     * 类中可以包含abstract final 修饰的成员
     * @return
     */
    public String getHeart() {
        class Heart {
            public final int age = 20;

            public String getHeart() {
                return Person.age + "岁的心跳加快了!";
            }
        }
        return new Heart().getHeart();
    }


}
