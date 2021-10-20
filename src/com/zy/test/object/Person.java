package com.zy.test.object;

public class Person {

    private String name;
    private String username;
    private String pwd;

    public Person(String name, String username, String pwd) {
        this.name = name;
        this.username = username;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
