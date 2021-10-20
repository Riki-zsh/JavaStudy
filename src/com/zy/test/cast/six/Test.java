package com.zy.test.cast.six;

public class Test {

    public static void eatTest(Person person){
        person.eat();
    }

    public static void main(String[] args) {

        eatTest(new Chinese());
        eatTest(new French());

        Animal one = new Animal();
        Animal two = new Cat();
        Animal three = new Dog();
        one.eat();
        two.eat();
        three.eat();

        Dog temp1 = (Dog) three;
        temp1.eat();

        if (two instanceof Animal) {
            Cat temp = (Cat) two;
            temp.run();
            System.out.println("tow 属于动物类");
        }

        if (three instanceof Cat) {
            System.out.println("狗属于猫类");
        }

        Animal[] animals = new Animal[5];
        int n;
        for (int i = 0; i < animals.length; i++) {
            n = (int) (Math.random() * 2);
            System.out.println(n);
            switch (n) {
                case 0:
                    animals[i] = new Dog();
                    break;
                case 1:
                    animals[i] = new Cat();
                    break;
            }
        }

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
        }
    }
}
