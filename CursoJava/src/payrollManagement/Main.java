package payrollManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

import payrollManagement.CustomExceptions.IdAlreadyExist;
import payrollManagement.CustomExceptions.IdDoesNotExist;

public class Main {
	public static void main(String args[]) {
		Management management = new Management();
		PaymentCalculations payroll = new PaymentCalculations(management.getEmployees());
		management.defaultEmployees();
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		Boolean asdf = false;
		asdf.
		while(check == true) {
			System.out.println("Please enter the option you want:"
					+ "\n1) Print employees"
					+ "\n2) Add employee"
					+ "\n3) Edit"
					+ "\n4) Delete"
					+ "\n5) Gross Pay"
					+ "\n6) Net Pay"
					+ "\n7) Generate payroll report"
					+ "\n8) Exit");
			
			var choice = scanner.nextLine();
			
			switch(choice) {
				case "1":
					management.printEmployees();
					break;
				case "2": 
					boolean check2 = true;
					
					////// keep looping until all fields have valid input
					while(check2 == true) {
						try {
							Employee employee = management.addEmployeeInput(scanner);
							management.addEmployee(employee);
							System.out.println("New employee added\n");
							check2 = false;
						}catch(InputMismatchException e) {
							System.out.println("Error: invalid input, please try again.");
						}catch (IdAlreadyExist e) {
							System.out.println("Error: " + e.getMessage());
						}
					}
					
					break;
				case "3":
					boolean check3 = true;
					
					////// keep looping until all fields have valid input
					while(check3 == true) {
						try {
							management.editEmployee(scanner);
							System.out.println("Employee edited. Returning to main menu.\n");
							check3 = false;
						} catch(InputMismatchException e){
							System.out.println("Error: invalid input, please try again.");
							scanner.nextLine();
						}
						catch (IdDoesNotExist e) {
							System.out.println("Error: " + e.getMessage());
						}					
					}
					break;
				
				
				case "4":
					boolean check4 = true;
					
					////// keep looping until all fields have valid input
					while(check4 == true) {
						try {
							management.deleteEmployee(scanner);
							System.out.println("Employee deleted. Returning to main menu.\n");
							check4 = false;
						} catch(InputMismatchException e){
							System.out.println("Error: invalid input, please try again.");
							scanner.nextLine();
						}
						catch (IdDoesNotExist e) {
							System.out.println("Error: " + e.getMessage());
						}
				
					}
					break;
					
					
				case "5":
					payroll.calculateGrossPay();
					break;
					
				case "6":
					payroll.calculateNetPay();
					break;
					
				case "7":
				try {
					payroll.payrollReport(scanner);
				} catch (IdDoesNotExist e) {
					System.out.println("Error: " + e.getMessage()); 
				}
					break;
					
				case "8":
					System.out.println("Thank you for using payroll management");
					scanner.close();
					check = false;
					break;
					
				default:
					System.out.println("Invalid option. Please select a valid one.");
					break;
			}
				
		}
	}
}
