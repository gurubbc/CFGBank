package com.cfgbank.flexcube.model;

public class SavingsAccount extends Account {
	
	// specific to SavingsAccount
	double interestRate;

	
	
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public SavingsAccount(String accountType, int accountNumber, double accountBalance, double interestRate) {
		super(accountType, accountNumber, accountBalance);
		this.interestRate = interestRate;
	}
	
	// this is specific to this class
	public double calculateInterest() {
		// local variable
		double interestEarned=this.accountBalance*this.interestRate;
		System.out.println("SavingsAccount...interest is "+interestEarned);
		return interestEarned;
	}
	
	// Method overriding
	public void checkBalance() {
		super.checkBalance();
		System.out.println("Interest Earned is "+(this.accountBalance*this.interestRate));
	}

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", accountType=" + accountType + ", accountNumber="
				+ accountNumber + ", accountBalance=" + accountBalance + "]";
	}

	
	
	
	
}
