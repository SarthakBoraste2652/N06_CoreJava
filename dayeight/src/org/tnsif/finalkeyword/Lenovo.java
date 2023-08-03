package org.tnsif.finalkeyword;

public class Lenovo extends Laptop{
	
	final String PROCESSOR = "Intel I7";
	//final method
	/*
	 //we can't override final method
	void display()
	{
		System.out.println(PROCESSOR);
	}
	*/
	void display(String PROCESSOR)
	{
		System.out.println(PROCESSOR);
	}
}
