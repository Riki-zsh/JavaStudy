package com.zy.study.Three;

public interface IAct {
    //��������
    String skill();

    //��������
    public default void act(String name, int age, String skill) {
        System.out.println("������:" + name);
        System.out.println("����:" + age);
        System.out.println("����:" + skill);
    }

    void echoStr();
}
