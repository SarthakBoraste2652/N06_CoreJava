package org.tnsif.synchronization;

public class AccountThread extends Thread{
	
	private int amount;
	private Account acc;
	private String type;
	
	public AccountThread(Account acc)
	{
		this.acc= acc;
	}
	
	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public Account getAcc() {
		return acc;
	}


	public void setAcc(Account acc) {
		this.acc = acc;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public void run() {
		try {
			if(type.equals("deposit"))
			{
				acc.deposit(amount);
			}
			else if(type.equals("Withdraw"))
				acc.withdraw(amount);
		}
		catch(DepositLimitExceedsException | InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	

}
