package com.zy.study.Three;

public class Bear extends Animal implements IAct {

    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public String love() {
        return "ϲ������,�Է���!";
    }


    @Override
    public String skill() {
        return "���Ż���,������ɡ,��������";
    }

    @Override
    public void act(String name, int age, String skill) {
        IAct.super.act(name, age, skill);
        System.out.println("����:" + love());
    }

    @Override
    public void echoStr() {
        act(getName(),getAge(),skill());
    }
}
