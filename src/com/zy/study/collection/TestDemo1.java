package com.zy.study.collection;

import java.util.ArrayList;

public class TestDemo1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("����");
        list.add("��ѧ");
        list.add("Ӣ��");
        list.add("��ѧ");
        list.add("����");
        list.add("����");
        list.add(null);
        list.add(null);

        System.out.println("size:"+list.size());
        System.out.println("=============");
        for (Object s:list) {
            System.out.println(s);
        }
    }
}
