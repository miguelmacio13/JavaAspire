package carRental;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RentalManagement {
	private Map<String, Rental> rentals = new HashMap<String, Rental>();
	
 	CarManagement management = new CarManagement();
	
	public Map<String, Rental> getRentals() {
		return rentals;
	}


	public void setRentals(Map<String, Rental> rentals) {
		this.rentals = rentals;
	}
	
	///methods
	
	public String rentCar(Scanner scanner) {
		management.printAvailableCars();
        System.out.print("Enter the plate number of the car you want to rent: ");
        String carPlate = scanner.nextLine().toUpperCase();
        var car = management.getCarFleet().get(carPlate);
        if (car != null && car.isAvailable()) {
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter rental duration (in days): ");
            int rentalDuration = scanner.nextInt();
            scanner.nextLine();
            System.out.println("please enter date for the beggining of the rental:"
            		+ "Year: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Month: ");
            int month = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Day: ");
            int day = scanner.nextInt();
            scanner.nextLine();
            LocalDate rentalDate = LocalDate.of(year, month, day);
            Rental rental = new Rental(car, customerName, rentalDate, rentalDuration);
            rentals.put(carPlate, rental);
            car.setAvailable(false);
            return null;
        } else {
            System.out.println("Car is not available");
            return null;
        }
    }
	
	
	   public void returnCar(Scanner scanner) {
		   	printRentals();
	        System.out.print("Enter car plate to return: ");
	        String carPlate = scanner.nextLine().toUpperCase();
	        Rental rental = rentals.get(carPlate);
	        if (rental != null) {
	            rental.getCar().setAvailable(true);

	            System.out.println("Please enter the return date:");
	            System.out.print("Year: ");
	            int returnYear = scanner.nextInt();
	            System.out.print("Month: ");
	            int returnMonth = scanner.nextInt();
	            System.out.print("Day: ");
	            int returnDay = scanner.nextInt();
	            LocalDate returnDate = LocalDate.of(returnYear, returnMonth, returnDay);
	            scanner.nextLine();

	            long daysLate = ChronoUnit.DAYS.between(rental.getRentalEndDate(), returnDate);
	            double lateFee = 0;
	            if (daysLate > 0) {
	                lateFee = daysLate * rental.getCar().getPricePerDay();
	            }

	            System.out.print("Enter the amount for damages (if any): ");
	            double damageAmount = scanner.nextDouble();
	            scanner.nextLine(); 

	            double totalCharges = rental.getTotalCost() + lateFee + damageAmount;

	            // Generate return receipt
	            System.out.println("Return Receipt: ");
	            System.out.println("Customer: " + rental.getCustomerName());
	            System.out.println("Car: " + rental.getCar().getMake() + " " + rental.getCar().getModel());
	            System.out.println("Rental Duration: " + rental.getRentalDuration() + " days");
	            System.out.println("Return Date: " + returnDate);
	            System.out.println("Days Late: " + daysLate);
	            System.out.println("Late Fee: $" + lateFee);
	            System.out.println("Damage Fee: $" + damageAmount);
	            System.out.println("Total Charges: $" + totalCharges);

	            rentals.remove(carPlate);
	        } else {
	            System.out.println("Rental not found");
	        }
	    }
	
	public void printRentals() {
		for(var i : getRentals().values()) {
			System.out.println(i);
		}
		System.out.println("");
	}
	
}
