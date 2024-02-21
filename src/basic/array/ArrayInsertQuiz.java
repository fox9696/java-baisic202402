package basic.array;

import java.util.Scanner;

public class ArrayInsertQuiz {
    public static void main(String[] args) {

        /*
         1. String 배열을 생성하세요. (foods)
         크기는 넉넉하게 50개로 지정하겠습니다.

         2. 사용자에게 음식 이름을 입력받아서 배열에
          삽입해 주세요.
          사용자가 음식 입력창에 '배불러' 라고 작성하면
          입력을 종료해 주세요.ㄴ

         3. 입력이 종료되면 사용자가 입력한 음식을
         가로로 출력해 주세요. (null은 출력하지 마세요.)

          추가 문제
        - 입력을 받았는데 이미 배열에 존재하는 음식이라면
        '이미 존재하는 음식입니다.' 를 출력하고
        다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.
        */

        String[] foods = new String[50];    //문자형 foods에 배열길이50개의 배열생성
       Scanner sc = new Scanner(System.in); // Scanner 선언후 스캐너생성 이름:sc
        System.out.print("음식이름을입력하세요 : ");
        System.out.print("배불러 를 입력시 종료");

        outer: for (int i = 0; i < foods.length; i++) {  // 반복문으로 i가 foods배열길이만큼커지게만듬
            System.out.print("> ");
            String food = sc.next();         // 내가 선언한 Scanner로 내가원하는 음식 입력

            if (food.equals("배불러")) {  // 1. 자바는 문자비교가안되서 equals사용해서 배불러단어비교
                System.out.println("배부르니까음식입력종료"); //2. 비교해서 "배불러"동일하면 출력
                break;              // 3. 동일했다면 종료
            }
            for (String n : foods){
                if(n == null) break;
                if (food.equals(n)) {    //중복발생
                    System.out.println("이미 존재하는 음식입니다");
                    i--;       //i-- 넣은이유는 for문에서 continue는 증감식이동작합니다
                            //우리의 의도는 이번회차가 무효인거지 ,건너뛰려는것은아니기때문에
                             //미리 제어변수 i의 값을 하나 감소시켜 놓습니다.
                    // 이걸안넣으면 중복된음식이 무효가되는게아닌  null로표현됨
                    continue outer;   //첫 for문에서 for옆에 outer넣어놨기에 선언가능
                                     //

            } }


            foods[i] = food;  //sc.next 에 작성한걸 foods[] 배열에넣기
        }
        System.out.print("내가먹고픈음식들 : ");   // 50개가가득찼던 배불러를 입력했건 반복문끝나면 여기로온후 출력
        for(String n : foods) {    // String n 안에 foods 의 작성한 배열을 모두담음
            if (n == null) break;  //50개입력안했으면 뜨는 나머지null을 출력안되게 break
            System.out.print(n + " ");  // 지금까지sc에입력한값들 n에담은후 n을출력함
        }

        sc.close();   //끝낫으면 닫자..















    }
}
