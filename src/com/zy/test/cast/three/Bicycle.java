package com.zy.test.cast.three;

public class Bicycle extends Car {

    public Bicycle(String brand, String color, int wheel, int chair){
        super.setBrand(brand);
        super.setColor(color);
        super.setWheel(wheel);
        super.setChair(chair);
    }

    @Override
    public void run() {
        System.out.println("自行车类测试信息:这是一辆" + getColor() + "的" + getBrand() + "的自行车,有" + getWheel() + "个轮子,有" + getChair() + "个椅子!");
    }
}
