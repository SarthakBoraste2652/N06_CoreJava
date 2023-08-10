// A program to demonstrate on 1d array using compile time input

package org.tnsif.singledimensionalarray;

public class ArrayExample {
	
	public static void main(String [] args)
	{
		//array initialization at compile-time
		
		int arr[]= {1, 2, 4, 6, 5};
		
		System.out.println(arr[1]);
		System.out.println("Array elements are:");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
	}

}
