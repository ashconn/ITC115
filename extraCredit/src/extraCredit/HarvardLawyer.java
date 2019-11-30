// A class to represent lawyers.
public class Lawyer extends Employee {
	// overrides getVacationDays from Employee class
	public int getVacationDays() {
		return super.getVacationDays() + 5;
	}

	// overrides getVacationForm from Employee class
	public String getVacationForm() {
		 return lawyerVacationForm;
	}

	// this is the Lawyer's added behavior
	public void sue() {
		System.out.println("I'll see you in court!");
	}
	
	
	// these are so that test cases can change the Lawyer values
	// and make sure that subclasses also change
	private String lawyerVacationForm = "pink";
	
	public final void setVacationForm(String form) {
		lawyerVacationForm = form;
	}
}

// A class to represent employees in general.
// (We put the Lawyer and Employee classes in the same file for this problem
// due to limitations of the Practice-It system.)
// A class to represent employees in general.
public class Employee {
	public int getHours() {
		return baseHours;                // 40 hours/week
	}

	public double getSalary() {
		return baseSalary;               // $40,000.00
	}

	public int getVacationDays() {
		return baseVacationDays;         // 10 days
	}

	public String getVacationForm() {
		return baseVacationForm;         // yellow
	}
}

public class HarvardLawyer extends Lawyer {
    public double getSalary() {
        return super.getSalary() * 1.2;
    }
    
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }
    
    public String getVacationForm() {
        String vaycay = "";
        
        for (int i = 0; i < 4; i++) {
            vaycay += super.getVacationForm();
        }
        
        return vaycay;
    }
}
