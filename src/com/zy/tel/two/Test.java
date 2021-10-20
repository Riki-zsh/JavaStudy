package com.zy.tel.two;

import java.lang.reflect.Member;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getHeart());
        System.out.println("=============");
        MemberInner inner = new MemberInner();
        inner.eat();
        MemberInner.Heart heart = inner.getHeart();
        System.out.println(heart.beat());
        System.out.println("=============");
        StaticInner staticInner = new StaticInner();

        StaticInner.Heart hearts = new StaticInner.Heart();
        StaticInner.Heart.say();
        System.out.println(hearts.beat());

        MemberInner.Heart i = new MemberInner().new Heart();

    }
}
