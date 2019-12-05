package assign10;

public class Ticket {
	double price = 50.0;
	private int num;
		
	public Ticket(int num) {
		this.num = num;
	}
		
	public double getPrice() {
		return this.price;
	}
		
	public String toString() {
		return "Ticket #" + this.num + ", Price: " + this.getPrice();
	}
	
	public static void main(String[] args) {
		Ticket ticket1 = new WalkupTicket(1);
		
		System.out.println(ticket1);
	}
}