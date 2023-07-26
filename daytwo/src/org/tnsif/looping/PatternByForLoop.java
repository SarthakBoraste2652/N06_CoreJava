// A program to implement a pattern using for loop

package org.tnsif.looping;

import java.util.Scanner;

public class PatternByForLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();
		
		for(int i=1; i<= limit; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
