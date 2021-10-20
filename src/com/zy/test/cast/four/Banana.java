package com.zy.test.cast.four;

public class Banana extends Fruits {
    private String variety;

    public Banana() {

    }

    public Banana(String shape, String taster, String variety) {
        super(shape, taster);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void advantage() {
        System.out.println(getVariety() + "果形" + getShape() + "果肉香甜,可供生食!");
    }

    public void advantage(String color) {
        System.out.println(getVariety() + "颜色为" + color);
    }

}
