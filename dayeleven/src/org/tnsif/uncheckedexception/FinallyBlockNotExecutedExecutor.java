package org.tnsif.uncheckedexception;

public class FinallyBlockNotExecutedExecutor {

	public static void display(int []arr)
	{
		try {
			System.out.println(arr[1]);
			/*
			 * 1. if try and catch block contains a System.exit(0);
			 * after the execution of try or catch block then no further 
			 * statements are executed
			 * */
//			System.exit(0);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled "+e);
		}
		
		finally
		{
			/*When finally bock contains an excetpion code, then finally block doen't execute*/
			System.out.println(13/0);
			System.out.println("Finally is always executed..!!");
			
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {12, 54, 65};
		
		display(arr);

	}

}
