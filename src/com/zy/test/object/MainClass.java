package com.zy.test.object;

import java.net.CacheRequest;

public class MainClass {
    public static void main(String[] args) {
        Cat.price = 3000;

        Cat cat  = new Cat("Lisa","��","��԰","18");
        cat.eat();
        System.out.println(cat.toString());
//        Test test  = new Test();
        Book book1 = new Book("��¥��","��ѩ��","������ѧ������",10.0);
        Book book2 = new Book("С��ɵ�","����","�й�����������",55.5);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        Person one = new Person("����","admin","123456");
        Person two = new Person("����","admin","12345");
        PersonManger.equalsPerson(one,two);
        Student stu = new Student();
        stu.setName("С��");
        stu.setAge(13);
        Student stu1 = new Student();
        stu.setName("С��");
        stu.setAge(18);

        System.out.println(stu.getName()+"����"+stu.getAge());
        System.out.println(stu1.getName()+"����"+stu1.getAge());
    }
}
