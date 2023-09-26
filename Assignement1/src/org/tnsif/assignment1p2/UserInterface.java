package org.tnsif.assignment1p2;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, address, beroType, beroColour, woodType;
		long phoneNo;
		
		
		System.out.println("Enter Customer Name");
		name = sc.nextLine();
		System.out.println("Enter Phone Number");
		phoneNo = Long.parseLong(sc.nextLine());
		System.out.println("Enter address");
		address = sc.nextLine();
		
		CustomerDetails cust1 = new CustomerDetails(name, phoneNo, address);
		
		System.out.println("Enter Bero Type");
		beroType = sc.nextLine();
			
		double totalPrice;
		if(beroType.equals("SteelBero"))
		{
			System.out.println("Enter Bero Colour");
			beroColour= sc.next();
			
			System.out.println("Enter Bero height");
			int beroHeight=sc.nextInt();
			SteelBero sObj = new SteelBero(beroType,beroColour, beroHeight);
					
			sObj.calculatePrice();
			
			Discount disc = new Discount();
			double discount = disc.calculateDiscount(sObj);
			
			totalPrice = sObj.getPrice()-discount;
			System.out.printf("Amount needs to be paid %.2f%n", totalPrice);
		}
		else if(beroType.equals("Wooden Bero"))
		{
			System.out.println("Enter Bero Colour");
			beroColour= sc.nextLine();
			
			System.out.println("Enter Wood Type");
			woodType= sc.nextLine();
			
			WoodenBero wObj = new WoodenBero(beroType, beroColour, woodType);
			wObj.calculatePrice();
			
			Discount disc = new Discount();
			double discount = disc.calculateDiscount(wObj);
			
			totalPrice = wObj.getPrice()-discount;
			System.out.printf("Amount needs to be paid %.2f", totalPrice);
		}
		else
			System.out.println(beroType+" is an invalid bero type");
		
	}

}
