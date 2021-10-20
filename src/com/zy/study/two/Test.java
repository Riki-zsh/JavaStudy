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
                System.out.println("重写抽象类中的抽象方法");
            }
        };

        abInnerClass.abInfo();
        abInnerClass.info();

        AbClassDemo.AbDemo abInner = new AbClassDemo.AbDemo();
        abInner.info();
        abInner.abInfo();
    }
}
