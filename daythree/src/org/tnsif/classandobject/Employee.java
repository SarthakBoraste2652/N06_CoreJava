//Program to demonstrate on class and objects

package org.tnsif.classandobject;

//class declaration
public class Employee {
	
	//default data members		//can use only inside same package
	int empID;
	String empName;
	float salary;
	String department;
	
	//method declaration & definition
	void display()
	{
		System.out.println("Emp ID: "+empID+" "+"Emp Name: "+empName+" "+
				"Salary: "+salary+" "+"Department: "+department+" ");
		
	}	
}