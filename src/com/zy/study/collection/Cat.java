package com.zy.study.collection;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private String species;

    public Cat(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "����='" + name + '\'' + ", ����=" + age + ", Ʒ��='" + species + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(species, cat.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, species);
    }
}
