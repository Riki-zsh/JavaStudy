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
        System.out.println("�綯���������Ϣ:����һ��" + getBattery() + "�ĵ綯��" + getWheel() + "������,��" + getChair() + "������!");
    }
}
