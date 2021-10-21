package com.zy.study.string;

import java.util.Locale;

public class TestString {
    public static void main(String[] args) {
        String str = "编程HelloWorld!";

        System.out.println("字符串长度:"+str.length());
        System.out.println("最后一个e的位置:"+str.lastIndexOf('e'));
        System.out.println("第一一个e的位置:"+str.indexOf('e'));
        System.out.println("3的位置:"+ str.charAt(str.indexOf('e')));

        //截取最后一个e后面的
        System.out.println("截取最后一个e后面的:"+str.substring(str.lastIndexOf('e')+1));

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
