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
                    System.out.println("�˳�����!");
                    break;
                default:
                    System.out.println("ָ�����,δ֪��ָ������!");
                    break;
            }
        }
        sc.close();
    }


    public void printParams() {
        System.out.println("*********************************");
        System.out.println("             1-->��������");
        System.out.println("             2-->��ʾ��������");
        System.out.println("             3-->��ָ��λ�ó���������");
        System.out.println("             4-->��ѯ�ܱ�3����������");
        System.out.println("             0-->�˳�");
        System.out.println("*********************************");
        System.out.println("������Ҫ����������:");
    }


    /**
     * ��������
     */
    public void insertData() {
        for (int i = 1; i < array.length; i++) {
            System.out.println("�������" + i + "������:");
            Scanner sc = new Scanner(System.in);
            try {
                array[i - 1] = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("��������ݸ�ʽ����!");
                sc.next();
                i--;
            }
        }
    }

    /**
     * ��ʾ��������
     */
    public void selectData() {
        System.out.print("��ǰ����Ԫ����:");
        for (int n : array) {
            System.out.print(n + "   ");
        }
        System.out.println();
    }


    /**
     * ��ָ��λ�� ��������
     */
    public void insertDataForIndex() {
        boolean flag = false;
        System.out.println("��������Ҫ�����Ԫ��:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do {
            System.out.println("������Ԫ�ز����λ��:");
            int index = sc.nextInt();
            if (index > array.length - 1) {
                System.out.println("ָ��λ�ó������鳤��,����������!");
                flag = true;
            } else {
                flag = false;
                array[index] = num;
            }
        } while (flag);

    }


    /**
     * ��ѯ�ܱ�3����������
     */
    public void divThree() {
        StringBuilder print = new StringBuilder("�ܱ�3������������:");
        for (int n : array) {
            if (n % 3 == 0) {
                print.append(n).append("  ");
            }
        }
        System.out.println(print);
    }

}
