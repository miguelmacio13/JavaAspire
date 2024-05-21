package BankingSystem;

import BankingSystem.CustomExceptions.*;

public class Transaction {
	// What we need to know from a transaction
	int transId;
	String transType;
	float transAmount;

//	static bankAccount bankAccount = new bankAccount();

	public Transaction(int transId, String transType, float transAmount) {
		this.transId = transId;
		this.transType = transType;
		this.transAmount = transAmount;
	}

	public double doTransaction() throws InsufficientFundsException, NegativeAmountException {
		System.out.println("This is a transaction with the ID: " + transId);
		System.out.println("This is a transaction of the type: " + transType);

		switch (transType) {
		case "deposit":
			if(transAmount < 0) {
				throw new NegativeAmountException("Negative amounts are not permitted");
			}
			System.out.println("The amount to deposit is: $" + transAmount);
			bankAccount.balance = bankAccount.balance + transAmount;
			System.out.println("The new balance after transaction is: $" + bankAccount.balance);
			break;
		case "withdrawal":
			if(transAmount > bankAccount.balance) {
				throw new InsufficientFundsException("Insufficient funds for withdrawal");
			}
			if(transAmount < 0) {
				throw new NegativeAmountException("Negative amounts are not permitted");
			}
			System.out.println("The amount to withdraw is: $" + transAmount);
			bankAccount.balance = bankAccount.balance - transAmount;
			System.out.println("The new balance after transaction is: $" + bankAccount.balance);
			break;
		}
		return bankAccount.balance;
	}
	
	public void checkBalance() {
		System.out.println("The balance in the customber account is: $ " + bankAccount.balance);
	}

}
