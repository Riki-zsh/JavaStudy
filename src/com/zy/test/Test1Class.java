package com.zy.test;

import java.util.Scanner;

public class Test1Class {

    public static void main(String[] args) {
        Test1Class test1Class = new Test1Class();
//        test1Class.getUser();
//        test1Class.whileNumber();
        test1Class.factorial();
    }

    public void getUser() {
        System.out.println("���������!");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("��");
        } else {
            System.out.println("��");
        }
        scanner.close();
    }

    public void whileNumber() {
        int n = 0;
        while (n < 5) {
            System.out.println("n=>" + n);
            n++;
        }
    }

    public void guessNumber() {
        boolean flag = true;
        int random = (int) (Math.random() * 10);
        while (flag) {
            System.out.println("����������:");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number > random) {
                System.out.println("�µ�̫����!");
            } else if (number < random) {
                System.out.println("�µ�̫С��!");
            } else if (number == random) {
                System.out.println("��ϲ��,�¶���");
                flag = false;
                scanner.close();
            } else {
                System.out.println("ϵͳ����!");
                flag = false;
                scanner.close();
            }
        }

    }


    public void factorial(){
        int sum =0,s = 1;
        for (int i = 1;i<=10;i++){
            s = 1;
            for (int j = 1;j<=i;j++){
                s =s*j;
            }
            sum +=s;
        }
        System.out.println(sum);
    }
}