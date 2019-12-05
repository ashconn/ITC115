package assign10;

public class WalkupTicket extends Ticket {

	public WalkupTicket(int num) {
		super(num);
		super.price = 50.0;
	}

	public String toString() {
		return super.toString() + "\nThis is the price of buying a ticket on the same day as the event.";
	}
}
