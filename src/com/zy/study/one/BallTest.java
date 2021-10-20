package com.zy.study.one;

public class BallTest {

    public static void playBall(Ball ball) {
        ball.play();
    }

    class InnerC implements Ball {
        @Override
        public void play() {
            System.out.println("��Ա�ڲ���");
            System.out.println("������");
            System.out.println("*******");
        }
    }

    public void info() {
        class InnerF implements Ball {
            @Override
            public void play() {
                System.out.println("�����ڲ���");
                System.out.println("��ƹ����");
                System.out.println("*******");
            }
        }
        new InnerF().play();
    }
}
