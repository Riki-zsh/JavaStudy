package com.zy.study.one;

public class BallTest {

    public static void playBall(Ball ball) {
        ball.play();
    }

    class InnerC implements Ball {
        @Override
        public void play() {
            System.out.println("成员内部类");
            System.out.println("打篮球");
            System.out.println("*******");
        }
    }

    public void info() {
        class InnerF implements Ball {
            @Override
            public void play() {
                System.out.println("方法内部类");
                System.out.println("打乒乓球");
                System.out.println("*******");
            }
        }
        new InnerF().play();
    }
}
