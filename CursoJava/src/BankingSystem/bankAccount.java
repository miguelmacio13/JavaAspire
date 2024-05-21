package BankingSystem;

import BankingSystem.CustomExceptions.*;

public class bankAccount {
	int accId;
	static float balance;
	String custName;
	
	public bankAccount(int accId, float balance, String custName) //throws InvalidAccountNumberExceptions
	{
//		if(accId < 0) {
//			throw new InvalidAccountNumberExceptions("Invalid account number");
//		}
		this.accId = accId;
		bankAccount.balance = balance;
		this.custName = custName;
		
	}
	
}
