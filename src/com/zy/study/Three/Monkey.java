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
        return "喜欢吃桃子!";
    }

    @Override
    public String skill() {
        return "骑独轮车";
    }

    @Override
    public void act(String name, int age, String skill) {
        IAct.super.act(name, age, skill);
        System.out.println("品种:"+getType());
        System.out.println("爱好:"+love());
    }

    @Override
    public void echoStr() {
        act(getName(),getAge(),skill());
    }
}
