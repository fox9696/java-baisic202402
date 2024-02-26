package oop.encap.good;

public class MainClass {
    public static void main(String[] args) {

        MyBirth my = new MyBirth();
//        my.year = 1992;  (x)
        my.setYear(1996);
        my.setMonth(9);
        my.setDay(11);

        my.birthInfo();
        /*
     - 데이터와 데이터를 다루는 여러가지 메서드들을 하나로 묶는 이러한 행위들을
      캡슐화 라고 합니다. (encapsulation)
      데이터와 그 데이터를 다루는 로직을 하나로 묶어 쉽게 관리하고 유지 보수하기 위함 입니다.
     */
//        System.out.printf("내생일은 %d년 %d월 %d일 입니다.\n"
//                ,my.getYear("aaa1111"), my.getMonth() ,my.getDay());

    }
}
