package com.zy.test.object;

public class Cat {
    private String name;
    private String sex;
    private String kinds;
    private String age;

    public static int price;

    {
        System.out.println("�����ִ��!");
    }

    static{
        price = 2000;
        System.out.println("����������빹�췽��ִ��,��̬�����ֻ��ִ��һ��!");
    }

    public Cat(String name, String sex, String kinds, String age) {
        this.name = name;
        this.sex = sex;
        this.kinds = kinds;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void run() {
        System.out.println(this.getName() + "����!!");
    }

    public void eat() {
        speak();
        System.out.println(this.getName() + "���!!");
    }

    public static void speak() {
        System.out.println("è˵��!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", kinds='" + kinds + '\'' +
                ", age='" + age + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
