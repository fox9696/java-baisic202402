package basic.constate;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("점수를입력하세요");
        int point = sc.nextInt();

        //Switch의 기준값은 정수 혹시 문자열만가능합니다. (실수는 소수점 양이너무많아서불가능)
        //연산의 결과값도 기준값으로 사용이 가능합니다.
        switch (point / 10) {   //점수가 100이면 너무양이많으니 10으로나눠서 진행하는방식


            case 10:
                if (point > 100) {
                    System.out.println("잘못된점수입니다");
                    break;   //else 안쓴이유 : 100~109를썼을때 잘못된방법인데 학점A 라고뜨는문제를해결하기위해
                }            //지금 case10에 if 를 사용한건데 100을입력하면 애초에 if 문이안걸리기에
            case 9:
                System.out.println("당신의 학점은 A 입니다");
                break;
            case 8:
                System.out.println("당신의 학점은 B 입니다");
                break;
            case 7:
                System.out.println("당신의 학점은 C 입니다");
                break;
            case 6:
                System.out.println("당신의 학점은 D 입니다");
                break;

            default:   //Switch 는 if 문 사용가능
                if (point > 100 || point < 0){
                    System.out.println("점수를 잘못입력 하셨습니다");
                } else {
                    System.out.println("당신의 학점은 F 입니다");
                }

        }
sc.close();





    }
}
