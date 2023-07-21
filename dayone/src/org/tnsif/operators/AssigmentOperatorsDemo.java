//A program to demonstrate Assignment operators

package org.tnsif.operators;

public class AssigmentOperatorsDemo {

	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 9;
		
		num1 -= num2;
		
		System.out.println(num1);
		
		num2 /= num1;
		
		System.out.println(num2);
		
		num2 %= num1;
		System.out.println(num2);

	}

}
