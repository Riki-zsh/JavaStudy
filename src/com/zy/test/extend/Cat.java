package com.zy.test.extend;

public class Cat extends Animal{
    private String sex;

    public Cat(){

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sleep() {
        System.out.println(this.getName() + "��һֻ" + this.getMonth() + "���" + this.getSpecies()+"����˯��");
    }

}
