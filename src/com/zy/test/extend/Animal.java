package com.zy.test.extend;

public class Animal {
    private String name;
    private int month;
    private String species;

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void action() {
        System.out.println(this.getName() + "���ڶ�!");
    }

    public void action(String name) {
        System.out.println(name + "���ڶ�!");
    }


}
