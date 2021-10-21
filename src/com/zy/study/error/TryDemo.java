package com.zy.study.error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo {
    public static void main(String[] args) {
        System.out.print("请输入第一个整数：");
        Scanner sc = new Scanner(System.in);
        try {
            int one = sc.nextInt();
            System.out.print("请输入第二个整数：");
            int two = sc.nextInt();
            System.out.println("两数之商：" + (one / two));
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("除数不能为0");
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("请输入整数！");
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序异常");
        } finally {
            System.out.println("运算结束");
        }
    }
}
