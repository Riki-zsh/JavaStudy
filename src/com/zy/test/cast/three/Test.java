package com.zy.test.cast.three;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("����","��ɫ");
        Car car2 = new Car("����","��ɫ");
        car.run();
        Bicycle bicycle = new Bicycle("����","��ɫ",2,1);
        bicycle.run();
        Electrocar electrocar = new Electrocar("�ɸ�");
        electrocar.run();
        Tricycle tricycle = new Tricycle();
        tricycle.run();
    }
}
