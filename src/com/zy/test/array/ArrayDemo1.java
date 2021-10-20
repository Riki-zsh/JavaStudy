package com.zy.test.array;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] intArray = {1, 3, 5, 11, 7, 9};
        Arrays.sort(intArray);
        System.out.println("intaRR" + intArray[intArray.length - 1]);
        ArrayDemo1 arrayDemo1 = new ArrayDemo1();
//        arrayDemo1.bubbly();
        arrayDemo1.plus(1,2);

        arrayDemo1.plus(1.1,2.1);
        arrayDemo1.plus(intArray);

    }


    public void bubbly() {
        long startTime = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        int[] array = {34, 53, 12, 32, 56, 17};
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        for (int n : array) {
            System.out.println("n->" + n);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("ºÄÊ±:->" + (endTime - startTime));
    }

    public int plus(int a, int b) {
        return a + b;
    }

    public double plus(double c, double d) {
        return c + d;
    }

    public void plus(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        System.out.println("sum:" + sum);
    }

}