package com.zy.test.cast.seven;

public class Test {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        int n;
        for (int i = 0; i < animals.length; i++) {
            n = (int) (Math.random() * 3);
            switch (n) {
                case 0:
                    animals[i] = new Cat();
                    break;
                case 1:
                    animals[i] = new Dog();
                    break;
                case 2:
                    animals[i] = new Sheep();
                    break;
            }
        }

        for (Animal v:animals) {
            v.cry();
        }
    }
}
