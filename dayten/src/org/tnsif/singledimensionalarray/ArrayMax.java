// A program to demonstrate on array using runtime input values and to  find largest element
// in an array
package org.tnsif.singledimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		// Array declaration
		int arr[] = new int[n];
		
		for(int i=0; i< arr.length; i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]> max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Maximum element is :"+max);
		
		Arrays.sort(arr);
		System.out.println("The sorted array is: ");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
//		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}

}
