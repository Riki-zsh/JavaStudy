package com.zy.test.cast.two;

public class DevWork extends Work{
    private int line;
    private int bug;

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getBug() {
        return bug;
    }

    public void setBug(int bug) {
        this.bug = bug;
    }

    @Override
    public void description() {
        System.out.println("�з���������Ϣ:" + getName() + " ==> �����д��" + getLine() + "�д���" + ",������" + getBug() + "��BUG");
    }
}
