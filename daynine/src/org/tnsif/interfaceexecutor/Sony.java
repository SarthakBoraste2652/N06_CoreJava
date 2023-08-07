// A program to demonstrate the interface in java

package org.tnsif.interfaceexecutor;

public interface Sony {
	/*By default all the variables inside an interface is public static final*/
	int noOfChannels = 8;
	
	
	//by default all methods inside an interface are abstract methods
	void display();
	
	//core java 8 privides the  static and default method inside an interface
	//static method
	static void accept()
	{
		System.out.println("Static method");
	}
	
	//default method
	default void show()
	{
		System.out.println("Default method");
	}
}
