package org.tnsif.singleinheritance;
//child class
public class Student extends Citizen 
{
	//private members
	private int rollno;
	private String collegeName;
	
	//Getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	// parameterised constructor
	
	public Student(String city, int pincode, long adharNo, String area, int rollno, String collegeName) {
		super(city, pincode, adharNo, area);
		this.rollno = rollno;
		this.collegeName = collegeName;
	}
	
	//tostring method
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
}
