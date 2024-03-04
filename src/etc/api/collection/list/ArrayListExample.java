package etc.api.collection.list;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
/*
         # ArrayList
         - 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.
         - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
         - 인덱스를 활용하며, 객체의 중복 저장을 허용한다.
         */
// String[] nick = new String[50]
        // <> -> 제네릭 ( 타입의 형식을 지정하여 타입 안정성을 꾀하기 위한 문법)
// ArrayList<String> nick = new ArrayList<>();   //뒤에 ArrayList 에는<> 안에내용 생략가능
        List<String> nick = new ArrayList<>(); //맨앞은인터페이스 List로 선언도가능 이게 다향성이라 더 선호
        // <> 이거안붙히면 타입이 object 로 되서 나중에 매우불편해짐 꼭 붙이자

         String str = "야옹이";
         //add(객체) : 리스트에 객체를 추가하는 메서드
        nick.add(str) ;
        nick.add("멍멍이");  //즉석에서 선언+객체추가가능
        nick.add(new String("개구리"));
        nick.add("짹쨱이");
        nick.add("야옹이"); //객체중복도 당연히 가능 겹치는건 인덱스번호로확인가능하기에
        System.out.println(nick);  //매우간단하게 ArraytoString 같은거없이 바로 출력가능


        // add(인덱스 , 객체): 특정 인덱스에 객체를 삽입하는 메서드
        nick.add(3,"어흥이");
        System.out.println(nick); //3번째엿던 짹짹이가한칸뒤로밀리고 그자리에 "어흥이"

        //get(인덱스) : 리스트 내부의 객체를 참조하는 메서드
//        String name = nick[3]; (x) 이건 배열방법
        String name = nick.get(3);
        System.out.println("3번 인덱스의값 : " + name);  //어흥이
        System.out.println("name.length() = " + name.length());  //3


        //size() : 리스트의 크기반환
        System.out.println("nick의 크기 :" + nick.size() );  // 6


        //set(인덱스 , 수정할 객체) : 리스트 내부의 객체를 수정
        nick.set(2, "삐약이");
        System.out.println(nick);  //개구리 사라지고 삐약이로변경


        //remove : 리스트 내부 원하는값 제거
        //remove(인덱스) , remove(객체)
        nick.remove(5);
        System.out.println(nick);  // 야옹이, 멍멍이, 삐약이, 어흥이, 짹쨱이   *야옹이가지워짐
        nick.remove(str);
        System.out.println(nick); //멍멍이, 삐약이, 어흥이, 짹쨱이   *위에 str 로 선언했던 야옹이가사라짐


        //리스트의 반복문 처리
        for (int i = 0; i < nick.size(); i++) {
            System.out.println(nick.get(i));  // 멍멍이 삐약이 어흥이 짹짹이 순서대로 출력됨
        }

        System.out.println("-------------------------------------------------------");

        //향상 for문 (forEach)
        for (String s : nick) {
            System.out.println(s);  //멍멍이 삐약이 어흥이 짹짹이 순서대로 출력됨
        }




        //contains(객체) : 리스트 내의 객체의 존재 유무를 파악하는 메서드
        System.out.println(nick.contains("메뚜기"));  //false 메뚜기는없엇음


        //indexOf(객체) : 특정 객체의 인덱스 탐색
        int idx = nick.indexOf("어흥이");
        System.out.println("어흥이의 인덱스:" + idx);  //2  어흥이는 0 1  2<번에 있음


        //clear() : 리스트 요소를 전체 삭제
        nick.clear();
        System.out.println(nick);  // [] 비어버림


        //isEmpty() : 리스트가 비어있는지의 여부 확인
        System.out.println(nick.isEmpty());  //true 위에 clear 로지워서 비어있기에


        System.out.println("-------------------------------");


        /*
       #컬렉션 객체들은 collections 의 기능을 사용할수 있습니다.
       collections 는 컬렉션 객체들의 부가 기능들을 지원합니다.
        */

        List<Integer> score = new ArrayList<>();  //int 는 객체타입이아님 그렇기에 integer 로사용
//        Integer v1 = 65;   // v1 = new Integer(X)  이렇게안하고 객체넣을수있음 매우간단
         score.add(65);     // 이방법도가능하고

      //리스트 생성과 동시에 객체 초기화하기
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(nums);


       //한번에 객체 많이 추가하기 (생성이후 추가방법)
        Collections.addAll(score, 78 , 100, 88 , 79,100,21,56,100); //이건여러개넣는방법
        System.out.println(score);


        //컬렉션에서의 등장 횟수 구하기
        System.out.println("100점 학생 수:" +Collections.frequency(score,100));
        //score 에 100이 몇개있는지 확인법       출력:3


        //최대값 , 최소값 구하기
        System.out.println("최대값 :" + Collections.max(score));  // 100
        System.out.println("최대값 :" + Collections.min(score));  // 21


        //오름차 정렬(작은값부터 순서대로 커지는 정렬)
        Collections.sort(score);
        System.out.println(score);  //[21, 56, 65, 78, 79, 88, 100, 100, 100]


        //내림차 정렬(큰값부터 순서대로 작아지는 정렬)
        Collections.reverse(score);   //리버스는 그냥역순배치임
        System.out.println(score);//100, 100, 100, 88, 79, 78, 65, 56, 21
//      Collections.sort(score,Collections.reverseOrder());  //이게 내림차정렬


        //두 요소의 위치를 교체 : swap(리스트 , i , j )
        Collections.swap(score,3,7);
        System.out.println(score);  //100, 100, 100, 56, 79, 78, 65, 88, 21    *88 56 위치바뀜


        //리스트 내의 요소를 무작위로 섞기
        Collections.shuffle(score);
        System.out.println(score);  //그냥 이놈저놈다섞임



        //원하는 값으로 컬렉션 초기화
        Collections.fill(score, 100 );
        System.out.println(score);  // 전부 100으로바뀜





















    }
}
