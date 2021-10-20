package com.zy.study.two;

public class ClassDemo implements IOutInterface{
    @Override
    public void abMethod() {
        System.out.println("ClassDemo实现接口方法");
    }

    //获取普通成员内部
    public InnerClass getInner(){
        return new InnerClass();
    }
}
