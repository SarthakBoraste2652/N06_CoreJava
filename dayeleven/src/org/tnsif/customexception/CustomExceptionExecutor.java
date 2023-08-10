package org.tnsif.customexception;
import java.util.Scanner;
public class CustomExceptionExecutor {

	public static void main(String[] args) throws LoginCredentials {
		Scanner s = new Scanner(System.in);
		System.out.print("Username:");
		String userid = s.nextLine();
		System.out.print("\nPassword:");
		String password = s.nextLine();
		/*
		if(userid.equals("Sarth@gmail.com") && password.equals("AFarms"))
		{
			System.out.println("Credentials matched");
		}
		else
		{
			throw new LoginCredentials("Invalid Credentials");
		}
		*/
		
		try
		{
			if(userid.equals("Sarth@gmail.com") && password.equals("AFarms"))
			{
				System.out.println("Credentials matched");
			}
			else
			{
				throw new LoginCredentials("Invalid Credentials");
			}
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception Handled"+e);
		}

	}

}
