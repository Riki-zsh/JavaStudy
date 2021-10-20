package com.zy.test.object;

public class Cat {
    private String name;
    private String sex;
    private String kinds;
    private String age;

    public static int price;

    {
        System.out.println("代码块执行!");
    }

    static{
        price = 2000;
        System.out.println("代码块优先与构造方法执行,静态代码块只会执行一次!");
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
        System.out.println(this.getName() + "快跑!!");
    }

    public void eat() {
        speak();
        System.out.println(this.getName() + "快吃!!");
    }

    public static void speak() {
        System.out.println("猫说话!");
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
