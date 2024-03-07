package video.movie.domain;

import java.time.LocalDate;

/*
* 요금정책
* 1. 올해 출시된 영화는 기본적으로 5000원
* 2. 출시 후 1년이 지날때마다 500원씩 차감
* 3. 최소요금은 2000원이며 그 밑으로는 차감되지않음.
 */
public class ChargePolicy {

 private static final int BASE_CHARGE = 5000;
 private static final int DISCOUNT = 500;
 private static final int LIMIT_CHARGE = 2000;

 //전달된 movie 의 발행년도에 따른 가격을 계산하는 메서드
    public static int calculateDvdCharge(Movie movie) {
        //올해의 연도 정보
        int thisyear = LocalDate.now().getYear();

        //출시후 경과년도 계산
        int movieAge = thisyear - movie.getPubYear();

        //가격
        int charge = BASE_CHARGE - (movieAge * DISCOUNT);

        if (charge < LIMIT_CHARGE) {
            charge = LIMIT_CHARGE;
        }
        return charge;


    }


}

