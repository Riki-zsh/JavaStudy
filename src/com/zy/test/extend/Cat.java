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
        System.out.println(this.getName() + "是一只" + this.getMonth() + "大的" + this.getSpecies()+"正在睡觉");
    }

}
