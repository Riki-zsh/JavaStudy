package com.zy.tel.two;

public class Person {
    public static int age = 12;

    /**
     * �����ڷ����ڲ� ���÷�ΧҲ�ڷ�����
     * �ͷ����ڲ���Աʹ�ù���һ�� classǰ���������public private protected static
     * ���в��ܰ�����̬��Ա
     * ���п��԰���abstract final ���εĳ�Ա
     * @return
     */
    public String getHeart() {
        class Heart {
            public final int age = 20;

            public String getHeart() {
                return Person.age + "��������ӿ���!";
            }
        }
        return new Heart().getHeart();
    }


}
