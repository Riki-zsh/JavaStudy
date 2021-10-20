package com.zy.test.extend;

public class Dog extends Animal {
    private double weight;

    public Dog() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println(this.getName() + "��һֻ" + this.getMonth() + "���" + this.getSpecies() + "������·!");
    }

    public void dogToString() {
        System.out.println(this.getName() + "��һֻ" + this.getMonth() + "���" + this.getSpecies());
    }

    public void action() {
        System.out.println("��д���action");
    }

    public void action(String month) {
        System.out.println(month + "���ڶ�!");
    }
}
