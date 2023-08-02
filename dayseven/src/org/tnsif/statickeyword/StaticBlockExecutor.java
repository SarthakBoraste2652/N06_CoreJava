// A program to demonstrate static block

package org.tnsif.statickeyword;

public class StaticBlockExecutor {

	static String Nationality;
	int adharNo;
	
	static			//static block is used for initialize static variables
	{
		Nationality = "Indian";
//		adharNo = 232342344;			// we can't use non-static variables 
										//inside static block
		System.out.println(Nationality);
	}
	
	
	
	public static void main(String[] args) {
		/*
		  main function is static and hence it calls
		  static block, method and variable by default
		  */
	}

}
