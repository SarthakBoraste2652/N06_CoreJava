package org.tnsif.synchronization;

public class Executor {

	public static void main(String[] args) {
		Account accObj = new Account(101, 10000, "Sarthak");
		System.out.println("!!....Account Details....!!");
		System.out.println(accObj);
		
		AccountThread thr1 = new AccountThread(accObj);
		AccountThread thr2 = new AccountThread(accObj);
		
		thr1.setAmount(2000);
		thr1.setType("withdraw");
		
		thr2.setAmount(8000);
		thr2.setType("withdraw");
		
		thr1.start();
		thr2.start();
		
		try {
			thr1.join();
			thr2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(accObj);
	}

}
