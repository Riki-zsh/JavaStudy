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
        System.out.println("���г��������Ϣ:����һ��" + getColor() + "��" + getBrand() + "�����г�,��" + getWheel() + "������,��" + getChair() + "������!");
    }
}
