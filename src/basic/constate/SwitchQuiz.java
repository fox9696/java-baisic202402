package basic.constate;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {


/*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.( + ,- ,* ,/)
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
         만약 사용자가 나눗셈을 선택했을때 0으로 나누려는 시도를 한다면
         연산 할수없는 입력값 이라고 얘기 해 주세요
        */


        Scanner sc = new Scanner(System.in);
        System.out.println("정수1 : ");
        int num1 = sc.nextInt();

        System.out.println("연산을 선택하세요 [+ - * /]");
        String operator = sc.next();

        System.out.println("정수2 : ");
        int num2 = sc.nextInt();

        int result = 0;
        boolean flag = false;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num2 == 0 ){
                    System.out.println("연산할수없는입력값입니다");
                    flag = true;
                    break;
                }
                result = num1 / num2;
                break;

                default:    // + - * / 말고 다른 값이 들어온다면?
                System.out.println("연산기호를 정확하게 입력하세요 [+, - ,* ,/, ] ");

        }

       if (!flag) {
           System.out.printf("%d %s %d = %d\n", num1, operator, num2, result);

           sc.close();


       }
    }
}
