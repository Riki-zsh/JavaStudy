package com.zy.study.two;

public class AbClassDemo implements IOutInterface{

    @Override
    public void abMethod() {
        System.out.println("AbClassDemoʵ�ֽӿڷ���");
    }

    public static class AbDemo extends AbInnerClass{
        @Override
        public void abInfo() {
            System.out.println("��д�ӿ��г�����ĳ��󷽷�");
        }
    }

}
