//A program to demonstrate ternaryOperator
package org.tnsif.operators;
import java.util.Scanner;

public class TernaryOperatorsDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		String result = (num % 2 ==0)?"Even" : "Odd";
		System.out.println("Result is "+result);
		
		scan.close();
	}

}
