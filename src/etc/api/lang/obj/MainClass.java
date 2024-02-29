package etc.api.lang.obj;

public class MainClass {
    public static void main(String[] args) {


        Person kim = new Person("김춘식" , 30);
        Person hong = new Person("홍길동" , 25);


//객체타입의 변수를 출력하거나 값을 얻을 떄는
        //뒤에 자동으로 .toString() 이 붙어서 진행됩니다.(Object 가 물려주는 메서드)
        System.out.println(kim);
        System.out.println(hong);


        if (kim.equals(hong)) {
            System.out.println("이름과 나이가 같습니다");
        }else {
            System.out.println("이름이 다를수도 , 나이가 다를수도 , 둘다 다를수도..");
        }


        System.out.println(kim.hashCode());
        System.out.println(hong.hashCode());


        //finalize 는 gc를 호출하는 순서가 보장되지않기때뮨에
        // 사용이 권장되지않음 ( deprecated )
//        hong = null;
//        kim = null;
//        System.gc(); // 가비지 컬렉터 (버려진객체모음)  *호출한다고 바로 안 올수도있음 실행순서가있어서

 Person park = new Person("박복제인간" , 100);
// Person clonePerson = park ;

        try {
            Person clonePerson = (Person) park.clone();
            System.out.println("복사된 객체정보" + clonePerson);
            park.setName("박영희");
            System.out.println(park);
            System.out.println(clonePerson);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
