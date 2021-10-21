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
     * throw �׳��쳣����Ĵ�����
     * 1 ͨ��try..catch����throw��� -- �Լ����Լ�����
     * 2 ͨ��throws �ڷ����������׳��쳣���� --˭�����������˭��������쳣
     *
     * @throws Exception
     */
    public static void test() throws Exception {
        System.out.println("����������");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18 || age > 80) {
            throw new Exception("���䲻����!");
        } else {
            System.out.println("��ӭ��ס!");
        }
    }

    public static void test1() {

        try {
            System.out.println("����������");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if (age < 18 || age > 80) {
                throw new Exception("���䲻����!");
            } else {
                System.out.println("��ӭ��ס!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
