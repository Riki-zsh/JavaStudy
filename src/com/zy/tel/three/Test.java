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
         * 匿名内部类
         * 匿名内部类没有类型名称 实例对象名称
         * 编译后的文件名命名:外部类$数字.class
         * 无法使用private public protected abstract static 修饰
         * 无法编写构造方法 可以添加构造代码块
         * 不能出现静态成员
         * 匿名内部类可以实现接口也可继承父类 但不可兼得
         */
        Test.getRead(new Person() {
            {
                //构造代码块
            }

            @Override
            public void read() {
                System.out.println("男生读科幻小说!");
            }
        });
        Test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("女生读言情小说");
            }
        });
    }
}
