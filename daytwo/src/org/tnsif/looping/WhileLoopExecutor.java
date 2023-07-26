// A program to demonstrate while loop for printing 1->n number;

package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoopExecutor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
				
		while(n>=1)
		{
			System.out.print(n+" ");
			n--;
		}
					

	}

}
