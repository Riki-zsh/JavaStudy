package com.zy.test.cast.three;

public class Tricycle extends Car {
    public Tricycle() {
        super.setWheel(3);
    }

    @Override
    public void run() {
        System.out.println("三轮车类测试信息:三轮车是一款有" + getWheel() + "个轮子的非机动车!");
    }
}
