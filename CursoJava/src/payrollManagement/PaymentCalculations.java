package payrollManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import payrollManagement.CustomExceptions.IdDoesNotExist;

public class PaymentCalculations {
	Management management = new Management();
	Employee employee = new Employee();
	
	
	//Fields we'll need
	int grossPay;
	double netPay;
	double taxesQt;
	double healthInQt;
	double retireQt;
	
	private Map<Integer, Employee> employeesMap = new HashMap<Integer, Employee>();;
	
	// rates
	final double taxes = 0.16;  //I take the taxes they take in my country
	final double healthInsurance = 0.05;
	final double retirementFund = 0.07;
	
	//Constructor///////
	
	public PaymentCalculations(Map<Integer, Employee> employeeMap) {
		this.employeesMap = employeeMap;
	}
	
	////////Methods/////////////
	public void calculateGrossPay() {
		
		
		for(var i :  getEmployeesMap().values()) {

			int hourlyWage = i.getHourlyWage();
			int hoursWorked = i.getHoursWorked();
			
			grossPay = hourlyWage * hoursWorked;
			System.out.println(i.getName() + " gross pay is: $" + grossPay + "\n");
		}
		
	}
	
	public void calculateNetPay() {
		for(var i :  getEmployeesMap().values()) {

			int hourlyWage = i.getHourlyWage();
			int hoursWorked = i.getHoursWorked();
			
			grossPay = hourlyWage * hoursWorked;
			netPay = grossPay * (1 - taxes - healthInsurance - retirementFund);
			System.out.println(i.getName() + " net pay is: $" + netPay + "\n");
		}
 
	}
	
	
	public void payrollReport(Scanner scanner) throws IdDoesNotExist{
		
		System.out.println("Please enter the employee ID you want a payroll report to generate");
		int idReport = scanner.nextInt();
		scanner.nextLine();
		if (!(getEmployeesMap().containsKey(idReport))){
			throw new IdDoesNotExist("Unable to access Key. The ID number does not exist.");
		}
		
		var employeeInfo = employeesMap.get(idReport);
		grossPay = employeeInfo.getHourlyWage() * employeeInfo.getHoursWorked();
		healthInQt = healthInsurance * grossPay;
		retireQt = retirementFund * grossPay;
		taxesQt = taxes * grossPay;
		netPay = grossPay - healthInQt - retireQt - taxesQt;
		
		System.out.println("Please indicate option:"
				+ "\n1) For weekly pay period"
				+ "\n2) For bi-weekly pay period"
				+ "\n3) For monthly pay period");
		int period = scanner.nextInt();
		scanner.nextLine();
		
		switch(period) {
		case 1:
			System.out.println("The employee's weekly payroll is:"
					+ "\nName" + employeeInfo.getName()
					+ "\nGross pay: $" + grossPay
					+ "\nTaxes: $" + taxesQt
					+ "\nHealth insurance: $" + healthInQt
					+ "\nRetirement fund: $" + retireQt
					+ "\nNetpay: $" + netPay);
			break;
		case 2:
			System.out.println("The employee's bi-weekly payroll is:"
					+ "\nName" + employeeInfo.getName()
					+ "\nGross pay: $" + grossPay
					+ "\nTaxes: $" + taxesQt
					+ "\nHealth insurance: $" + healthInQt
					+ "\nRetirement fund: $" + retireQt
					+ "\nNetpay: $" + netPay);
			break;
		case 3:
			System.out.println("The employee's monthly payroll is:"
					+ "\nName" + employeeInfo.getName()
					+ "\nGross pay: $" + grossPay
					+ "\nTaxes: $" + taxesQt
					+ "\nHealth insurance: $" + healthInQt
					+ "\nRetirement fund: $" + retireQt
					+ "\nNetpay: $" + netPay + "\n");
			break;
		default:
			System.out.println("Invalid option. Please select a valid one.");
			break;
		}
		
	}
	
	///Getters & setters/////
	public Map<Integer, Employee> getEmployeesMap() {
		return employeesMap;
	}

	public void setEmployeesMap(Map<Integer, Employee> employeesMap) {
		this.employeesMap = employeesMap;
	}

	
}
