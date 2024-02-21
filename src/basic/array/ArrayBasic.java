package basic.array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // #배열 (array)
        // 같은 데이터 타입의 값을 집합 형태로 나열 하기 위한 자료형


        //1, 배열 변수를 선언
        int[] i;   //변수[]  java는 이방식으로 주로 선언
        int y[]; // c언어 style

        //2. 배열 객체를 생성 - 실제 값들이 저장될 공간을 형성
        //생성할때 배열의 크기를 지정해야 한다.
        i = new int[5];  //[ ] 안에 숫자를입력하는만큼 크기지정


        //3. 배열의 초기화 - 배열 내부에 실제 값들을 저장
        // 배열의 초기화는 인덱스를 이용합니다 .
        //인덱스 : 배열 내부의 위치를 지정할 수 있는 값
        //인덱스는 0번 부터 시작하여 1씩 순차적으로 증가합니다.

       //  i = 65; 잘못된방식
        i[0] = 65; //맞는방식 몇번 index 에 넣을지 선택후 선언
        i[1] = 88;
        i[2] = i[0]; //가능한방식
        // i[3] = 3.14  *i는 int이기에 소수는 X 넣고싶으면 (int)3.14
        i[3] = (int) 3.14;
        i[4] = 100;
      //  i[5] = 600;   *index 범위를초과해서 불가능 , 크기를 5로정해서 01234 까지만 문법은옳기에 오류라고뜨진않음 그래서
        //본인이 직접찾아야함



        //4. 배열의 총 크기(길이) 확인 -> 배열변수명.length
        System.out.println("i배열의 길이 :" + i.length );



        //5, 배열에 저장된 값을 참조(사용)하는 법 -> index 를 활용
        System.out.println("배열의 첫번째 데이터 :" + i[0]);
        System.out.println("배열의 첫번째 데이터 :" + i[1]);
        System.out.println("배열의 첫번째 데이터 :" + i[2]);
        System.out.println("배열의 첫번째 데이터 :" + i[3]);
        System.out.println("배열의 첫번째 데이터 :" + i[4]);

        System.out.println("---------------------------------");


        //6. 배열의 반복문 처리
        //배열은 인덱스를 제어변수로 활용하여 쉽게 반복문 처리 가능
        for (int idx=0; idx<i.length; idx++)
        {
            System.out.printf("배열의 %d번째 데이터: %d\n",idx,i[idx]);
        }
 
        

        //7. 배열 내부 요소값을 문자열 형태로 한눈에 확인
      //  System.out.println("i =" + i); *이러면 이진법으로츌력됨
        //배열 변수에는 배열의 주소가 들어있습니다

        System.out.println("i = " + Arrays.toString(i));

        //8. 배열은 선언과 생성이 동시에 가능
        double[] dArr = new double[3];
        String[] sArr = new String[4];
        byte[] bArr = new byte[10];


        //배열은 생성됨과 동시에 각 타입의 기본값으로 자동 초기화 됩니다.
        //아무값도입력안해도 값은입력되있음
        System.out.println(Arrays.toString(dArr));
        System.out.println(Arrays.toString(sArr));
        System.out.println(Arrays.toString(bArr));



        //9.배열의 생성과 동시에 초기화도 하는 방법
        char[] letters = new char[]{'a','b','c','d'};
        System.out.println(Arrays.toString(letters));



        //선언과 동시에 초기화를 할때 딱 한번만 가능한 문법
        //배열은 크기가 고정이기 때문에 늘어나거나 줄어들수있습니다
        //만약 배열의 크기를 늘리거나 줄이고싶다면
        //기존의 배열을 조작하는것이아니라 새롭게생성해야합니다.

String[] names = {"홍길동" ,"김철수" ,"박영희"};  // new String [] 이걸생략함
        // 대신 위에 처럼 문법을쓰면 타입크기가 고정이되서
        // names = {"홍길동" ,"김철수" ,"박영희" , "뿡뿡이"}
        //이렇게 늘리는게불가능
        names = new String[] {"홍길동" ,"김철수" ,"박영희" , "뿡뿡이"};  // 추가하려면 이방식으로만가능



























    }
}
