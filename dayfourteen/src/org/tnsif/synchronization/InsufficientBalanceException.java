package org.tnsif.synchronization;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException()
	{
		super("Can't withdraw..Insuficient balance");
	}
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
