package com.zy.study.Three;

public interface IAct {
    //描述技能
    String skill();

    //描述表演
    public default void act(String name, int age, String skill) {
        System.out.println("表演者:" + name);
        System.out.println("年龄:" + age);
        System.out.println("技能:" + skill);
    }

    void echoStr();
}
