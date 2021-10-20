package com.zy.test.cast.five;

public class Earth {
    private Earth() {
        System.out.println("������!");
    }

    private static Earth earth = new Earth();

    public static Earth getInstance() {

        return earth;
    }
}
