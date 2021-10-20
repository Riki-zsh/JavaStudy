package com.zy.test.cast.three;

public class Electrocar extends Car {
    private String battery;


    public Electrocar(){

    }

    public Electrocar(String battery){
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public void run() {
        System.out.println("电动车类测试信息:这是一辆" + getBattery() + "的电动车" + getWheel() + "个轮子,有" + getChair() + "个椅子!");
    }
}
