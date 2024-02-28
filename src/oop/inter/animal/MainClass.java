package oop.inter.animal;

public class MainClass {
    public static void main(String[] args) {

//        Animal a = new Animal() ;   (X)
         /*
         -다형성은 상속이 전제되어야 하는것이 원칙이지만
         예외로 인터페이스와 클래스간의 구현 관계에서도
         다형성 발생을 허용합니다.
          */

Animal duck = new Duck();  // 얜 Livings Animal 도 가질수잇음
 Huntable bullDog = new BullDog();
 Violent shark = new Shark();
 BadAnimal bear = new Bear();
 /*
         - 인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
          정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요합니다.

         - 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
          구현하는 클래스들끼리 서로 즉시 형 변환이 가능합니다.
          *서로 상속관계로 연결만되어있다면 형변환가능
         */

//bear.feed();  *이건오류임 bear는 BadAnimal이라서 badAnimal은 feed의 존재를모름
        //bear 의 타입은 BadAnimal -> feed() 에 대한 정보없음 -> Animal 타입으로 즉시 형변환 가능
        ((Animal) bear).feed("과일");

 Animal[] animals = {duck , (Animal) bullDog, (Animal) shark, (Animal) bear};

    }
}
