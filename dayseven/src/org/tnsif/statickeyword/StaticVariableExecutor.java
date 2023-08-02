//A program to demonstrate use of static keyword to call instance variable outside main by 
//declaring them as static
//otherwise we have to create object for the class;
package org.tnsif.statickeyword;

public class StaticVariableExecutor {

	static String str ="TNS India Foundation";
	
	public static void main(String[] args) {
		
//		StaticVariableExecutor e = new StaticVariableExecutor();
//		System.out.println(e.str);
		
		System.out.println(str);
	}

}
