package org.tnsif.multidimensionalarray;

import java.util.Scanner;

public class TwoDimenstionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2D array declaration
		int arr[][] = new int[3][2];
		//taking user input
		for(int i=0; i< arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		//printing an array elements
		for(int i=0; i< arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
