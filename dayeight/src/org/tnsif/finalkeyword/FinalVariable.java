//program to demonstrate final variable

package org.tnsif.finalkeyword;

public class FinalVariable {
//	final variable must be initialize during declaration
//	final int x;
	
	final float SALARY = 67000.78f;
	
	void print()
	{
		/* We can't change the value of final variable */
//		SALARY = 345343.34f;
		System.out.println("Salary is: "+SALARY);
	}
}
