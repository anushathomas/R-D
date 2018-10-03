package com.anu.bank.bank_application;


/** documentation based comment
 * 
 * @author anuthoma
 * @since 03-10-2018
 *
 */
public abstract class BankAccount {
	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;
	public BankAccount()
	{
		accountNo=++autoAccountNoGen;
	    accountHolderName="Unknown";
		accountBalance=0;
	}

	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		accountNo=++autoAccountNoGen;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	
	public  abstract void withdraw(double amount);
	
	
	
	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}

	
	




}
