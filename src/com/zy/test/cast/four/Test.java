package com.zy.test.cast.four;

public class Test {
    public static void main(String[] args) {
        Fruits one = new Fruits("Բ��","��ζ");
        Fruits two = new Fruits("Բ��","��ζ");
        one.eat();
        System.out.println(one.equals(two));
        Waxberry waxberry = new Waxberry("Բ��","����","�Ϻ�ɫ");
        waxberry.face();
        waxberry.eat();

        System.out.println(waxberry.toString());
        Banana ban = new Banana("������","��Ŵ","����");
        ban.advantage();
        ban.advantage("��ɫ");

    }
}
