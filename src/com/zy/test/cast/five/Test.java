package com.zy.test.cast.five;

public class Test {
    public static void main(String[] args) {
        System.out.println("��һ�����򴴽���...");
        Earth earth = Earth.getInstance();
        System.out.println("�ڶ������򴴽���...");
        Earth earth1 = Earth.getInstance();
        System.out.println("���������򴴽���...");
        Earth earth2= Earth.getInstance();
        System.out.println(earth);
        System.out.println(earth1);
        System.out.println(earth2);
    }
}
