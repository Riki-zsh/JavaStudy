package com.zy.tel.three;

public class Test {

    public static void getRead(Person person) {
        person.read();
    }

    public static void main(String[] args) {
        Man man = new Man();
        Women woman = new Women();
        Test.getRead(man);
        Test.getRead(woman);

        /**
         * �����ڲ���
         * �����ڲ���û���������� ʵ����������
         * �������ļ�������:�ⲿ��$����.class
         * �޷�ʹ��private public protected abstract static ����
         * �޷���д���췽�� ������ӹ�������
         * ���ܳ��־�̬��Ա
         * �����ڲ������ʵ�ֽӿ�Ҳ�ɼ̳и��� �����ɼ��
         */
        Test.getRead(new Person() {
            {
                //��������
            }

            @Override
            public void read() {
                System.out.println("�������ƻ�С˵!");
            }
        });
        Test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("Ů��������С˵");
            }
        });
    }
}
