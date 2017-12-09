package vinhpv.tgg.java;

public class Programmer extends Employee {
	private String theLanguage;

	public String getTheLanguage() {
		return theLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		this.theLanguage = theLanguage;
	}

	public Programmer(int thePayrollNumber, int theMonthlySalary, String theName, String theLanguage) {
		super(thePayrollNumber, theMonthlySalary, theName);
		this.theLanguage = theLanguage;
	}
	
	
	public Programmer() {
		super();
	}

	void display() {
		super.display();
		System.out.println("The Language:\t" + theLanguage);
	}
}
