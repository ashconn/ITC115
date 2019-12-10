package finalProject;

//A class to represent a library of objects (books, CDs, DVDs, video games)
public abstract class Library {
	private String title = "";
	private int num;
	private String checkedIn = "";
	private String dueDate = "";
	private boolean reserved;
	private double fine;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(String checkedIn) {
		this.checkedIn = checkedIn;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	public void setFine(double fine) {
		this.fine = 0.5;
	}
	
	public String toString() {
		return this.title + " Item No: " + this.num + " is " + this.reserved;
	}
	
	public static void main(String[] args) {
		Library book1 = new Books();
		
		System.out.println(book1);
	}
}
