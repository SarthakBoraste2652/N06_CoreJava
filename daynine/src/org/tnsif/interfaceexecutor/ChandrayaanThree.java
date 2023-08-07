//A program to demonstrate on functional interface

package org.tnsif.interfaceexecutor;

@FunctionalInterface
public interface ChandrayaanThree {
	//Functional interface contains exactly one abstract method
	
	void status();
//	void displayResult();
	
	public static void display()
	{
		System.out.println("We can use other method other than abstract method type");
	}

}
