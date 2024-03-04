package etc.api.lang.wrapper;

public class WrapperExample {
    public static void main(String[] args) {


        int a = 100;
        boolean b = false;
        char c = 'A';
        double d= 3.14;

        // boxing  : 기본 데이터 타입을 객체 타입으로 변환 하는 과정. -> deprecated (지금은사라진문법)
        //Integer v1 = new Integer(a);
         //boolean v2 = new boolean(b) ;

        //unboxing : 객체 타입으로 포장된 값을 기본 데이터 타입으로 풀어내는 과정 -> deprecated
        // int i = v1.intValue(); -> deprecated


        //autoboxing : 기본타입을 자동으로 객체형으로 변환 *이게 사용가능한문법
        Integer v1 = a;
        Boolean v2 = false;
        Character v3 = c;
        Double v4 = d;
        //String 변수선언하듯 대문자로 각타입쓰면 객체로 포장(변환)

        //Autounboxing : 객체 포장을 기본형으로 자동 해제 가능
        int i = v1;
        double d2 = v4;

        //Autoboxing 이후에 Wrapper 클래스는 문자열을 기본형으로
        //변환하는데 많이 사용합니다
        int i1 = Integer.parseInt("351");
        double d3 = Double.parseDouble("3.14");

        //해당 타입으로 변환할수 없는 문자열을 시도했을경우
        //NumberFormatException 예외가 발생
       // Integer.parseInt("24.35");







    }
}
