package org.tnsif.uncheckedexception;
//Program to demonstrate multiple catch block
public class CatchBlockDemo {

	static void print(int []arr)
	{
		try
		{
			System.out.println(arr[4]);
		}
		//we can use multiple catch block
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Parent class Exception is used"+e);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {21, 34, 23, 45};
		
		print(arr);

	}

}
