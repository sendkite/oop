package theater.chapter05.movie;

import theater.chapter05.money.Money;

import java.time.Duration;

public class PercentDiscountMovie extends Movie {

    private double percent;

    public PercentDiscountMovie(String title, Duration runningTime, Money fee, DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
        this.percent = percent;
    }


    @Override
    protected Money calculateDiscountAmount() {
        return getFee().times(percent);
    }
}
