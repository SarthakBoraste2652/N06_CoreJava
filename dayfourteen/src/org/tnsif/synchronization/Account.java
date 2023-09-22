package org.tnsif.synchronization;

public class Account implements Bank{
	private int accNo;
	private int balance;
	private String name; 
	
	public Account(int accNo, int balance, String name) {
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
	}
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void deposit(int amount) throws DepositLimitExceedsException {
		// TODO Auto-generated method stub
		if(amount >Bank.DEPOSIT_LIMIT)
		{
			throw new DepositLimitExceedsException("Can't deposit"+amount+" as Deposit limit exceeded..!!");
			
		}
		balance+=amount;
	}

	@Override
	public void withdraw(int amount) throws InsufficientBalanceException {
		if(amount >balance-Bank.MINIMUM_BALANCE)
		{
			throw new InsufficientBalanceException("Can't withdraw, Insufficient balance: "+balance);			
		}
		balance-=amount;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", name=" + name + "]";
	}
	
	
}
