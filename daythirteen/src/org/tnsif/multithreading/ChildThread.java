package org.tnsif.multithreading;

public class ChildThread extends Thread{
	public ChildThread()
	{
		setPriority(MAX_PRIORITY);
		start();	//start thread execution
	}
	
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" : Hello");
		System.out.println("Is "+Thread.currentThread().getName()+" is alive? "+Thread.currentThread().isAlive());
	}
	
	
}
