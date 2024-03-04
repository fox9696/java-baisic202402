package etc.api.util.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        System.out.println("-----------------------------------");

        //현재 날짜 정보 얻기 ( 연 , 월 , 일 )
        LocalDate now = LocalDate.now();
        System.out.println(now);


        // 현재 시간 정보 얻기 ( 시 분 초 )
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        //현재 날짜와 시간 정보 얻기 ( 연 월 일 시 분 초 )
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //특정 날짜와 시간 정보 얻기
        LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0);
        System.out.println("beginDate =" + beginDate);

        //연 월 일 따로 추출
        int year = localDateTime.getYear();
        System.out.println("year =" + year);    //2024

        //문자형태의 월 리턴 (Month라는 열거형 타입 중 하나 )
        Month month = localDateTime.getMonth();
        System.out.println("month =" + month);   //March
        //이건 위랑 다르게 정수형태의 월리턴
        int monthValue = localDateTime.getMonthValue();
        System.out.println("monthValue = " + monthValue); //3
        
        
        // 일 추출
        int dayValue = localDateTime.getDayOfMonth();
        System.out.println("dayValue = " + dayValue); // 4


        // 요일 ( 열거형 타입 리턴)
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);  // monday

        System.out.println("------------------------------------------------");

        //지금으로부터 3일 뒤
        LocalDateTime d2 = localDateTime.plusDays(3);
        //plus day week 등등 많음 
        System.out.println("d2 = " + d2);  // 2024-03-07


        //지금으로부터 1년 2개월 7일뒤 
        LocalDateTime d3 = localDateTime
                .plusYears(1)
                .plusMonths(2)
                .plusDays(7);
        System.out.println("d3 = " + d3);  // 2025-05-11

        //지금으로부터 9개월 23일 전 (과거)
        LocalDateTime d4 = localDateTime
                .minusMonths(9)
                .minusDays(23);
        System.out.println("d4 = " + d4);  //2023-05-12

        //사이 날짜 연산   2020 12 30 ~ 2022 9 14
        LocalDate b = LocalDate.of(2020, 12, 30);
        LocalDate f = LocalDate.of(2022, 9, 14);

        long between = ChronoUnit.DAYS.between(b, f);
        //days 는 며칠이지낫는지  Weeks 는 몇주가지낫는지 Months 는 몇달이지낫는지
        System.out.println("between = " + between);  // 623

        System.out.println("------------------------------------------");

        //날짜 포맷 변경하기
        System.out.println(localDateTime);
        //객체 생성 -> 원하시는 날짜 형태를 서식문자로 표현
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
        System.out.println(localDateTime.format(dtf)); //2024년3월04일 월요일 12시 15분 50초
        //yyyy 년 MM월 dd일 E요일 a hh시 mm분 ss초 - 2024년3월04일 월요일 오전(오후) 12시 15분 50초

        //준비한 DateTimeFormatter 객체를 format() 매개값으로 전달
        System.out.println(localDateTime.format(dtf));
    }
}
