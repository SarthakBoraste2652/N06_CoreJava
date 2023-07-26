//A program to count digits in a number

package org.tnsif.looping;
import java.util.Scanner;

public class DigitInNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number= scan.nextInt();
		
		int count=0;
		do 
		{
			number = number/10;
			count++;
		}
		while(number > 0);
		System.out.println("Number of digits in the given number is "+count);
		
		scan.close();
	}

}
