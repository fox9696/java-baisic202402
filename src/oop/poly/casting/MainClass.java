package oop.poly.casting;

import oop.modi.member.pac2.C;

public class MainClass {
    public static void main(String[] args) {

        parent p = new parent();
        p.n1 = 1;
//        p.n2 = 2;  (x)  자식고유필드라서

        p.method1();
        p.method2();
//        p.method3();   (x) 자식고유필드라서

        System.out.println("--------------------------");

        Child c = new Child();
        c.n1 = 1;    //child 에는 n1이없지만 부모에게 물려받은 속성
        c.n2 = 2 ;

        c.method1();    // 부모에게 물려받아서 다 가능
        c.method2();    // 부모에게 물려받아서 다 가능
        c.method3();    // 이건 원래 지꺼임

        System.out.println("-------------------");



        // 다형성 적용(promotion)
        //parent(부모) 로 타입을가지고 접근하기에 자식이 뭘 생성했고 이런건 절대알수가없어서 자식의 고유한데이터는 모름
        parent p2 = new Child();   //가능 : 부모타입에 자식을넣는것이니
       p2.n1 = 1;
//     p2.n2 = 2;  (x)  // 자식 고유의 데이터타입이라 부모는알수가없음

        p2.method1();
        p2.method2();
//      p2.method3();  // (x) 자식 고유의 데이터타입이라 부모는알수가없음
/*
         - 다형성이 적용되면 자식 클래스의
          본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
          (부모의 정보로 자식객체에 접근하면 자식이 확장한 개념에 대한 정보를 알 방법이 없다.)
         - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
         */

       // Child c2 = p2;    //빨간줄뜨는이유 상위 값을 하위에넣기때문에
        Child c2 = (Child) p2;  //부모타입을 자식 타입으로 강제변환 (DownCasting)
        c2.n2 = 2;    //자식타입으로 변해서 이젠 선언가능
        c2.method3(); // 애도 동일.
        System.out.println("p2 = " + p2);   //이거 출력해보면 위아래 주소같음 즉 새로운 객체가생성된게아님
        System.out.println("c2 = " + c2);   // 자식고유기능을위해 다운캐스팅한것뿐 , 변수가2개가된것뿐임
          //객체가 2개 생성된 것이 아닌 하나의 객체의 접근방식을 두가지로 늘린겁니다 .


        //Object 타입의 변수는 어떠한 객체든 담을수잇지만 , 객체 고유의 기능을사용하기위해서는
        //형 변환이 거의항상필요합니다 -> Object 가 물려주는 메서드 자체가 별로 없음.
        Object obj = new String("안녕하세요");  //Object 로 String 에 접근하면 기능을못씀(length 등등..)
//        System.out.println("문자열의 길이 : " + obj.length());   (X) * Object 는 String 이 여러가지 기능을가지고있는걸모름
        String str = (String) obj;  //이렇게써야함
        System.out.println("문자열의 길이 :" + str.length());



 // 다형성이 한번도 발생하지 않은 경우에는
        // 강제 형 변환을 사용할수없습니다
        parent ppp = new parent();
     //   Child ccc = (Child)ppp ;   //이거 빨간줄은안뜨는데 오류뜸 *부모객체를 자식객체에 넣지는못함
//        Child ccc = ppp ;   이건 형변환안해서 안됨









    }
}
