/* Program to demonstrate on to check the person is eligible to donate the 
blood or not */

package org.tnsif.decisionmaking;
import java.util.Scanner;
public class IfElseExecutor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int age= scan.nextInt();
		
		int weight = scan.nextInt();
		
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood");
		}
		else
			System.out.println("Not eligible to donate the blood");
		
		scan.close();
	}

}
