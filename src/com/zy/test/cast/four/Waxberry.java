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
        System.out.println("杨梅:" + this.getShape() + "," + this.getTaster() + ",果味酸甜适中!");
    }

    @Override
    public void eat() {
        System.out.println("杨梅酸甜适中,非常好吃!");
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        StringBuilder strs = str.append("果实为:").append(getShape()).append("丶").append(getColor()).append(",酸甜适中,非常好吃!");
        return strs.toString();
    }


}
