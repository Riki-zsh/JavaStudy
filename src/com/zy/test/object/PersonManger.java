package com.zy.test.object;

public class PersonManger {

    public static void equalsPerson(Person one, Person two) {
        String name = one.getName() + "��" + two.getName();
        if (one.getPwd().equals(two.getPwd()) && one.getUsername().equals(two.getUsername())) {
            System.out.println(name+"һ��");
        } else {
            System.out.println(name+"��һ��");
        }
    }
}
