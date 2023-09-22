package org.tnsif.multithreading;

public class Operations {
	public static int getFactorial(int num)
	{
		int fact = 1;
		
		for(int i=1; i<num; i++)
			fact *= i;
		System.out.println("In Factorial method : "+Thread.currentThread());
		return fact;
	}
	
	public static boolean isPrime(int num)
	{
		System.out.println("In isPrime method : "+Thread.currentThread());
		for(int i=2; i*i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		
		return true;
	}
	
}
