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
        System.out.println("研发工作类信息:" + getName() + " ==> 今天编写了" + getLine() + "行代码" + ",发现了" + getBug() + "个BUG");
    }
}
