package com.zy.test.cast;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SynthesizeCast {
    private boolean flag = true;
    private int[] array = new int[10];

    public static void main(String[] args) {
        SynthesizeCast cast = new SynthesizeCast();
        Scanner sc = new Scanner(System.in);
        while (cast.flag) {
            cast.printParams();
            int instruction = sc.nextInt();
            switch (instruction) {
                case 1:
                    cast.insertData();
                    cast.selectData();
                    break;
                case 2:
                    cast.selectData();
                    break;
                case 3:
                    cast.insertDataForIndex();
                    break;
                case 4:
                    cast.selectData();
                    cast.divThree();
                    break;
                case 0:
                    cast.flag = false;
                    System.out.println("退出程序!");
                    break;
                default:
                    System.out.println("指令错误,未知的指令数字!");
                    break;
            }
        }
        sc.close();
    }


    public void printParams() {
        System.out.println("*********************************");
        System.out.println("             1-->插入数据");
        System.out.println("             2-->显示所有数据");
        System.out.println("             3-->在指定位置出插入数据");
        System.out.println("             4-->查询能被3整除的数据");
        System.out.println("             0-->退出");
        System.out.println("*********************************");
        System.out.println("请输入要操作的数字:");
    }


    /**
     * 插入数据
     */
    public void insertData() {
        for (int i = 1; i < array.length; i++) {
            System.out.println("请输入第" + i + "个数据:");
            Scanner sc = new Scanner(System.in);
            try {
                array[i - 1] = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入的数据格式有误!");
                sc.next();
                i--;
            }
        }
    }

    /**
     * 显示所有数据
     */
    public void selectData() {
        System.out.print("当前数组元素有:");
        for (int n : array) {
            System.out.print(n + "   ");
        }
        System.out.println();
    }


    /**
     * 在指定位置 插入数据
     */
    public void insertDataForIndex() {
        boolean flag = false;
        System.out.println("请输入需要插入的元素:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do {
            System.out.println("请输入元素插入的位置:");
            int index = sc.nextInt();
            if (index > array.length - 1) {
                System.out.println("指定位置超过数组长度,请重新输入!");
                flag = true;
            } else {
                flag = false;
                array[index] = num;
            }
        } while (flag);

    }


    /**
     * 查询能被3整除的数据
     */
    public void divThree() {
        StringBuilder print = new StringBuilder("能被3整除的数据有:");
        for (int n : array) {
            if (n % 3 == 0) {
                print.append(n).append("  ");
            }
        }
        System.out.println(print);
    }

}
