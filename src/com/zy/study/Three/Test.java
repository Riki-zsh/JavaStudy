package com.zy.study.Three;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean flag = true;
        Bear bear = new Bear("�ܴ�", 10);
        Lion lion = new Lion("Tom", 12, "��ë", "��");
        Monkey monkey = new Monkey("Lily", 15, "��˿��");
        Parrot parrot = new Parrot("Kahle", 5, "èͷӥ");
        Clown clown = new Clown("Tim", 3);
        Scanner scanner = new Scanner(System.in);
        int number;
        int next;
        while (flag) {
            echoBanner();
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    bear.echoStr();
                    break;
                case 2:
                    lion.echoStr();
                    break;
                case 3:
                    monkey.echoStr();
                    break;
                case 4:
                    parrot.echoStr();
                    break;
                case 5:
                    clown.echoStr();
                    break;
                default:
                    System.out.println("�������!");
                    break;
            }
            System.out.println("�Ƿ�����ۿ�(1/0)");
            next = scanner.nextInt();
            if (next == 0) {
                flag = false;
            }
        }
    }

    public static void echoBanner() {
        System.out.println("********** ��ӭ����̫����Ϸ�� *********");
        System.out.println("**********   ��ѡ������� *********");
        System.out.println("**********   1.���� *********");
        System.out.println("**********   2.ʨ�� *********");
        System.out.println("**********   3.���� *********");
        System.out.println("**********   4.���� *********");
        System.out.println("**********   5.С�� *********");
    }
}
