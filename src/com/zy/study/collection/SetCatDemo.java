package com.zy.study.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCatDemo {
    public static void main(String[] args) {
        Cat hh = new Cat("花花", 12, "橘猫");
        Cat ff = new Cat("饭饭", 5, "英短猫");
        Set<Cat> set = new HashSet<>();
        set.add(hh);
        set.add(ff);
        foreachCat(set);
        Cat hh1  = new Cat("花花1", 6, "橘猫1");
        System.out.println("添加重复的数据");
        set.add(hh1);
        foreachCat(set);
        //查找宠物猫数据
        System.out.println("查找set集合中的数据");
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            Cat c = it.next();
            if(c.getName().equals("花花")){
                System.out.println(c);
            }
        }

        System.out.println("删除宠物猫的数据");

        it = set.iterator();
        boolean found = false;
        while (it.hasNext()) {
            Cat c = it.next();
            System.out.println(c);
            if(c.getName().equals("饭饭")){
              found =  set.remove(c);
              break;
            }
        }
        if(found){
            System.out.println("删除成功!");
        }else{
            System.out.println("删除失败!");
        }
        foreachCat(set);

        System.out.println("删除多条数据!");
        set.add(hh);
        set.add(hh1);
        set.add(ff);
        System.out.println("新增后的数据");
        foreachCat(set);
        it = set.iterator();
        System.out.println("删除的数据");
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
