package com.zy.study.two;


public class Test {
    public static void main(String[] args) {
        ClassDemo demo = new ClassDemo();

        IOutInterface.InnerClass getInner = demo.getInner();
        getInner.show();

        IOutInterface.InnerClass innerClass  = new IOutInterface.InnerClass();
        innerClass.show();


        IOutInterface.AbInnerClass abInnerClass = new IOutInterface.AbInnerClass() {
            @Override
            public void abInfo() {
                System.out.println("��д�������еĳ��󷽷�");
            }
        };

        abInnerClass.abInfo();
        abInnerClass.info();

        AbClassDemo.AbDemo abInner = new AbClassDemo.AbDemo();
        abInner.info();
        abInner.abInfo();
    }
}
