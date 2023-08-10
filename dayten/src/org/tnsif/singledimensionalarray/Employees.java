// A program to demonstrate on arrays on arrays of objects

package org.tnsif.singledimensionalarray;

public class Employees {
	private int ID;
	private String name;
	private double salary;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employees(int iD, String name, double salary) {
		
		ID = iD;
		this.name = name;
		this.salary = salary;
	}
	
	
}
