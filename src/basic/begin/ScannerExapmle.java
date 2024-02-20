package basic.begin;

// 1, Scanner API 로딩 (제공되는 Scanner 클래스 정보를 현재 클래스로 가져오자 main에 Scanner쓰고 자동완성시키면 위에저절로생김)
import java.util.Scanner;

public class ScannerExapmle {
    public static void main(String[] args) {

        //2,스캐너 객체를 생성
        Scanner sc = new Scanner(System.in);  //이러면 sc 변수는 스캐너 type 객체가 됨

        /*
         3. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
         - next(): 공백이 없는 문자열을 입력받습니다.  *문자열 홍 길 동 이라고하면 홍만출력
         - nextLine(): 공백을 포함한 문자를 입력받습니다. *문자열 홍 길 동 하면 그대로출력
         - next + 기본타입이름(): 해당 타입에 맞는 데이터를 입력받습니다.
         ex)
             nextInt(): 정수 데이터를 입력받습니다.
             nextDouble(): 실수 데이터를 입력받습니다.
         */

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();


        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.printf("제 이름은 %s이고 , 나이는 %d세 입니다 . \n" , name , age);



        //4. 스캐너 객체를 반납
        // 객체를 반납 -> Scanner 객체를 메모리에서 삭제
        sc.close();








    }
}
