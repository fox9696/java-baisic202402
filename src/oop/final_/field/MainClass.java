package oop.final_.field;

public class MainClass {
    public static void main(String[] args) {


        Person kim = new Person("김철수");
//        kim.name = "김마이클";  (x)
//        kim.nation = "미국";   (X)  final 로 선언해서 이 방식으론 바꿀수없음
        kim.age = 30;  //얜 final 선언안함

        Person park = new Person("박영희");
//        park.nation = "영국"   (X)
//        park.name = "박영국";  (X)  final 영향을 받고있음
















    }
}
