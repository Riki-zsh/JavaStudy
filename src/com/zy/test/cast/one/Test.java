package com.zy.test.cast.one;

public class Test {
    public static void main(String[] args) {
        Position position1 = new Position("p001", "����");
        Position position2 = new Position("p002", "����");
        Department department = new Department("001", "�г���", 0);
        Department department1 = new Department("001", "Ӫ����", 0);
        Employees employees = new Employees("����", "z001", 18, "��", department, position1);
        Employees employees1 = new Employees("����", "z002", 18, "��", department, position2);
        Employees employees2 = new Employees("������", "z003", 18, "��", department1, position2);
        Employees employees3 = new Employees("����", "z004", 18, "��", department, position1);
        department.addEmployee(employees);
        department.addEmployee(employees1);
        department.addEmployee(employees2);
        department.addEmployee(employees3);
        System.out.println(department.display());
        System.out.println("�г���:"+department.getEmployee().length);
        System.out.println("Ӫ����:"+department1.getEmployee().length);
    }
}
