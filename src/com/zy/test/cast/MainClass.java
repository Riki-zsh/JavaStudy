package com.zy.test.cast;

import com.zy.test.object.Person;

public class MainClass {
    public static void main(String[] args) {
        Professional professional = new Professional("J00001", "计算机科学与应用", "4年");
        professional.getString();
        Student student = new Student("张三","s01","男",18,professional);
        student.getString();

    }
}
