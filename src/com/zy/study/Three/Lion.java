package com.zy.study.Three;

import java.sql.SQLOutput;

public class Lion extends Animal implements IAct{
    private String color;
    private String sex;

    public Lion(){

    }

    public Lion(String color, String sex) {
        this.color = color;
        this.sex = sex;
    }

    public Lion(String name, String color, String sex) {
        super(name);
        this.color = color;
        this.sex = sex;
    }

    public Lion(String name, int age, String color, String sex) {
        super(name, age);
        this.color = color;
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String love() {
        return "ϲ���Ը�������!";
    }

    @Override
    public String skill() {
        return "�ó����Ȧ!";
    }

    @Override
    public void act(String name, int age, String skill) {
        IAct.super.act(name, age, skill);
        System.out.println("�Ա�:"+getSex());
        System.out.println("ëɫ:"+getColor());
        System.out.println("����:"+love());
    }

    @Override
    public void echoStr() {
        act(getName(), getAge(),skill());
    }
}
