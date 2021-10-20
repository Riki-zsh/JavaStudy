package com.zy.test.cast;

public class Professional {
    private String id;
    private String name;
    private String years;


    public Professional(String id, String name, String years) {
        this.id = id;
        this.name = name;
        this.years = years;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }


    public void getString() {
        System.out.println("专业信息如下:");
        System.out.println("专业名称:" + getName() + "\n"
                + "专业编号:" + getId() + "\n"
                + "学制年限:" + getYears());
        System.out.println("=============================");
    }
}
