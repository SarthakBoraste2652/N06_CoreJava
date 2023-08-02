// A program to demonstrate the use of super keyword to call parent class method

package org.tnsif.superkeyword;

class MET
{
	String ownerName="Chagan Bhujbal";
	
	void displayName()
	{
		System.out.println("Owner is : "+ownerName);
	}
}

class BKC extends MET
{
	String ownerName="Shefali Bhujbal";
	
	void displayName()
	{
		/* 
		 If parent class and child class name are same and you want to 
		 acccess that method, then use 
		 super.methodName();
		 */
		super.displayName();
		System.out.println("Owner is : "+ownerName);
	}
}

//driver class
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		
		BKC b = new BKC();
		b.displayName();
		
	}

}
