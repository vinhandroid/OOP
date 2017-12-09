package vinhpv.tgg.java;

import java.util.ArrayList;

public class SoftwareHouse {
	private String softwareHouse;
	private ArrayList<Programmer> programmers = new ArrayList<Programmer>();
	public String getSoftwareHouse() {
		return softwareHouse;
	}
	public void setSoftwareHouse(String softwareHouse) {
		this.softwareHouse = softwareHouse;
	}
	public ArrayList<Programmer> getProgrammers() {
		return programmers;
	}
	public SoftwareHouse(String softwareHouse) {
		super();
		this.softwareHouse = softwareHouse;
	}
	public void setProgrammers(ArrayList<Programmer> programmers) {
		this.programmers = programmers;
	}
	
	public void hire (Programmer e) {
		programmers.add(e);
	}
	void displayStaff() {
		System.out.println("SoftwareHouse:\t" + softwareHouse);
		for(Programmer g : programmers) {
			System.out.println("=========================================");
			g.display();
		}
	};
	
		
		
	
}
