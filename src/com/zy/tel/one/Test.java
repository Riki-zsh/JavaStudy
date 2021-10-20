package com.zy.tel.one;

public class Test implements IA,IB{
    public static void main(String[] args) {
        IA a = new Test();
        IB b = new Test();
        System.out.println(a.TEMP);
        System.out.println(b.TEMP);
    }
}
