package basic.loop;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            if (i > 6) break;  //즉시반복문종료
            System.out.print(i + " ");
        }
        System.out.println("\n반복문종료!");


        System.out.println("--------------------------------------------------");

        for (int i = 1; i < 11; i++) {
            if (i == 6) continue;  //반복문은끝까지 가지만 continue 이붙은곳은 무시하고 다음으로넘어감
            System.out.print(i + " ");
        }
        System.out.println("\n반복문종료!");





        System.out.println("--------------------------------------------------");


        Scanner sc = new Scanner(System.in); //반복문 안에있으면 계속반복되서 while 문 밖으로꺼냄
        System.out.println("15 x 6 = ???");//반복문 안에있으면 계속반복되서 while 문 밖으로꺼냄
        System.out.println("정답을 모르시면 0을 입력하면 종료됩니다");//반복문 안에있으면 계속반복되서 while 문 밖으로꺼냄

        while (true) {

            System.out.print("> ");
            int answer = sc.nextInt();

            if (answer == 90) {
                System.out.println("정답입니다!");
                break;
            } else if (answer == 0) {
                System.out.println("정답은 90이었습니다");
                break;

            }else  {
                System.out.println("틀렸습니다");
            }
        }





























    }
}
