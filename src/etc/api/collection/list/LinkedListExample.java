package etc.api.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();  //맨앞 List 라고만 선언해도됨

        //추가
        list.add("김철수");
        list.add("홍길동");
        list.add("박영희");

        //맨앞 , 맨뒤에 추가하는법
        list.addFirst("맨앞");
        list.addLast("맨뒤");
        System.out.println(list); // [맨앞, 김철수, 홍길동, 박영희, 맨뒤]

        System.out.println(list.get(3));  //박영희
        System.out.println(list.getFirst());  //
        System.out.println(list.getLast());  //

        list.remove("맨앞");
        System.out.println(list); // [김철수, 홍길동, 박영희, 맨뒤]

        //LIFO -> last in , first out -> stack
        // 가장마지막에넣은객체가 가장처음으로 나온다라는뜻
        //push(맨앞) , pop(맨앞삭제하면서 읽기), peek(맨앞삭제안되고 읽기만하기)

        //push : 맨앞에서부터 추가
        list.push("김춘식");
        System.out.println(list); //[김춘식,김철수, 홍길동, 박영희, 맨뒤]


        //pop : 맨앞호출+ 삭제하면서 데이터를 읽기
        System.out.println(list.pop()); //김춘식
        System.out.println(list);  //김춘식사라짐 [김철수, 홍길동, 박영희, 맨뒤]

        //peak : 맨앞호출+ 삭제는안되고 읽기만
        System.out.println(list.peek()); //김철수
        System.out.println(list);  //  [김철수, 홍길동, 박영희, 맨뒤]  김철수삭제안됨


        //FIFO -> first in , first out -> Queue (큐 : 대기열이란뜻)
        //offer(맨뒤부터추가)  , poll  , peek
        list.offer("a");
        list.offer("b");
        list.offer("c");
        System.out.println(list);  //[김철수, 홍길동, 박영희, 맨뒤, a, b, c]


        //poll ( 맨앞호출 + 삭제)
        System.out.println(list.poll());  //김철수
        System.out.println(list);   // [홍길동, 박영희, 맨뒤, a, b, c]


        //peek (맨앞호출 + 삭제는안됨

        System.out.println(list.peek()); // 홍길동
        System.out.println(list);  //맨앞호출 + 삭제는안됨 [홍길동, 박영희, 맨뒤, a, b, c]







    }
}
