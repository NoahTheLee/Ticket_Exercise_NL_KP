public class AdvanceTicket extends Ticket{
    public AdvanceTicket(double price, int number, int numOfDaysPurchasedEarlier) {
        super(price, number);
        if(numOfDaysPurchasedEarlier > 10) {
            this.price *= 0.6;
        } else if(numOfDaysPurchasedEarlier > 0) {
            this.price *= 0.8;
        } else {
            throw new IllegalArgumentException("must be greater than 0");
        }
    }

    public AdvanceTicket(double price, int numOfDaysPurchasedEarlier) {
        this(price, -1, numOfDaysPurchasedEarlier);
    }

    public AdvanceTicket(int number, int numOfDaysPurchasedEarlier) {
        this(50.0, number, numOfDaysPurchasedEarlier);
    }

    @Override
    public String toString() {
        return "Advanced Ticket, " + super.toString();
    }
}
