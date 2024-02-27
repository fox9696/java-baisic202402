package oop.poly.car;

public class Tesla extends Car {    //Car 상속받음


    @Override
    public void run() {
        System.out.println("테슬라가 달립니다");

    }

    public void activeAutopilot() {   //이건 부모상속받은거아님
        System.out.println("테슬라의 오토파일럿을 가동합니다");
    }






}
