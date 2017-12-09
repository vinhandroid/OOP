package vinhpv.tgg.java;

public class Employee {
	private int thePayrollNumber;
	private int theMonthlySalary;
	private String theName;
	public int getThePayrollNumber() {
		return thePayrollNumber;
	}
	public void setThePayrollNumber(int thePayrollNumber) {
		this.thePayrollNumber = thePayrollNumber;
	}
	public int getTheMonthlySalary() {
		return theMonthlySalary;
	}
	public void setTheMonthlySalary(int theMonthlySalary) {
		this.theMonthlySalary = theMonthlySalary;
	}
	public String getTheName() {
		return theName;
	}
	public void setTheName(String theName) {
		this.theName = theName;
	}
	public Employee(int thePayrollNumber, int theMonthlySalary, String theName) {
		super();
		this.thePayrollNumber = thePayrollNumber;
		this.theMonthlySalary = theMonthlySalary;
		this.theName = theName;
	}
	public Employee() {
		super();
	}	
	// class Employee
	void display() {
	System.out.println("Payroll Number:\t" +thePayrollNumber);
	System.out.println("Monthly Salary:\t" +theMonthlySalary);
	System.out.println("First Name:\t" + theName);
	}
	
	
}
