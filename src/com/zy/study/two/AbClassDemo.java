package com.zy.study.two;

public class AbClassDemo implements IOutInterface{

    @Override
    public void abMethod() {
        System.out.println("AbClassDemo实现接口方法");
    }

    public static class AbDemo extends AbInnerClass{
        @Override
        public void abInfo() {
            System.out.println("重写接口中抽象类的抽象方法");
        }
    }

}
