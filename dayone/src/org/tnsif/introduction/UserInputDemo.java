//Program to demonstrate user-input value

package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String str1 = scan.nextLine();
		System.out.println("String is "+str1);
		
		scan.close();
	}

}
