package com.zy.study.string;

import java.util.Locale;

public class TestString {
    public static void main(String[] args) {
        String str = "���HelloWorld!";

        System.out.println("�ַ�������:"+str.length());
        System.out.println("���һ��e��λ��:"+str.lastIndexOf('e'));
        System.out.println("��һһ��e��λ��:"+str.indexOf('e'));
        System.out.println("3��λ��:"+ str.charAt(str.indexOf('e')));

        //��ȡ���һ��e�����
        System.out.println("��ȡ���һ��e�����:"+str.substring(str.lastIndexOf('e')+1));

        String str1 = new String("Hello,Imooc!");
        str1 = str1.substring(2,5);
        System.out.println(str1);
//        char ch = str1.charAt(str1.length());
//        System.out.println(ch);

        String str2 = "abcdefg";
        char ch1 = str2.substring(3,6).charAt(1);
        System.out.println(ch1);

        String str3 = "abcdefg";
        str3 = str3.substring(2,5).toUpperCase(Locale.ROOT);
        str3 = str3.replace("DE","MM");
        System.out.println(str3);

        String str4 = null;
        System.out.println(str4);
    }
}
