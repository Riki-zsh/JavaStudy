package com.zy.test.extend;

public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("ţţ");
        cat.setMonth(1);
        cat.setSpecies("�л���԰è");
        cat.sleep();
        cat.action();

        System.out.println("==================");
        Dog dog = new Dog();
        dog.setName("Ӣ��");
        dog.setMonth(2);
        dog.setSpecies("��ë");
        dog.run();
        dog.action();
        dog.action("����");
        Test1 Test1 = new Test1();
    }


}

class Super {
    private String name;

    public Super() {

    }

    public Super(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Super-->print");
    }
}

class Test1 extends Super {

    public void print() {
        System.out.println("Test-->print");
    }

    public void print(double d) {
        System.out.println();
    }
}