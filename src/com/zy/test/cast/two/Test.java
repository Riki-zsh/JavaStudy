package com.zy.test.cast.two;

public class Test {
    public static void main(String[] args) {
        TestWork test = new TestWork();
        test.setName("���Թ���");
        test.setLine(10);
        test.setFindBug(5);
        test.description();
        System.out.println("================");
        DevWork devWork = new DevWork();
        devWork.setName("�з�����");
        devWork.setLine(2000);
        devWork.setBug(20);
        devWork.description();
    }
}
