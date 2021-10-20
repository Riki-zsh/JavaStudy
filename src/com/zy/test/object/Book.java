package com.zy.test.object;

public class Book {
    private String name;
    private String author;
    private String press;
    private double price;

    public Book(String name, String author, String press, double price) {
        this.name = name;
        this.author = author;
        this.press = press;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", price=" + price +
                '}';
    }
}
