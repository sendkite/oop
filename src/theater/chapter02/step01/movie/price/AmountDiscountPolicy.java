package theater.chapter02.step01.movie.price;

import theater.chapter02.step01.money.Money;
import theater.chapter02.step01.movie.DiscountCondition;
import theater.chapter02.step01.movie.DiscountPolicy;
import theater.chapter02.step01.movie.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {

    private final Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening Screening) {
        return discountAmount;
    }
}
