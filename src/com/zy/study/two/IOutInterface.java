package com.zy.study.two;

public interface IOutInterface {
    int TEMP = 100; //����
    void abMethod();
    public default void deMethod(){
        System.out.println("�ӿ��е�Ĭ�Ϸ���!");
    }

    public static void stMethod(){
        System.out.println("�ӿ��еľ�̬����!");
    }

    //��ͨ�ڲ���
    class InnerClass{
        public void show(){
            System.out.println("�ӿ��пɶ�����ͨ��Ա�ڲ���");
        }
    }

    //�����ڲ���
    public abstract class AbInnerClass{
        public abstract void abInfo();
        public void info(){
            System.out.println("�ӿ��пɶ�������Ա�ڲ���");
        }
    }
}
