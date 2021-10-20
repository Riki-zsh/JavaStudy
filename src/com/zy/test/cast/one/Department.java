package com.zy.test.cast.one;

/**
 * ������
 */
public class Department {
    private String id;
    private String name;
    private Employees[] employee;
    private int employeeNum;

    public Department() {

    }

    public Department(String id, String name, int employeeNum) {
        this.id = id;
        this.name = name;
        this.employeeNum = employeeNum;
    }

    public Department(String id, String name, Employees[] employee, int employeeNum) {
        this.id = id;
        this.name = name;
        this.employee = employee;
        this.employeeNum = employeeNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employees[] getEmployee() {
        if (employee == null) {
            employee = new Employees[200];
        }
        return employee;
    }

    public void setEmployee(Employees[] employee) {
        this.employee = employee;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public void addEmployee(Employees employees) {
        // Ϊ��ǰԱ����Ӳ���
//        employees.setDepartment(this);
        if(this.employee == null){
            this.employee = new Employees[200];
        }
        this.employee[this.employeeNum] = employees;
        setEmployeeNum(this.employeeNum + 1);
    }

    public String display() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.employeeNum; i++) {
            str.append("\n����:").append(this.employee[i].getName()).append("\n").append("�Ա�:").append(this.employee[i].getSex()).append("\n").append("����:").append(this.employee[i].getId()).append("\n").append("����:").append(this.employee[i].getAge()).append("\n").append("����:").append(this.getName()).append("\n").append("ְ��:").append(this.employee[i].getPosition().getName()).append("\n").append("================================");
        }
        return str.toString();
    }
}
