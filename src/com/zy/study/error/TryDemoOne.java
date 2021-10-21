package com.zy.study.error;

import java.util.Scanner;

public class TryDemoOne {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
        test1();
    }

    /**
     * throw 抛出异常对象的处理方案
     * 1 通过try..catch包含throw语句 -- 自己抛自己处理
     * 2 通过throws 在方法声明出抛出异常类型 --谁调用这个方法谁处理这个异常
     *
     * @throws Exception
     */
    public static void test() throws Exception {
        System.out.println("请输入年龄");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18 || age > 80) {
            throw new Exception("年龄不符合!");
        } else {
            System.out.println("欢迎入住!");
        }
    }

    public static void test1() {

        try {
            System.out.println("请输入年龄");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if (age < 18 || age > 80) {
                throw new Exception("年龄不符合!");
            } else {
                System.out.println("欢迎入住!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
