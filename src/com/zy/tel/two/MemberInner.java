package com.zy.tel.two;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * ��Ա�ڲ���
 */
public class MemberInner {
    public static int age = 20;

    private String name = "Lily";

    public Heart getHeart() {
        return new Heart();
    }

    public void eat() {
        System.out.println("�Զ���!");
    }


    /**
     * �ڲ������ⲿʹ��ʱ,�޷�ֱ��ʵ���� ��Ҫ���ⲿ����Ϣ�������ʵ����
     * �ڲ���ķ������η� �������� ���Ƿ��ʷ�Χ���ܵ�Ӱ��
     * �ڲ������ֱ�ӷ����ⲿ��ĳ�Ա �������ͬ������ ���ķ����ڲ�����ж����
     * ����ʹ���ⲿ��.this.��Ա�ķ�ʽ �����ⲿ����ͬ������Ϣ
     * �ⲿ������ڲ�����Ϣ ��Ҫͨ���ڲ���ʵ�� �޷�ֱ�ӷ���
     * �ڲ������Ƿ���԰������ⲿ����ͬ����ǩ���ķ���
     */
    public class Heart {
        int age = 23;

        public String beat() {
            eat();
            return MemberInner.age + "����ļӿ���!" + MemberInner.this.name;
        }
    }
}
