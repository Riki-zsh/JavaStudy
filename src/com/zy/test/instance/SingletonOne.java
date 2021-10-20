package com.zy.test.instance;


/**
 * ����ʽ����ģʽ
 * �������ʱ�ʹ���ʵ��
 * ���͵Ŀռ任ʱ��
 */
public class SingletonOne {

    //���������͵�˽�о�̬ʵ��
    private static SingletonOne singletonOne = new SingletonOne();

    //�����๹��˽�л�
    private SingletonOne() {

    }

    //�������о�̬�������ؾ�̬ʵ������
    public static SingletonOne getInstance() {
        return  singletonOne;
    }
}
