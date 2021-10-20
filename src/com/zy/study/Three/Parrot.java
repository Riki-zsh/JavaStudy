package com.zy.study.Three;

public class Parrot extends Animal implements IAct{
    private String type;

    public  Parrot(){

    }

    public Parrot(String type) {
        this.type = type;
    }

    public Parrot(String name, String type) {
        super(name);
        this.type = type;
    }

    public Parrot(String name, int age, String type) {
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
        return "喜欢拉屎";
    }

    @Override
    public String skill() {
        return "唱歌,说人话";
    }

    @Override
    public void act(String name, int age, String skill) {
        IAct.super.act(name, age, skill);
        System.out.println("爱好:"+love());
    }

    @Override
    public void echoStr() {
        act(getName(),getAge(),skill());
    }
}
