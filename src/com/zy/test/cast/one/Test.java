package com.zy.test.cast.one;

public class Test {
    public static void main(String[] args) {
        Position position1 = new Position("p001", "经理");
        Position position2 = new Position("p002", "助手");
        Department department = new Department("001", "市场部", 0);
        Department department1 = new Department("001", "营销部", 0);
        Employees employees = new Employees("张三", "z001", 18, "男", department, position1);
        Employees employees1 = new Employees("李四", "z002", 18, "男", department, position2);
        Employees employees2 = new Employees("王麻子", "z003", 18, "男", department1, position2);
        Employees employees3 = new Employees("王伍", "z004", 18, "男", department, position1);
        department.addEmployee(employees);
        department.addEmployee(employees1);
        department.addEmployee(employees2);
        department.addEmployee(employees3);
        System.out.println(department.display());
        System.out.println("市场部:"+department.getEmployee().length);
        System.out.println("营销部:"+department1.getEmployee().length);
    }
}
