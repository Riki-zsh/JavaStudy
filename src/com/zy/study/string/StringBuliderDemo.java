package com.zy.study.string;

public class StringBuliderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("���");
        //���ַ������"���,imooc!"
        System.out.println(str.append(',').append("imooc!"));
        //ɾ���滻 "���,iMOOC!"
        System.out.println(str.delete(4,8).insert(4,"MOOC"));

        //�滻
        System.out.println(str.replace(4,8,"mooc"));

        //ȡ�� "���"
        System.out.println(str.substring(5,7));

        StringBuilder s = new StringBuilder("abcdefg");
        s.delete(2,4).insert(3,"CD");
        System.out.println(s);
        StringBuilder ss = new StringBuilder("��ӭ����");
        System.out.println(ss.append("imooc"));
        System.out.println(ss.delete(0,4).insert(0,"���,"));
        System.out.println(ss.replace(0,3,"��ӭ����"));
    }
}
