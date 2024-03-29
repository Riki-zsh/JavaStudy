package com.zy.study.Three;

public class Monkey extends Animal implements IAct{
    private String type;


    public Monkey(String type) {
        this.type = type;
    }

    public Monkey(String name, String type) {
        super(name);
        this.type = type;
    }

    public Monkey(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String love() {
        return "ϲ��������!";
    }

    @Override
    public String skill() {
        return "����ֳ�";
    }

    @Override
    public void act(String name, int age, String skill) {
        IAct.super.act(name, age, skill);
        System.out.println("Ʒ��:"+getType());
        System.out.println("����:"+love());
    }

    @Override
    public void echoStr() {
        act(getName(),getAge(),skill());
    }
}
