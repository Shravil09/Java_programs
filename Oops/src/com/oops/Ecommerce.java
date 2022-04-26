package com.oops;
import java.util.Scanner;

public class Ecommerce {
	private static String Ecommerce = null;
	private String firstName;
	private String lastName;
	private String catagory;
	private int itemboxCapacity  = 500;
	private String alternateEmail;
	private String applicationSuffix = "Flipakart.com";
	
	public Ecommerce(String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName  = lastName;
		System.out.println("User Name: "+ this.firstName + " "+ this.lastName);
		this.catagory = setcatagory();
		System.out.println("Catagory: "+this.catagory);
		
		Ecommerce = firstName.toLowerCase()+ "" +lastName.toLowerCase() +"@"+applicationSuffix;
	}
	private String setcatagory() 
	{
		System.out.println("CATAGORY CODES \n1 for Groceries\n2 for Fashion\n3 for Electronics\n0 for none\nEnter Catagory Code: ");
		Scanner sc = new Scanner(System.in);
		int ecoChoice = sc.nextInt();
		if (ecoChoice == 1) 
		{
			return "Groceries";
		}
		else if (ecoChoice == 2) 
		{
			return "Fashion";
		}
		else if (ecoChoice == 3) 
		{
			return "Electronics";
		}
		return alternateEmail;
		
	}
	public void setitemboxCapacity(int Capacity) 
	{
		this.itemboxCapacity = Capacity;
	}
	public void setAlternateEmail(String altEmail) 
	{
		this.alternateEmail = altEmail;
	}
	public int itemboxCapacity() 
	{
		return itemboxCapacity;
	}
	public String getalternateEmail() 
	{
		return alternateEmail;
	}

	public String Showinfo() 
	{
		return "Display Name: "+ firstName +" "+ lastName + " "+
				"Ecommerce Email: " + Ecommerce  + " " +
				"ItemBox Capacity: "+ itemboxCapacity + " Item";
	}
}

