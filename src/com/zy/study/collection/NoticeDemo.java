package com.zy.study.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class NoticeDemo {
    private static ArrayList<Notice> list = new ArrayList<>();
    private static boolean flag = true;
    private static Scanner sc;

    public static void main(String[] args) {
        list.add(new Notice(1, "默认公告", "今天的天气正垃圾!"));
        sc = new Scanner(System.in);
        System.out.println("公告管理");

        while (flag) {
            printStr();
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    getNotice();
                    break;
                case 2:
                    addNotice();
                    break;
                case 3:
                    deleteNotice();
                    break;
                case 4:
                    updateNotice();
                    break;
                default:
                    System.out.println("输入有误!");
                    break;
            }
        }
    }

    private static void updateNotice() {
        System.out.println("请输入编号:");
        int id = sc.nextInt();
        System.out.println("请选择操作: 1->标题 2->内容");
        int num = sc.nextInt();
        System.out.println("请输入修改后的内容:");
        String con = sc.next();
        for (Notice notice : list) {
            if (notice.getId() == id) {
                if (num == 1) {
                    notice.setTitle(con);
                } else {
                    notice.setContent(con);
                }
            }
        }
    }

    private static void deleteNotice() {
        System.out.println("请输入编号:");
        int id = sc.nextInt();
        list.removeIf(notice -> notice.getId() == id);
    }

    private static void addNotice() {
        System.out.println("请输入编号:");
        int id = sc.nextInt();
        System.out.println("请输入标题:");
        String title = sc.next();
        System.out.println("请输入内容:");
        String content = sc.next();
        list.add(new Notice(id, title, content));
        getNotice();
    }

    private static void getNotice() {
        System.out.println("**************当前系统存在公告如下***********");
        for (Notice notice : list) {
            String builder = "当前公告编号:" + notice.getId() + " " + "标题:" + notice.getTitle() + " " +
                    "内容:" + notice.getContent() + " ";
            System.out.println(builder);
        }
        System.out.println();
    }

    public static void printStr() {
        String str = "1:查询 " + "2:增加 " +
                "3:删除 " +
                "4:修改 ";
        System.out.print(str);
        System.out.println();
    }
}
