package com.zy.study.pack;

public class TestPack {
    public static void main(String[] args) {
        int one = 100;
        // �Զ�װ��
        Integer two = one;

        //�Զ�����

        int three = two;

        //�ֶ�װ��

        Integer four = new Integer(three);


        //�ֶ�����
        int five = four.intValue();
    }
}
