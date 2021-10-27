package com.zy.study.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoodsDemo {
    public static void main(String[] args) {
        Map<String, Good> hashMap = new HashMap<>();
        int i = 1;
        Scanner sc = new Scanner(System.in);
        //������Ʒ
        while (i < 3) {
            System.out.println("�������" + i + "����Ʒ���:");
            String id = sc.next();
            if (hashMap.containsKey(id)) {
                System.out.println("��Ʒ����Ѵ���!");
                continue;
            }
            System.out.println("�������" + i + "����Ʒ����:");
            String name = sc.next();
            System.out.println("�������" + i + "����Ʒ�۸�:");
            double price = 0;
            try {
                price = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("�۸����벻�Ϸ�!");
                sc.next();
                continue;
            }
            Good good = new Good(id, name, price);
            hashMap.put(id, good);
            i++;
        }

        getGoods(hashMap);
        //ɾ����Ʒ
        System.out.println("��������Ʒ���ɾ����Ʒ:");
        String goodId = sc.next();
        Good delete = hashMap.remove(goodId);
        if (delete == null) {
            System.out.println("ɾ��ʧ��!");
            System.exit(0);
        }
        getGoods(hashMap);
        System.out.println("������Ҫ��ѯ����Ʒ���:");
        goodId = sc.next();
        Good goods = hashMap.get(goodId);
        if (goods == null) {
            System.out.println("û�������Ʒ");
        } else {
            System.out.println(goods.toString());
        }
        System.out.println("�������޸���Ʒ��id");
        goodId = sc.next();
        goods = hashMap.get(goodId);
        if (goods == null) {
            System.out.println("û�������Ʒ");
        } else {
            System.out.println("�������޸ĵļ۸�");
            double price = sc.nextDouble();
            goods.setPrice(price);
        }
        getGoods(hashMap);
    }


    public static void getGoods(Map<String, Good> map) {
        System.out.println("��ǰӵ����Ʒ:");
        for (Good good : map.values()) {
            System.out.println(good);
        }
    }

}
