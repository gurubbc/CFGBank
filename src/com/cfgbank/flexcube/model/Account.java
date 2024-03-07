package com.cfgbank.flexcube.model;

public class Account {
	String accountType;
	int accountNumber;
	double accountBalance;
	
	
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Account(String accountType, int accountNumber, double accountBalance) {
		super();
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public void checkBalance() {
		System.out.println("The balance is "+this.accountBalance);
	}
	
	public void deposit(double depositAmount) {
		this.accountBalance=this.accountBalance+depositAmount;
	}

	public double withdraw(double withdrawAmount) {
		if (withdrawAmount <= this.accountBalance) {
			System.out.println("Successfully withdrawn....");
			this.accountBalance=this.accountBalance-withdrawAmount;
			return withdrawAmount;
			
		}  else {
			System.out.println("You have insufficient balance, can't withdraw");
			System.out.println("Enter a smaller amount");
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", accountNumber=" + accountNumber + ", accountBalance="
				+ accountBalance + "]";
	}
	
	
}
