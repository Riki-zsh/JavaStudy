package com.zy.study.string;

import java.io.UnsupportedEncodingException;

public class StringDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str  = "hello imooc1111";
        byte[] arr = str.getBytes();
        byte[] arr1 = str.getBytes("GBK");
        byte[] arr2 = str.getBytes("UTF-8");
        String str1 = "hello imooc1";
        System.out.println(str.compareTo(str1));

        String str2 = new String("Hello");
        String str3 = "Hello";
        System.out.println(str2.concat(str3));
        System.out.println(str2);
        System.out.println(str3.equals(str2));
    }
}
