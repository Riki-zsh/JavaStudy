package com.zy.study.Three;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean flag = true;
        Bear bear = new Bear("熊大", 10);
        Lion lion = new Lion("Tom", 12, "金毛", "男");
        Monkey monkey = new Monkey("Lily", 15, "金丝猴");
        Parrot parrot = new Parrot("Kahle", 5, "猫头鹰");
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
                    System.out.println("输入错误!");
                    break;
            }
            System.out.println("是否继续观看(1/0)");
            next = scanner.nextInt();
            if (next == 0) {
                flag = false;
            }
        }
    }

    public static void echoBanner() {
        System.out.println("********** 欢迎来到太阳马戏团 *********");
        System.out.println("**********   请选择表演者 *********");
        System.out.println("**********   1.棕熊 *********");
        System.out.println("**********   2.狮子 *********");
        System.out.println("**********   3.猴子 *********");
        System.out.println("**********   4.鹦鹉 *********");
        System.out.println("**********   5.小丑 *********");
    }
}
