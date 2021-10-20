package com.zy.test.object;

import java.net.CacheRequest;

public class MainClass {
    public static void main(String[] args) {
        Cat.price = 3000;

        Cat cat  = new Cat("Lisa","男","田园","18");
        cat.eat();
        System.out.println(cat.toString());
//        Test test  = new Test();
        Book book1 = new Book("红楼梦","曹雪芹","人民文学出版社",10.0);
        Book book2 = new Book("小李飞刀","古龙","中国长安出版社",55.5);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        Person one = new Person("张三","admin","123456");
        Person two = new Person("李四","admin","12345");
        PersonManger.equalsPerson(one,two);
        Student stu = new Student();
        stu.setName("小红");
        stu.setAge(13);
        Student stu1 = new Student();
        stu.setName("小明");
        stu.setAge(18);

        System.out.println(stu.getName()+"今年"+stu.getAge());
        System.out.println(stu1.getName()+"今年"+stu1.getAge());
    }
}
