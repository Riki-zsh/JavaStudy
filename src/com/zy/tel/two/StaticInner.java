package com.zy.tel.two;

/**
 * ��̬�ڲ���
 */
public class StaticInner {
    int age = 20;
    public static int temp = 2;

    public void eat() {
        System.out.println("�Զ���!");
    }


    /**
     * ��̬�ڲ�����,ֻ��ֱ�ӷ����ⲿ��ľ�̬��Ա �����Ҫ���÷Ǿ�̬��Ա ����ͨ������ʵ��
     * ��̬�ڲ������ʵ��ʱ,���Բ��������ⲿ�����
     * ����ͨ���ⲿ��.�ڲ���.��̬��Ա�ķ�ʽ �����ڲ���ľ�̬��Ա
     * ���ڲ������Ժ��ⲿ���е�����ͬ��ʱ,Ĭ��ֱ�ӵ����ڲ����еĳ�Ա
     * �����Ҫ�����ⲿ��ľ�̬����,����ͨ���ⲿ��.���Եķ�ʽ
     * �����Ҫ�����ⲿ��ķǾ�̬����,����ͨ��new �ⲿ��.����
     */
    public static class Heart {
        public static int age = 23;
        int temp = 1;

        public static void say() {
            System.out.println("hello" + StaticInner.temp);
        }

        public String beat() {
            new StaticInner().eat();
            return new StaticInner().age + "����ļӿ���!" + temp;
        }
    }
}
