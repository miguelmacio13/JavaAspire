package chapter5;

import java.util.Scanner;

/*
 * Calculate the final total of someone's cell phone bill
 * Allow the operator to input the plan fee and the number of overage minutes.
 * Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
 * Create separate methods to calculate the tax, overage fees, and final total.
 * Print the itemized bill
 */

public class phoneBillCalculator5b {
	static Scanner scanner = new Scanner(System.in);
	static double tax = 0.15;
	static double chargeOverMin = 0.25;
	
	public static void main(String args[]) {
		
		//Get what we don't know
		double planFee = getPlanFee();
		
		double overMin = getOverMin();
		
		scanner.close();
		//Calculate subtotal & Tax
		double subTotal = subTotal(planFee, overMin);
		double taxInBill =getTax(subTotal);
		
		
		//Provide subtotal, tax & TOTAL
		provideBill(subTotal,taxInBill);
	}
	
	public static double getPlanFee() {
		System.out.println("Please enter the plan fee: $");
		double planFee = scanner.nextDouble();
		return planFee;
	}
	
	public static double getOverMin() {
		System.out.println("Please enter overage minutes: ");
		double overMin = scanner.nextDouble();
		return overMin;
	}
	
	public static double subTotal(double planFee, double overMin) {
		double subTotal = planFee + (overMin * chargeOverMin);
		return subTotal;
	}
	
	public static double getTax(double subTotal) {
		double taxInBill = tax * subTotal;
		return taxInBill;
	}
	
	public static void provideBill(double subTotal, double taxInBill) {
		System.out.println("The Subtotal amount is: $" + subTotal);
		System.out.println("The taxes are: $" + taxInBill);
		System.out.println("The TOTAL amount is: $" + (subTotal + taxInBill));	
	}
}
