package basic.array;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

/*
#2차원 배열
- 배열 안에 배열이 존재하는 형태를 2차원 배열이라고 합니다
- 실제 배열에는 배열의 주소값이 들어가게됩니다 .

 */

        // int [] arr = {1,2,3};
        int[][] arr={
            {1, 2, 3} ,
            {4, 5, 6} ,
            {7, 8, 9} ,
            {10, 11, 12,13,14}


        };

        System.out.println(arr.length);
        System.out.println("arr[0] = " + Arrays.toString(arr[0]));
        //arr[0]이라고쓰면 출력이 주소로되는이유는 배열값이담긴 주소를 arr이품고있기때문에 각각의 배열안의배열을보고싶으면
        //Arrays.toString으로 봐야한다
        System.out.println("arr[1] = " + Arrays.toString(arr[1]));
        System.out.println("arr[2] = " + Arrays.toString(arr[2]));
        System.out.println("arr[3] = " + Arrays.toString(arr[3]));

        System.out.println("arr[1][2] = " + arr[1][2]);
        System.out.println("arr[2][0] = " + arr[2][0]);


        //2차원 배열 내부의 배열 요소들을 한 눈에 확인할수잇는 메서드
        System.out.println(Arrays.deepToString(arr)); //String이기때문에 문자열로출력됨


        System.out.println("------------------------------------------------");
        
        //빈 2차원 배열 만들기 
        int[][] arr2 = new int[3][4] ;    //3개의배열덩어리에 4개의배열길이
      System.out.println(Arrays.deepToString(arr2));


      arr2[1][2] = 50;
      arr2[2][1] = 70;
      for (int[]array :arr2) {   //arr2의 배열을받아야하기에 int[]변수 로 선언해야함
          for (int n :array){
              System.out.print(n+ " ");
          }
          System.out.println(); //줄 개행 하려고 씀

        }















    }


}
