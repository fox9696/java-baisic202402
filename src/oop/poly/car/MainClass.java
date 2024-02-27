package oop.poly.car;

public class MainClass {
    public static void main(String[] args) {


        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();


        Porsche p1 = new Porsche();
        Porsche p2 = new Porsche();
        Porsche p3 = new Porsche();


        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();

//         하나하나 손수넣는방식
//        s1.run(); s2.run(); s3.run(); p1.run(); p2.run(); p3.run();
//        t1.run(); t2.run(); t3.run(); t4.run();


//         * iter 문 방식 (for of문)
//        Sonata[] sonatas = {s1,s2,s3};
//        for (Sonata s : sonatas) {
//            s.run();
//        }

           //Car 는 Sonata Tesla Porsche 의 extends 를 사용한 부모객체이기에 다형성을 이용하여 Car 안에 타입상관없이 다넣기가능
        // 다형성을 적용해서 서로 다른 타입들을 모아놓을 수 있다 .
        Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
        for (Car c : cars) {
            c.run();    //위에 주석처리한거를 제일간단하고빠르게 출력하는법
        }


        System.out.println("--------------------------------");

        Driver kim = new Driver();   //Driver 를 3개다 상속받아서 drive 하나로 셋다사용가능
        kim.drive(s1);
        kim.drive(p2);
        kim.drive(t3);

        System.out.println("----------------------------------------");


        Car myTesla = kim.buyCar("테슬라");
        myTesla.run();
        Car mySonata = kim.buyCar("소나타");
        mySonata.run();
        Car myPorsche = kim.buyCar("포르쉐");
        myPorsche.run();










    }

}
