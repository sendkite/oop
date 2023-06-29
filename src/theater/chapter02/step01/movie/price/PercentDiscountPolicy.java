package theater.chapter02.step01.movie.price;

import theater.chapter02.step01.money.Money;
import theater.chapter02.step01.movie.DiscountCondition;
import theater.chapter02.step01.movie.DiscountPolicy;
import theater.chapter02.step01.movie.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
