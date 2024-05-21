package BankingSystem;

import BankingSystem.CustomExceptions.*;


public class bankingSystem {
	
	
//	try {
	static bankAccount information = new bankAccount(4, 7000, "Miguel");	
//	}
//	catch(InvalidAccountNumberExceptions e){
//		System.out.println("Hola");
//	}
	
	
	static Transaction transaction = new Transaction(1, "deposit", 7500);
	
	
	public static void main(String args[]) {
		
		
		welcomeToBank();
		printinfo();
		try {
			transaction.doTransaction();
			System.out.println("Transaction completed!");
		}
		catch(InsufficientFundsException e) {
			System.out.println("Error:" + e.getMessage());
		}
		catch(NegativeAmountException e) {
			System.out.println("Error:" + e.getMessage());
		}
		transaction.checkBalance();
//		printinfo();
	}
	
	public static void welcomeToBank() {
		System.out.println("Welcome to the Bank! Hope you have a wonderful experience");
	}
	
	public static void printinfo() {
		System.out.println("Please check the customer information below:");
		System.out.println("Id:" + information.accId);
		System.out.println("Balance: $" + bankAccount.balance);
		System.out.println("Customer name: " + information.custName);
	}
	
}
