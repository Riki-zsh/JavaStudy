package com.zy.study.one;

public class Test {

    public static void playBa(Ball ball){
        ball.play();
    }

    public static void main(String[] args) {
        BallTest  ball= new BallTest();
        BallTest.InnerC innerC = ball.new InnerC();
        innerC.play();
        ball.info();
        Test.playBa(new Ball() {
            @Override
            public void play() {
                System.out.println("匿名内部类");
                System.out.println("打排球");
                System.out.println("*******");
            }
        });
    }
}
