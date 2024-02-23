//패키지 선언은 항상 클래스 최 상당에 위치해야합니다.
package oop.pac.fruit;
import  oop.pac.juice.*;


public class MainClass {
    public static void main(String[] args) {
        //다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
        // 반드시 패키지 경로를 직접 명시해 주셔야 합니다.

        Apple a = new Apple();
        oop.pac.juice.Apple a2 = new oop.pac.juice.Apple();


        Banana b = new Banana();
        Melon m = new Melon();


































    }
}
