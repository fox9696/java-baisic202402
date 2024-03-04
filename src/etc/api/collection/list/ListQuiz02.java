package etc.api.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListQuiz02 {
    public static void main(String[] args) {

/*
         1. User 클래스를 은닉(캡슐화)된 변수 name, age로 선언해서 구현
          User클래스의 생성자는 모든 필드값을 받는 생성자 1개.

         2. User 객체를 모음저장할 수 있는 ArrayList를 선언. (main method)
         3. User 객체를 3개 생성해서 리스트에 추가하세요. (main method)

         4. 리스트에 저장된 모든 이름, 나이를 for문으로 출력 (향상 for문)
         5. 리스트 내부 객체 중 이름이 "홍길동" 이 있다면
               그 객체를 삭제해 주세요. (일반 for문)
         */


        List<User> userList = new ArrayList<>();

        User hong = new User("홍길동", 20);
        User kim = new User("김춘식" , 5);
        User park = new User("박영희" ,24);

        /*  이 방법도맞지만 조금코드를줄이기위해
        userList.add(hong);
        userList.add(kim);
        userList.add(park);
        */
        //Collections.addAll(userList, hong , kim ,park);   *2번째방법

        Collections.addAll(userList,   //3번쨰방법
        new User("홍길동", 20),
        new User("김춘식" , 5),
        new User("박영희" ,24)
        );

        for (User user : userList) {
            System.out.println(user); // toString()
        }


        System.out.println("------------------------------------------");
/*
 - forEach(향상 for문)을 사용하여 반복문을 순회할 때
          리스트의 크기를 마음대로 줄이거나 늘릴 수 없습니다.
         - 향상 for문은 반복문을 시작할 때 구조적으로 컬렉션의
          크기 및 사용 가능한 요소들의 개수를 항상 파악하고 있기 때문에
          값의 변경이 일어나면 예외를 발생시키도록 설계되어 있습니다.
 */

        //이건사용하지못하는이유 : 향상 for 문 은 배열의 갯수가 변화할수없음 그래도 오류뜬거임
//        for (User user : userList) {
//            if (user.getName().equals("홍길동")) {
//                userList.remove(user);
//            break ;   *break 걸면 되긴하는데 추천안함
//            }
//        }

        // 삭제를하거나해서 크기가줄어드는코드면 이 방식을 추천함
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            String name = user.getName();
            if (name.equals("홍길동")) {
                userList.remove(i);
            }
        }
        System.out.println(userList);
                         //이건 위에꺼 요약방식
//        for (int i = 0; i < userList.size(); i++)
      //  if (userList.get(i).getName().equals("홍길동")) {
       //     userList.remove(i);
      //  }























    }
}
