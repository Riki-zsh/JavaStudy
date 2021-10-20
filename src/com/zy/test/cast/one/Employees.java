package com.zy.test.cast.one;

/**
 * ‘±π§¿‡
 */
public class Employees {
    private String name;
    private String id;
    private int age;
    private String sex;
    private Department department;
    private Position position;

    public Employees() {

    }

    public Employees(String name, String id, int age, String sex, Department department, Position position) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.sex = sex;
        this.department = department;
        this.position = position;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
