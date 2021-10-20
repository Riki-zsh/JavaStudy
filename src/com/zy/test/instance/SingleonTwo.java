package com.zy.test.instance;

/**
 * ����ʽ����ģʽ
 * ��һ��ʹ�õ�ʱ����ʵ����
 * ���͵�ʱ�任�ռ�
 */
public class SingleonTwo {
    private static SingleonTwo singleonTwo = null;

    private SingleonTwo() {

    }

    public static SingleonTwo getInstance() {
        if (singleonTwo == null) {
            singleonTwo = new SingleonTwo();
        }
        return singleonTwo;
    }
}
