package com.zy.test.cast.two;

import com.zy.test.extend.Test;

public class TestWork extends Work {
    private int line;
    private int findBug;

    public TestWork() {

    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getFindBug() {
        return findBug;
    }

    public void setFindBug(int findBug) {
        this.findBug = findBug;
    }

    @Override
    public void description() {
        System.out.println("���Թ�������Ϣ:" + getName() + " ==> �����д��" + getLine() + "�д���" + ",������" + getFindBug() + "��BUG");
    }
}
