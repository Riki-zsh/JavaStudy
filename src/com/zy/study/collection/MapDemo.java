package com.zy.study.collection;

import java.io.Console;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i < 3) {
            System.out.println("输入key:");
            String key = sc.next();
            System.out.println("输入value:");
            String value = sc.next();
            map.put(key, value);
            i++;
        }
//        打印value
        Iterator<String> it = map.values().iterator();
        System.out.println("使用迭代器输出value");
        while (it.hasNext()) {
            System.out.print(it.next() + "  ");
        }
        //打印map key-value
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println("当前:" + entry.getKey() + "-" + entry.getValue());
        }

        //通过key查找value
        System.out.println("查找key:");
        String searchKey = sc.next();
        String search = map.get(searchKey);
        if (search == null) {
            System.out.println("没找到哦");
            System.exit(0);
        }
        System.out.println("找到了");
        System.exit(0);
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            if (searchKey.equals(key)) {
                System.out.println("找到了!value->" + map.get(key));
                break;
            }
        }
    }
}
