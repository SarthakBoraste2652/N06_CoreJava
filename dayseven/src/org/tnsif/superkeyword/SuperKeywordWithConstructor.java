//A program to demonstrate super keyword use to call parent class constructor

package org.tnsif.superkeyword;
//Parent class
class Google
{
	String ceo;

	public Google(String ceo) {
		System.out.println("Default Constructor: "+ceo);
	}
		
}

//child class
class Gmail extends Google
{
	String userId;
	
	public Gmail(String ceo, String userId) {
		super(ceo);
		this.userId = userId;
		System.out.println("userId: "+userId);
	}
	
}

//Driver class
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		//calling to parent class parameterized constructor
		Gmail g = new Gmail("Sundar Pichai", "Sarth@gmail.com");

	}

}
