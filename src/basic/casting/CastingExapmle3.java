package basic.casting;

public class CastingExapmle3 {
    public static void main(String[] args) {

        char c = 'B';
        int i = 2;

        int intResult = c + i;
        char charResult = (char) (c+i);

        System.out.println("intResult = " + intResult);  // 68 int 가 더커서 자동형변환
        System.out.println("charResult = " + charResult); // d

 
        int k = 10;
        double d = k / 4;
       //double d = k / 4.0;  // *k좌측에 (double)안넣은이유는 작은쪽은 큰쪽을따라가서 double의 4.0을 k(int)가 따라간것
        System.out.println("d = " + d);  //출력 :2.0 *int 값으로출력되서 int 는 소수점표현못하기에 뒤에 0.5를 버림
        
        
    }
}
