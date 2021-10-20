package com.zy.test.cast.four;

public final class Waxberry extends Fruits {
    private String color;

    public Waxberry() {

    }

    public Waxberry(String shape, String taster, String color) {
        super(shape, taster);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public final void face() {
        System.out.println("��÷:" + this.getShape() + "," + this.getTaster() + ",��ζ��������!");
    }

    @Override
    public void eat() {
        System.out.println("��÷��������,�ǳ��ó�!");
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        StringBuilder strs = str.append("��ʵΪ:").append(getShape()).append("ؼ").append(getColor()).append(",��������,�ǳ��ó�!");
        return strs.toString();
    }


}
