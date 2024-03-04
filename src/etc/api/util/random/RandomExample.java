package etc.api.util.random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        Random r = new Random();

        //실수 난수 : 0.0 <= ~ < 1.0
        double d = r.nextDouble();
        System.out.println("d = " + d);

        //정수 난수 : nextInt();
        int i = r.nextInt(); //기본범위 : int 의 전범위 (-약21억 ~ 약21억)
        System.out.println("i = " + i);
        //0~5까지의 정수 난수 생성 ( 끝값이 미만으로인식됨)
        int j = r.nextInt(6);  //앞자리안잡으면 0부터
        System.out.println("j = " + j);

        //10~100까지의 정수 난수 생성
        int k = r.nextInt(91) + 10;   //괄호안은 최대 밖은 최소값인데 최소값이 + 되기에 최대수에서 최소값빼기
        System.out.println("k = " + k);

        boolean b = r.nextBoolean();
        System.out.println("b = " + b);  // true false 중에 랜덤으로
    }
}
