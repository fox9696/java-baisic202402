package oop.poly.car;

public class Driver {



    //    public void drive(Sonata s) {
//        System.out.println("운전을 시작합니다");
//        s.run();
//    public void drive(Tesla t) {
//        System.out.println("운전을 시작합니다");
//        t.run();
//
//    }
//    public void drive(Porsche p) {
//        System.out.println("운전을 시작합니다");
//        p.run();
//
//    }
    public void drive(Car c) {    //Car 를 선언해서 다형성으로  3개다 한번에사용할수있게됨
        System.out.println("운전을 시작합니다");
        c.run();

    }

    public Car buyCar(String name) {    //다형성으로 선언해서 Car 로 선언했고 매게변수는 뭐가들어올지몰라 String name으로
        if (name.equals("소나타")) {
            System.out.println("소나타를 구입합니다");
        return new Sonata();
        }else if (name.equals("포르쉐")) {
            System.out.println("포르쉐를 구입합니다");
            return new Porsche();
        } else if (name.equals("테슬라")) {
            System.out.println("테슬라를 구입합니다");
            return new Tesla();

        }else {
            System.out.println("뭐달라고~~~~");
        return null;
        }

    }




}
