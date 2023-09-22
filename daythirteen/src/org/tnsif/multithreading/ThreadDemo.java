package org.tnsif.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();	//--->factory method:-returns reference to current class
		System.out.println(t.getName());
		System.out.println(t);
		System.out.println("-------------------------");
		
	}
}
