package theater.step02;

public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket) {
        if (this.hasInvitation()) {
            this.setTicket(ticket);
            return 0L;
        } else {
            this.setTicket(ticket);
            this.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
