//A program to demonstrate increment & decrement operators

package org.tnsif.operators;

public class IncrementDecrementDemo {

	public static void main(String[] args) {
		int x = 23, y = 6;
		System.out.println("Result1 :-");
		int res1 = x++ + ++y;
		System.out.println(res1);
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("Result2 :-");
		int res2 = x-- + --y;
		
		System.out.println(res1);
		System.out.println(x);
		System.out.println(y);

	}

}
