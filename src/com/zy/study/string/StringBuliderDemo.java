package com.zy.study.string;

public class StringBuliderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("你好");
        //将字符串变成"你好,imooc!"
        System.out.println(str.append(',').append("imooc!"));
        //删除替换 "你好,iMOOC!"
        System.out.println(str.delete(4,8).insert(4,"MOOC"));

        //替换
        System.out.println(str.replace(4,8,"mooc"));

        //取出 "你好"
        System.out.println(str.substring(5,7));

        StringBuilder s = new StringBuilder("abcdefg");
        s.delete(2,4).insert(3,"CD");
        System.out.println(s);
        StringBuilder ss = new StringBuilder("欢迎来到");
        System.out.println(ss.append("imooc"));
        System.out.println(ss.delete(0,4).insert(0,"你好,"));
        System.out.println(ss.replace(0,3,"欢迎来到"));
    }
}
