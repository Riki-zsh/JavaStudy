package com.zy.study.error;

public class TryDemoTwo {
    public static void main(String[] args) {
        try {
            testThree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testOne() throws MyException {
        throw new MyException();
    }

    public static void testTwo() throws Exception {
        try {
            testOne();
        } catch (MyException e) {
            throw new Exception("“Ï≥£1");
        }
    }

    public static void testThree() throws Exception{
        try {
            testTwo();
        } catch (Exception e) {
            Exception exception = new Exception("“Ï≥£2");
            exception.initCause(e);
            throw exception;
        }
    }
}
