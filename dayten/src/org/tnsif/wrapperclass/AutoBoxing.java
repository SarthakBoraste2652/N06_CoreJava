// A program to demonstrate AutoBoxing

// AutoBoxing : - conversion of primitive to object type

package org.tnsif.wrapperclass;

public class AutoBoxing {

	public static void main(String[] args) {
		int num = 97;
		
		//converting a primitive type into object type
		Integer value = num;
		System.out.println(value);
		System.out.println(value.getClass().getName());

	}

}
