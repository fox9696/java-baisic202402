package oop.string;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {


        String str = "Hello Java";

        //charAt(index) : 문자열 인덱스에 따른 단일 문자를 반환.
        char c = str.charAt(4);
        System.out.println("4번 인덱스 = " + c);      //0번부터 시작해서 h e l l o <<4번째라서 출력값 : o





        //subString(begin,end) : 문자열을 범위를 지정해서 부분 추출.
        String ss1 = str.substring(1, 5);   // ello 출력됨 1번부터5미만 으로 출력되기에 미만으로 출력되는거 꼭 기억
        System.out.println("ss1 = " + ss1);

        String ss2 = str.substring(6);  //처음값끝값말고 처음값만주면 6번부터 끝까지 출력 출력문:java
        System.out.println("ss2 = " + ss2); //java 출력됨
    
       //length(): 문자열의 총 길이 변환.
        int len = str.length();  //10이출력된이유 공백포함 10글자라서
        System.out.println("len = " + len);    //출력:10





        //indexOf(str) : 해당문자가 있는 인덱스를 반환
        //해당 문자가 존재하지않는다면 -1 리턴.
        int idx1 = str.indexOf("l");  
        System.out.println("idx1 = " + idx1);  //출력 : 2   hello에 l이  0,1,2번째라서
 
        int idx2 = str.lastIndexOf("l");   //뒤에서부터탐색 
        System.out.println("idx2 = " + idx2);    //출력 : 3   마지막부터 시작해서 L의 index위치가 3이라 




        //여러문자를 전달하면 시작 인덱스를 알려줍니다.
        int idx3 = str.indexOf("java");
        System.out.println("idx3 = " + idx3);  //출력 : -1   이유 : j는 소문자 본문은J대문자
        int idx33 = str.indexOf("Java");
        System.out.println("idx3 = " + idx33);  //출력 : 6  공백포함6번째에잇어서





        //toLowerCase  , toUpperCase
        String str2 = "HeLLo WoRLd"; 
        String lower = str2.toLowerCase(); // 일괄 소문자 변경
        System.out.println("lower = " + lower);  // 출력 : hello world
        String upper = str2.toUpperCase(); // 일괄 대문자 변경
        System.out.println("upper = " + upper); // 출력 : HELLO WORLD




      
        // trim() : 문자열의 앞 뒤 공백을 모두제거.
        String name = "                       홍길동           ";
        System.out.println("name = " + name);  //출력 : "                       홍길동           ";
        System.out.println("name = " + name.trim());  //출력 : "홍길동";  *공백 사라짐 




        
        //replace(old , new) : 기존 문자열 내부의 old 값을 모두 찾아서 new 문자열로 일괄변경 
         String java = "자바는 재밌습니다. 자바 커피는 맛있습니다";
        System.out.println(java.replace("자바" , "java")); //출력 : 자바가 java로 바뀜
        System.out.println(java.replace("습니" , ""));  //출력 : 습니 ->공백으로바뀌어서
        // 자바는재밌다 자바커피는 맛있다





        //split(구분자) : 문자열을 구분자로 구분하여 분할 .
        //분할된 문자들은 String 배열에 담겨서 리턴.
        String phone = "010-1234-5678";
        String[] numbers = phone.split("-");
        System.out.println(Arrays.toString(numbers)); //출력 : [010, 1234, 5678] 로 나옴 문자형이라 010에 0이 앞에붙을수잇음
        
        String pet = "멍멍이 , 야옹이 ,짹짹이";
        String[] pets = pet.split(",");
        System.out.println(Arrays.toString(pets)); //출력 : [멍멍이  , 야옹이 , 짹쨱이 ]

        System.out.println("----------------------------------------");





        //문자열의 정수/실수 변환
        String s1 = "100";
        String s2 = "3.14";
        System.out.println(s1 +s2 ); // 출력 :  1003.14
        //순수한 정수 or 실수로 이루어져 있어야 변형이 가능합니다.
        int i = Integer.parseInt(s1); //s2는출력안됨 이유:3.14는 실수라
        double d = Double.parseDouble(s2); //문자열 -> 실수변경
        System.out.println(i+d);  //출력 : 103.14   s1,s2둘다 정수실수로바뀌어서 100+3.14 = 103.14 로출력됨




        //valueOf : 기본타입을 문자열로 변경
        System.out.println(String.valueOf(i) + String.valueOf(d));
        //정수,실수로바꾼 i,d가 다시 문자열로바뀌어서 1003.14로출력









    }
    
    

}
