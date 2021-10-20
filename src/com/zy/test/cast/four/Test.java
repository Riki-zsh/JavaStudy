package com.zy.test.cast.four;

public class Test {
    public static void main(String[] args) {
        Fruits one = new Fruits("圆形","美味");
        Fruits two = new Fruits("圆形","美味");
        one.eat();
        System.out.println(one.equals(two));
        Waxberry waxberry = new Waxberry("圆形","香甜","紫红色");
        waxberry.face();
        waxberry.eat();

        System.out.println(waxberry.toString());
        Banana ban = new Banana("长条形","软糯","霸王");
        ban.advantage();
        ban.advantage("黄色");

    }
}
