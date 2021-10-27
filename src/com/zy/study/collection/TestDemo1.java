package com.zy.study.collection;

import java.util.ArrayList;

public class TestDemo1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("语文");
        list.add("数学");
        list.add("英语");
        list.add("化学");
        list.add("物理");
        list.add("生物");
        list.add(null);
        list.add(null);

        System.out.println("size:"+list.size());
        System.out.println("=============");
        for (Object s:list) {
            System.out.println(s);
        }
    }
}
