package etc.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;
import static java.util.stream.Collectors.*;

public class Filtering {
    public static void main(String[] args) {

        //stream의 filter
        //필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환.

        //메뉴 중 채식주의자가 먹을 수있는 음식들만 필터링
        menuList.stream() //menuList 정보를 가진 stream 객체를받음
       .filter(dish -> dish.isVegetarian()) //stream 객체의 filter 호출(predicate인터페이스를 구현한 객체
       .collect(toList()) //필터링된 stream 객체를 List로 변환해서 리턴
       .forEach(dish -> System.out.println("dish = " + dish)); //리스트 내부 순회 (void)

//       dishInVegetarian.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("====== 육류이면서 600 칼로리 미만의 요리를 필터링 ======");
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT && dish.getCalories() < 600)
                .collect(toList())
                .forEach(dish -> System.out.println(dish));



    }
}
