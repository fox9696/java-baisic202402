package basic.constate;

import java.util.Scanner;

public class SwithExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("성별을 입력하세요. (M/F)");
        System.out.print("> ");
        String gender = sc.next();

        /*
         switch 괄호 안에 지정하신 기준값에 따라
         만족하는 case 문을 순서대로 탐색합니다.
         적합한 case 가 존재하는 경우에는 해당 case 에
         종속된 문장을 실행합니다.
         따로 조치가 없다면 나머지 케이스들이 연속적으로 실행됩니다.
         */

   switch (gender) {    // () 안에는 기준을.. gender 값을구하는거엿기에 gender 를넣음

       case "m" :      //break 를 선언안해서 m 입력시 M 답변이출력됨 Break 를 안쓰면 아래로내려가는 성질을이용함
       case "M" :
       case "ㅡ" :
           System.out.println("남성입니다");
           break;  //해당케이스만 실행하고 switch 문을 종료 *안쓰면 M 만 입력해도 F 까지 출력됨



       case "F": case "f": case "ㄹ" :  //위는설명을하기위해서세로로배치했는데 실제론 이렇게 가로로 많이씀
           System.out.println("여성입니다");
          break;


       default:            //지정한 M F 말고 다른값을입력할시 실행됨
                          //case를 설정하지 않은 값들은 모두 default 로 빠집니다.
           System.out.println("잘못된 입력입니다");
   }


























    }
}
