package finalProject;

public class Books extends Library {

	public String setTitle() {
		return "Test";
	}

	public int setNum() {
		return 12345;
	}
	
	public boolean setReserved() {
		return true;
	}
	
	public String dueDate() {
		return "01/10/2019";
	}
	
	public String setCheckedIn() {
		return "01/11/2019";
	}
	
	public double fine() {
		return 0.5;
	}
	
	public String toString() {
		return super.toString() + "\nThe due date is: " + dueDate() + "\nIt was checked in on: " + setCheckedIn() + "\nLate Fee: " + fine();
	}
}