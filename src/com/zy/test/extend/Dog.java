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
        System.out.println(this.getName() + "是一只" + this.getMonth() + "大的" + this.getSpecies() + "正在跑路!");
    }

    public void dogToString() {
        System.out.println(this.getName() + "是一只" + this.getMonth() + "大的" + this.getSpecies());
    }

    public void action() {
        System.out.println("重写后的action");
    }

    public void action(String month) {
        System.out.println(month + "正在动!");
    }
}
