// A program to demonstrate ArrayIndexOutOfException

package org.tnsif.uncheckedexception;

public class ArrayIndexOutOfBoundsExceptionExecutor {

	public static void display(int []arr)
	{
		try {
		System.out.println(arr[3]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled "+e);
		}
		
		finally
		{
			System.out.println("Finally is always executed..!!");
		}
		
		System.out.println("Any statement outside all this will always execute");
	}
	
	public static void main(String[] args) {
		
		int arr[] = {12, 54, 65};
		
		display(arr);

	}

}
