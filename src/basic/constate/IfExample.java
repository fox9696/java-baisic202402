package basic.constate;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("키를 입력하세요(cm) : ");
        int height = sc.nextInt();

        if(height >= 140) {
            System.out.println("나이를 입력하세요 : ");
            int age = sc.nextInt();
            if (age >= 8) {
                System.out.println("놀이기구 탑승이 가능합니다");

            } else if (age >= 6) {
                System.out.println("보호자동반시 탑승이 가능합니다");

            }else {
                System.out.println("나이가 6세 미만 입니다");
                System.out.println("놀이기구 탑승이 불가 합니다");
            }
        }else  {
            System.out.println("키가 140cm 미만입니다");
            System.out.println("놀이기구 탑승이 불가합니다.");
        }

      //   System.out.println(age);  *출력안됨 age 는 if 문내부에서 선언했기에 외부에서는부를수없음
       //  변수는 선언된 블록내에서만 유효합니다 .

        //  System.out.println(height);  *이건출력됨 내부블록에서 변수선언된게아니기에 전역변수임
        sc.close();


    }
}
