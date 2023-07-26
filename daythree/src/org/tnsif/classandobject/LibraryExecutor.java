//driver class
//program to demonstrate on default and parameterized constructor
package org.tnsif.classandobject;

public class LibraryExecutor { 

	public static void main(String[] args) {
		//object Creation
		Library obj = new Library();
		Library obj2 = new Library(5,"Sarthak Boraste","Java Programming", 400.43);
		System.out.println(obj2);
	}
}
