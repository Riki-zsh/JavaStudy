package com.zy.test.cast.seven;

public class Animal {

    private String kind;

    public Animal(){

    }

    public Animal(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void cry(){
        System.out.println("动物都会叫!");
    }
}
