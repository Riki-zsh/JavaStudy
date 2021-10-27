package com.zy.study.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCatDemo {
    public static void main(String[] args) {
        Cat hh = new Cat("����", 12, "��è");
        Cat ff = new Cat("����", 5, "Ӣ��è");
        Set<Cat> set = new HashSet<>();
        set.add(hh);
        set.add(ff);
        foreachCat(set);
        Cat hh1  = new Cat("����1", 6, "��è1");
        System.out.println("����ظ�������");
        set.add(hh1);
        foreachCat(set);
        //���ҳ���è����
        System.out.println("����set�����е�����");
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            Cat c = it.next();
            if(c.getName().equals("����")){
                System.out.println(c);
            }
        }

        System.out.println("ɾ������è������");

        it = set.iterator();
        boolean found = false;
        while (it.hasNext()) {
            Cat c = it.next();
            System.out.println(c);
            if(c.getName().equals("����")){
              found =  set.remove(c);
              break;
            }
        }
        if(found){
            System.out.println("ɾ���ɹ�!");
        }else{
            System.out.println("ɾ��ʧ��!");
        }
        foreachCat(set);

        System.out.println("ɾ����������!");
        set.add(hh);
        set.add(hh1);
        set.add(ff);
        System.out.println("�����������");
        foreachCat(set);
        it = set.iterator();
        System.out.println("ɾ��������");
        Set<Cat> set1 = new HashSet<>();
        while (it.hasNext()) {
            Cat c = it.next();
            if(c.getAge()<10){
                set1.add(c);
            }
        }
        set.removeAll(set1);
        foreachCat(set);
    }

    private static void foreachCat(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

}
