package com.zy.test.cast.three;

public class Car {
    private String brand;
    private String color;
    private int wheel = 2;
    private int chair = 1;

    public Car() {

    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Car(String brand, String color, int wheel, int chair) {
        this.brand = brand;
        this.color = color;
        this.wheel = wheel;
        this.chair = chair;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getChair() {
        return chair;
    }

    public void setChair(int chair) {
        this.chair = chair;
    }

    public void run() {
        System.out.println("父类测试信息:这是一辆" + getColor() + "的," + getBrand() + "的非机动车,有" + getWheel() + "个轮子,有" + getChair() + "个椅子!");
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        Car car = (Car) obj;
        return this.brand.equals(car.getBrand());
    }
}


