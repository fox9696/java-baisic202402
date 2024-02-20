package basic.begin;

public class variableExample {

    public static void main(String[] args) {
        /*
         # 변수 (Variable)

         1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
         2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
         적당한 데이터 타입을 선언해야 합니다.
         ex) int: 4바이트의 정수, String: 문자열(문장)
         3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
         4. 변수 내부의 값은 언제든지 변경이 가능합니다.
         */

        //변수의 선언 : [자료형(데이터타입)] [변수명] ; *대괄호는실제로는빼고쓰기
        int age;

        //변수의 초기화 : [변수명] = [값];
        age = 40;

        //변수의 값 참조 (사용)
        System.out.println("age = " + age);  //soutv
        
        // 변수는 선언과 초기화를 동시에 할수 있습니다. 
        //처음만들때 한번만 가능합니다.(데이터타입이 앞에붙었다는것은 새롭게선언한다는것을의미)
        int score = 90; 
       // int score = 95;  (X) 중복선언 x  
        
        score = 95;  //데이터 타입이 안붙었다? -> 기존의 변수를 참조.

                
                //변수에는 다른 변수의 값도 저장이가능합니다
        int myscore = score - 20;
        System.out.println("myscore = " + myscore);
                
                //변수의 자료형에 맞지않는 데이터는 저장이 불가능합니다.
        //   int count = "한번"; (x) string 이기에 정수 타입으로 하면x
        //  int const = 23.5; (x)  정수타입인데 소수로해서
        // string str = 100; (x)   string 인데 정수넣어서



        // 변수는 자료형(데이터 타입) 이 달라도 이름이 동일하다면
        //중복 선언할 수 없습니다.
       String name = "홍길동" ;
      //  Int name = 1004;  (x) 변수명이같아서


        //선언 및 초기화하지 않은 변수는 사용이 불가능합니다.
        int result ;
    //    System.out.println("result = " + result); (x) 값을담아야사용가능 *초기화필요








    }



}
