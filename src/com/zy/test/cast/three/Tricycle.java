package com.zy.test.cast.three;

public class Tricycle extends Car {
    public Tricycle() {
        super.setWheel(3);
    }

    @Override
    public void run() {
        System.out.println("���ֳ��������Ϣ:���ֳ���һ����" + getWheel() + "�����ӵķǻ�����!");
    }
}
