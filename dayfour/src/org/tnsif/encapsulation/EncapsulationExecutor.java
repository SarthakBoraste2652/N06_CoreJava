// A program to access HDFC class data members by means of  getters and setters
//Driver class

package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		
		h.setAccountNo(12347986L);
		h.setAccType("Current");
		h.setAtmCardNo(987353242345L);
		h.setPinNo(5226);
		
		//below line will call to toString() method
		System.out.println(h);
		
		//below line will print account no.
//		System.out.println(h.getAccountNo());
		
		
		
		
	}

}
