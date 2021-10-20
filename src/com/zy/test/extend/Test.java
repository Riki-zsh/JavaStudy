package com.zy.test.extend;

public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Å£Å£");
        cat.setMonth(1);
        cat.setSpecies("ÖÐ»ªÌïÔ°Ã¨");
        cat.sleep();
        cat.action();

        System.out.println("==================");
        Dog dog = new Dog();
        dog.setName("Ó¢°÷");
        dog.setMonth(2);
        dog.setSpecies("½ðÃ«");
        dog.run();
        dog.action();
        dog.action("·²·²");
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