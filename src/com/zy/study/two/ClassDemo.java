package com.zy.study.two;

public class ClassDemo implements IOutInterface{
    @Override
    public void abMethod() {
        System.out.println("ClassDemoʵ�ֽӿڷ���");
    }

    //��ȡ��ͨ��Ա�ڲ�
    public InnerClass getInner(){
        return new InnerClass();
    }
}
