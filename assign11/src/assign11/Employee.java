package assign11;

// A class to represent employees in general.
public class Employee {
    public void applyForVacation() {
        System.out.println("Use the yellow vacation form.");
    }

    public void showHours() {
        System.out.println("I work 40 hours per week.");
    }

    public void showSalary() {
        System.out.println("My salary is $40,000.");
    }

    public void showVacation() {
        System.out.println("I receive 2 weeks vacation.");
    }

	public static void main(String[] args) {
	    System.out.println("Harvard Lawyer: Jessica");
	    HarvardLawyer Jessica = new HarvardLawyer();
	    Jessica.applyForVacation();
	    Jessica.showHours();
	    Jessica.showSalary();
	    Jessica.showVacation();
	    Jessica.sue();
	    System.out.println();
	
	    System.out.println("Janitor: Bob");
	    Janitor Bob = new Janitor();
	    Bob.applyForVacation();
	    Bob.showHours();
	    Bob.showSalary();
	    Bob.showVacation();
	    Bob.clean();
	}
}