package org.tnsif.synchronization;

public class DepositLimitExceedsException extends Exception {
	public DepositLimitExceedsException()
	{
		System.out.println("Can't Deposit..Limit is exceeded...!!!");
	}
	public DepositLimitExceedsException(String message)
	{
		super(message);
	}
}
