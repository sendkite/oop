package theater.chapter02.step01.movie.price;

import theater.chapter02.step01.movie.DiscountCondition;
import theater.chapter02.step01.movie.Screening;

public class SequenceCondition implements DiscountCondition {

    private final int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
