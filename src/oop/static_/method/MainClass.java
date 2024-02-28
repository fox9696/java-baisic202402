package oop.static_.method;

import oop.modi.member.pac2.C;
import util.Utility;

import static util.Utility.*;

public class MainClass {
    public static void main(String[] args) {


        Count c = new Count();
        int result = c.method1();

       int result2 = Count.method2();



        makeLine();   //static 통해서 가져옴 *출력화면 줄긋기효과

        String name = input("이름을 입력하세요");  //static 통해서 가져옴 *sc.name 효과
        System.out.println("name = " + name);


    }
}
