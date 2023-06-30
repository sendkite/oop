package theater.chapter02.step01.movie.price;

import theater.chapter02.step01.money.Money;
import theater.chapter02.step01.movie.DiscountPolicy;
import theater.chapter02.step01.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
