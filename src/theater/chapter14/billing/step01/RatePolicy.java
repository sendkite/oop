package theater.chapter14.billing.step01;

import theater.chapter14.money.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
