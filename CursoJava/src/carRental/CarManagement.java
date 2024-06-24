package carRental;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import payrollManagement.CustomExceptions.IdAlreadyExist;
import payrollManagement.CustomExceptions.IdDoesNotExist;



public class CarManagement {
	
	public CarManagement() {
		defaultCars();
	}
	private Map<String, Car> carFleet = new HashMap<String, Car>();
	
	public Map<String, Car> getCarFleet() {
		return carFleet;
	}


	public void setCarFleet(Map<String, Car> carFleet) {
		this.carFleet = carFleet;
	}
	

////////////////Methods///////////////////////////////////
	
	
	public void addCar(Car car) throws IdAlreadyExist {
		if(getCarFleet().containsKey(car.getCarPlate())){
			throw new IdAlreadyExist("The car plate number already exist, please try a new one");
		}
		getCarFleet().put(car.getCarPlate(), car);
	}

	public void defaultCars() {
		try {
			addCar(new Car("TWU082B", "SUZUKI", "S-CROSS", 2019, "BLUE", 29350, true, 40.7));
		} catch (IdAlreadyExist e) {
			System.out.println("Error: " + e.getMessage());
		}
		try {
			addCar(new Car("ACV730A", "HONDA", "CIVIC", 2023, "WHITE", 9350, true, 48.5));
		} catch (IdAlreadyExist e) {
			System.out.println("Error: " + e.getMessage());
		}
		try {
			addCar(new Car("OCB743E", "TOYOTA", "SIENNA", 2015, "BLUE", 47612, true, 55));
		} catch (IdAlreadyExist e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public void printCarFleet() {
		for(var i : getCarFleet().values()) {
			System.out.println(i);
		}
		System.out.println("");
	}


	public Car addCarInput(Scanner scanner) {
		
		System.out.println("Enter car's plate: ");
		String carPlate = scanner.nextLine().toUpperCase();
		System.out.println("Enter make: ");
		String make = scanner.nextLine().toUpperCase();
		System.out.println("Enter model: ");
		String model = scanner.nextLine().toUpperCase();
		System.out.println("Enter car's year: ");
		int year = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter car's color: ");
		String color = scanner.nextLine().toUpperCase();
		System.out.println("Enter car's mileage: ");
		int mileage = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter car's price per day rental: ");
		double rentalPricePerDay = scanner.nextDouble();
		scanner.nextLine();
		boolean isAvailable = true;
		
		return new Car(carPlate, make, model, year, color, mileage, isAvailable, rentalPricePerDay);
	}
	
	
	public Car addCarInput2(Scanner scanner, String carPlate) {
			
		System.out.println("Enter make: ");
		String make = scanner.nextLine().toUpperCase();
		System.out.println("Enter model: ");
		String model = scanner.nextLine().toUpperCase();
		System.out.println("Enter car's year: ");
		int year = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter car's color: ");
		String color = scanner.nextLine().toUpperCase();
		System.out.println("Enter car's mileage: ");
		int mileage = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter car's price per day rental: ");
		double rentalPricePerDay = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Is the car available: (true/false)");
		boolean isAvailable = scanner.nextBoolean();
			
		return new Car(carPlate, make, model, year, color, mileage, isAvailable, rentalPricePerDay);
			
		}
	
	
	public void editCar(Scanner scanner) throws IdDoesNotExist{
		System.out.println("Please enter car's plate of the car you're trying to edit");
		String editCar = scanner.nextLine().toUpperCase();
		if (!(getCarFleet().containsKey(editCar))){
			throw new IdDoesNotExist("Unable to access Key. The ID number does not exist.");
		}
		Car editCar1 = addCarInput2(scanner, editCar);
		editCar1.setCarPlate(editCar);
		getCarFleet().put(editCar1.getCarPlate(), editCar1);
	}
	
	public void deleteCar(Scanner scanner) throws IdDoesNotExist{
		System.out.println("Please enter carPlate of the car you're trying to delete");
		String delCar = scanner.nextLine().toUpperCase();
		if (!(getCarFleet().containsKey(delCar))){
			throw new IdDoesNotExist("Unable to access Key. The car you entered does not exist.");
		}
		getCarFleet().remove(delCar);
	}
	
	public void printAvailableCars(){
		for(var i : carFleet.values()) {
			if(i.isAvailable()) {
				System.out.println(i.getMake() + " " + i.getModel() + " is available for: $" + i.getPricePerDay() + " a day. Car's plate: " + i.getCarPlate());
			}
		}
	}
}
