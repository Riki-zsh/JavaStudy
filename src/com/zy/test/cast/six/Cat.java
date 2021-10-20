package com.zy.test.cast.six;

public class Cat extends Animal {
    private String weight;

    public Cat() {

    }

    public Cat(String weight) {
        this.weight = weight;
    }

    public Cat(String name, int month, String weight) {
        super(name, month);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Ã¨³Ô¶«Î÷!");
    }

    public void run() {
        System.out.println("Ã¨ÔÚÅÜ!");
    }
}
