package etc.lambda;

import oop.modi.member.pac1.A;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {

    //사과의 색상만 추출
    public static List<Color> mappingAppleByColor(List<Apple> apples) {
        List<Color> colorsList = new ArrayList<>();
        for (Apple apple : apples) {
            colorsList.add(apple.getColor());
        }
        return colorsList;
    }

    public static<X,Y> List<Y> map(List<X> list ,GenericFunction<X,Y>mapper) {
        List<Y> mappedList = new ArrayList<>();
        for (X x : list) {
            Y y = mapper.apply(x); //Y를 X에서 추출 <- 이 동작을 파라미터화 시키겠다
            mappedList.add(y); // 매핑리스트에 담기
        }
        return mappedList;
    }
}

