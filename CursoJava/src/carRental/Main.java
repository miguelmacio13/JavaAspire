package carRental;

import java.util.InputMismatchException;

import java.util.Scanner;

import payrollManagement.CustomExceptions.IdAlreadyExist;
import payrollManagement.CustomExceptions.IdDoesNotExist;

public class Main {
	public static void main(String args[]) {
		CarManagement management = new CarManagement();
		
		RentalManagement rental = new RentalManagement();
		Scanner scanner = new Scanner(System.in);
		
		boolean check = true;
		while(check == true) {
			System.out.println("Please enter the option you want:"
					+ "\n1) Print car's fleet"
					+ "\n2) Add car to fleet"
					+ "\n3) Edit car"
					+ "\n4) Delete car"
					+ "\n5) Create new rental"
					+ "\n6) Print all rentals"
					+ "\n7) Return car & receipt"
					+ "\n8) Exit");
			
			var choice = scanner.nextLine();
			
			switch(choice) {
			case "1":
				management.printCarFleet();
				break;
			case "2": 
				boolean check2 = true;
				
				while(check2 == true) {
					try {
						Car car = management.addCarInput(scanner);
						management.addCar(car);
						System.out.println("New car added\n");
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
						management.editCar(scanner);
						System.out.println("Car edited. Returning to main menu.\n");
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
						management.deleteCar(scanner);
						System.out.println("Car deleted. Returning to main menu.\n");
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
				rental.rentCar(scanner);
				break;
				
			case "6":
				rental.printRentals();
				break;
				
			case "7":
				rental.returnCar(scanner);
				break;
				
				
			case "8":
				System.out.println("Thank you for using car rental anagement");
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
