package com.zy.test.array;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] intArray;
        String[] strArray;

        float[] floatArray = new float[5];


        intArray = new int[5];
        strArray = new String[5];

        System.out.println("intArray==>"+intArray[0]);
        System.out.println("strArray==>"+strArray[strArray.length-1]);
        System.out.println("floatArray==>"+floatArray[floatArray.length]);
    }


}
