package com.zy.study.collection;

import java.io.Console;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i < 3) {
            System.out.println("����key:");
            String key = sc.next();
            System.out.println("����value:");
            String value = sc.next();
            map.put(key, value);
            i++;
        }
//        ��ӡvalue
        Iterator<String> it = map.values().iterator();
        System.out.println("ʹ�õ��������value");
        while (it.hasNext()) {
            System.out.print(it.next() + "  ");
        }
        //��ӡmap key-value
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println("��ǰ:" + entry.getKey() + "-" + entry.getValue());
        }

        //ͨ��key����value
        System.out.println("����key:");
        String searchKey = sc.next();
        String search = map.get(searchKey);
        if (search == null) {
            System.out.println("û�ҵ�Ŷ");
            System.exit(0);
        }
        System.out.println("�ҵ���");
        System.exit(0);
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            if (searchKey.equals(key)) {
                System.out.println("�ҵ���!value->" + map.get(key));
                break;
            }
        }
    }
}
