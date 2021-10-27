package com.zy.study.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoodsDemo {
    public static void main(String[] args) {
        Map<String, Good> hashMap = new HashMap<>();
        int i = 1;
        Scanner sc = new Scanner(System.in);
        //新增商品
        while (i < 3) {
            System.out.println("请输入第" + i + "个商品编号:");
            String id = sc.next();
            if (hashMap.containsKey(id)) {
                System.out.println("商品编号已存在!");
                continue;
            }
            System.out.println("请输入第" + i + "个商品名称:");
            String name = sc.next();
            System.out.println("请输入第" + i + "个商品价格:");
            double price = 0;
            try {
                price = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("价格输入不合法!");
                sc.next();
                continue;
            }
            Good good = new Good(id, name, price);
            hashMap.put(id, good);
            i++;
        }

        getGoods(hashMap);
        //删除商品
        System.out.println("请输入商品编号删除商品:");
        String goodId = sc.next();
        Good delete = hashMap.remove(goodId);
        if (delete == null) {
            System.out.println("删除失败!");
            System.exit(0);
        }
        getGoods(hashMap);
        System.out.println("请输入要查询的商品编号:");
        goodId = sc.next();
        Good goods = hashMap.get(goodId);
        if (goods == null) {
            System.out.println("没有这个商品");
        } else {
            System.out.println(goods.toString());
        }
        System.out.println("请输入修改商品的id");
        goodId = sc.next();
        goods = hashMap.get(goodId);
        if (goods == null) {
            System.out.println("没有这个商品");
        } else {
            System.out.println("请输入修改的价格");
            double price = sc.nextDouble();
            goods.setPrice(price);
        }
        getGoods(hashMap);
    }


    public static void getGoods(Map<String, Good> map) {
        System.out.println("当前拥有商品:");
        for (Good good : map.values()) {
            System.out.println(good);
        }
    }

}
