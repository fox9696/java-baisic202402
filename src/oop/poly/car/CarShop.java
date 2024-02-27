package oop.poly.car;

public class CarShop {
/*
     - 키워드 instanceof는 객체가 지정한 클래스 타입을 가질 수 있는
      객체인지를 검사할 때 사용하는 연산자 입니다.

     - instanceof를 기준으로 좌항의 객체가 우항의 클래스 타입을 가질 수
      있는 지를 물어봐서 그렇다면 true, 그렇지 않다면 false를 도출합니다.
     */

    // 밑에분법은 상속구조가 조금만복잡해져도 바로 false 다 좌항이 우항이니? 라는뜻이절대아님
    //좌측 객체안에 우측 타입이 들어갈수잇는지를 물어보는것뿐.  꼭 외워요
    // a=b? 랑 a안에 b 타입이들어가냐는 아예 다른뜻이다

    public void carPrice(Car c) {
        if (c instanceof Sonata) {
            System.out.println("소나타의 가격은 3000만원 입니다.");
        } else if (c instanceof Tesla) {
            System.out.println("테슬라의 가격은 8000만원 입니다");

        } else if (c instanceof  Porsche) {
            System.out.println("포르쉐의 가격은 2억원 입니다");

        }


    }





}
