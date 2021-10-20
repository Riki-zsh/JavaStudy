package com.zy.test.cast.three;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("天宇","红色");
        Car car2 = new Car("天宇","红色");
        car.run();
        Bicycle bicycle = new Bicycle("捷特","红色",2,1);
        bicycle.run();
        Electrocar electrocar = new Electrocar("飞鸽");
        electrocar.run();
        Tricycle tricycle = new Tricycle();
        tricycle.run();
    }
}
