package com.zy.study.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class NoticeDemo {
    private static ArrayList<Notice> list = new ArrayList<>();
    private static boolean flag = true;
    private static Scanner sc;

    public static void main(String[] args) {
        list.add(new Notice(1, "Ĭ�Ϲ���", "���������������!"));
        sc = new Scanner(System.in);
        System.out.println("�������");

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
                    System.out.println("��������!");
                    break;
            }
        }
    }

    private static void updateNotice() {
        System.out.println("��������:");
        int id = sc.nextInt();
        System.out.println("��ѡ�����: 1->���� 2->����");
        int num = sc.nextInt();
        System.out.println("�������޸ĺ������:");
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
        System.out.println("��������:");
        int id = sc.nextInt();
        list.removeIf(notice -> notice.getId() == id);
    }

    private static void addNotice() {
        System.out.println("��������:");
        int id = sc.nextInt();
        System.out.println("���������:");
        String title = sc.next();
        System.out.println("����������:");
        String content = sc.next();
        list.add(new Notice(id, title, content));
        getNotice();
    }

    private static void getNotice() {
        System.out.println("**************��ǰϵͳ���ڹ�������***********");
        for (Notice notice : list) {
            String builder = "��ǰ������:" + notice.getId() + " " + "����:" + notice.getTitle() + " " +
                    "����:" + notice.getContent() + " ";
            System.out.println(builder);
        }
        System.out.println();
    }

    public static void printStr() {
        String str = "1:��ѯ " + "2:���� " +
                "3:ɾ�� " +
                "4:�޸� ";
        System.out.print(str);
        System.out.println();
    }
}
