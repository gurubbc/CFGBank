package com.cfgbank.flexcube.model;

public class CurrentAccount extends Account {
	
	// specific to CurrentAccount
	// You can overwithdraw upto 2000 dirhams
	double overwidthrawLimit;

	public CurrentAccount(String accountType, int accountNumber, double accountBalance, double overwidthrawLimit) {
		super(accountType, accountNumber, accountBalance);
		this.overwidthrawLimit = overwidthrawLimit;
	}
	
	@Override
	public double withdraw(double withdrawAmount) {
		if (withdrawAmount <= (this.accountBalance+this.overwidthrawLimit)) {
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
		return "CurrentAccount [overwidthrawLimit=" + overwidthrawLimit + "]";
	}

	
}
