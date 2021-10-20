package com.zy.test.cast.four;

public class Fruits {
    private String shape;
    private String taster;

    public Fruits(){

    }

    public Fruits(String shape, String taster) {
        this.shape = shape;
        this.taster = taster;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaster() {
        return taster;
    }

    public void setTaster(String taster) {
        this.taster = taster;
    }

    public void eat() {
        System.out.println("水果可供人们食用!");
    }

    public boolean equals(Fruits obj) {
        if (obj == null)
            return false;
        return this.shape.equals(obj.shape) && this.taster.equals(obj.taster);
    }
}
