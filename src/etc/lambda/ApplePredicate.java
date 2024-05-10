package etc.lambda;

@FunctionalInterface//해당인터페이스가 람다 표현식으로 객체생성이가능한 인터페이스인지를 구분하는 어노테이션
                    //인자를 문법 검사

public interface ApplePredicate {
    //사과를 전달받으면 조건에 맞는 검사를 수행하는 메서드
    boolean test(Apple apple);



}
