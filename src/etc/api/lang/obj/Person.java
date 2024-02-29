package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //toString(): 객체의 정보(필드) 를 문자열 형태로 리턴.
    @Override
    public String toString() {
        return "Person [이름: " + name + ", 나이: " + age + "]";
    }

    @Override
    public boolean equals(Object obj) {   //타입은 바꾸면안되는데 이름은바꿔도됨
        if (this == obj) return true;  //주소값이 같다면 같은 객체다
        if (obj instanceof Person) {
            Person p = (Person) obj;  //Object 타입을 Person 타입으로 형 변환 -> name 과 age 를 확인하기위해서
            if (this.name.equals(p.name) && this.age == p.age) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {     //주소값 확인할수잇는 메서드
        return Objects.hash(name, age);
    }
    protected  void finaliz() throws Throwable {
        //생성된 객체가 사라지는 시점에서 자동으로 호출 (gc가 실행될때)
        System.out.println(this.name + "이 죽었습니다.");
    }

    //객체 복사 메서드
    //cloneable 인터페이스를 구현해서 사용해야 합니다.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

public void setName(String name) {
        this.name = name;

}


    public void personInfo() {
        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age + "세");
    }
}
