package com.anu.cust;

import com.anu.bank.bank_application.BankAccount;
import com.anu.bank.bank_application.SavingsAccount;

public class Customer {
	
	public static void main(String [] args)
	{
		BankAccount acc1=null;
		 acc1 = new SavingsAccount();
		 acc1.withdraw(5000);
		System.out.println("Bank account 1"+ acc1);
		
		
	}

}
