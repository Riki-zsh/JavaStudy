package com.zy.test.cast;

import com.zy.test.object.Person;

public class MainClass {
    public static void main(String[] args) {
        Professional professional = new Professional("J00001", "�������ѧ��Ӧ��", "4��");
        professional.getString();
        Student student = new Student("����","s01","��",18,professional);
        student.getString();

    }
}
