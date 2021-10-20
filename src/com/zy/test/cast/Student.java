package com.zy.test.cast;

public class Student {
    private String name;
    private String id;
    private String sex;
    private int age;
    private Professional professional;


    public Student(String name, String id, String sex, int age, Professional professional) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.age = age;
        this.professional = professional;
    }

    public Professional getProfessional() {
        return professional;
    }

    public void setProfessional(Professional professional) {
        this.professional = professional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getString() {
        System.out.println("学生信息如下:");
        System.out.println("姓名:" + getName() + "\n"
                + "学号:" + getId() + "\n"
                + "性别:" + getSex() + "\n"
                + "年龄:" + getAge() + "\n"
                + "所报专业名称:" + getProfessional().getName() + "\n"
                + "学制年限:" + getProfessional().getYears());
        System.out.println("=============================");
    }
}
