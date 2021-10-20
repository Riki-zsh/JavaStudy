package com.zy.test.cast.six;

public class Dog extends Animal{
    private String sex;

    public Dog(){

    }

    public Dog(String sex) {
        this.sex = sex;
    }

    public Dog(String name, int month, String sex) {
        super(name, month);
        this.sex = sex;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void eat() {
        System.out.println("¹·³Ô¶«Î÷!");
    }

    public void sleep(){
        System.out.println("¹·Ë¯¾õ!");
    }
}
