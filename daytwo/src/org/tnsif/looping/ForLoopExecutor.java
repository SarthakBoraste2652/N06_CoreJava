// A program to demonstrate for loop by printing a pattern

package org.tnsif.looping;

import java.util.Scanner;

public class ForLoopExecutor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		scan.close();

	}

}
