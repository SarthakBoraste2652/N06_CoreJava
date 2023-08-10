package org.tnsif.singledimensionalarray;

public class ArrayOfObjects {

	public static void main(String[] args) {
		Employees [] arr = new Employees[3];
		
		arr[0] = new Employees(1, "Sarthak Boraste", 3452.34);
		arr[1] = new Employees(2, "Chaitanya Walture", 34587.33);
		arr[2] = new Employees(3, "Bhargav Sonar", 234346.233);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
		
		
		
		
		

	}

}
