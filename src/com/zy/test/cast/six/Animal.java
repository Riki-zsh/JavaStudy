package com.zy.test.cast.six;

public class Animal {
    private String name;
    private int month;

    public Animal() {

    }

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void eat() {
        System.out.println("���ﶼ��Զ���!");
    }

    public Animal raise(boolean isManyTime){
        if(isManyTime){
            System.out.println("����");
            return new Dog();
        }else{
            System.out.println("��è!");
            return new Cat();
        }
    }
}
