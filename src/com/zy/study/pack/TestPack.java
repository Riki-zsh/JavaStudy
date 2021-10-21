package com.zy.study.pack;

public class TestPack {
    public static void main(String[] args) {
        int one = 100;
        // 自动装箱
        Integer two = one;

        //自动拆箱

        int three = two;

        //手动装箱

        Integer four = new Integer(three);


        //手动拆箱
        int five = four.intValue();
    }
}
