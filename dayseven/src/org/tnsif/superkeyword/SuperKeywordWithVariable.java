//program to use parent class instance variables using super keyword

package org.tnsif.superkeyword;

class Building
{
	int floors=23;
	String name = "Arunodaya Farms";
}

class Flat extends Building
{
	String name = "Sarthak Boraste";
	
	void print() {
		
		/*
		 If parent class and child class variable name are same,
		 and if you want to access parent class variable inside the child class 
		 then use can use super keyword to access them
		 */
		System.out.println(super.name);
		System.out.println(name);
	}
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		
		Flat f = new Flat();
		f.print();

	}

}
