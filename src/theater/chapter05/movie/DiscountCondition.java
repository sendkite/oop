package theater.chapter05.movie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
