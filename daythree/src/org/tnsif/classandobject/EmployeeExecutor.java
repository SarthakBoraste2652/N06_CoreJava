//driver class
//Program to demonstrate on class and objects
package org.tnsif.classandobject;

public class EmployeeExecutor {

	public static void main(String[] args) {
		//object creation
		Employee e = new Employee();
		e.empID = 10123;
		e.empName = "Sarthak Boraste";
		e.salary  = 100000;
		e.department = "Computer";
		
		// method call
		e.display();
	}

}
