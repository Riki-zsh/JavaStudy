package com.zy.study.Three;

public class Clown implements IAct {
    private String name;
    private int years;

    public Clown() {

    }

    public Clown(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String skill() {
        return "�ȸ���,ħ������!";
    }

    @Override
    public void act(String name, int age, String skill) {
        IAct.super.act(name, age, skill);
        System.out.println("��װ:" + dress());
    }

    public String dress() {
        return "����ʷ�װ.";
    }

    @Override
    public void echoStr() {
        act(getName(), getYears(), skill());
    }
}
