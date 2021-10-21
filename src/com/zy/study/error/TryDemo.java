package com.zy.study.error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo {
    public static void main(String[] args) {
        System.out.print("�������һ��������");
        Scanner sc = new Scanner(System.in);
        try {
            int one = sc.nextInt();
            System.out.print("������ڶ���������");
            int two = sc.nextInt();
            System.out.println("����֮�̣�" + (one / two));
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("��������Ϊ0");
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("������������");
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("�����쳣");
        } finally {
            System.out.println("�������");
        }
    }
}
