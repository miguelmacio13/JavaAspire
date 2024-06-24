package payrollManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import payrollManagement.CustomExceptions.IdAlreadyExist;
import payrollManagement.CustomExceptions.IdDoesNotExist;

public class Management {
	private Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
	
	///////////Constructor///////////////////////////////////////////////////
	public Management() {
		
	}
	
	
/////////////Methods/////////////////////////////////////////////////////////////
	public void defaultEmployees() {
		try {
			addEmployee(new Employee("MIGUEL ANGEL MACIAS LAZCANO", 1, 15, 465));
		} catch (IdAlreadyExist e) {
			System.out.println("Error: " + e.getMessage());
		}
		try {
			addEmployee(new Employee("JAVIER HERNANDEZ BALCAZAR", 2, 30, 250));
		} catch (IdAlreadyExist e) {
			System.out.println("Error: " + e.getMessage());
		}
		try {
			addEmployee(new Employee("ANDRES MANUEL LOPEZ OBRADOR", 3, 15, 465));
		} catch (IdAlreadyExist e) {
			System.out.println("Error: " + e.getMessage());
		}	
	}

	public void addEmployee(Employee employee) throws IdAlreadyExist {
		if(getEmployees().containsKey(employee.getIdNumber())){
			throw new IdAlreadyExist("The ID number already exist, please try a new one");
		}
		getEmployees().put(employee.getIdNumber(), employee);
	}
	
	public void printEmployees() {
		for(var i : getEmployees().values()) {
			System.out.println(i);
		}
		System.out.println("");
	}
	

	public Employee addEmployeeInput(Scanner scanner) {
		
		System.out.println("Enter name: ");
		String name = scanner.nextLine().toUpperCase();
		System.out.println("Enter ID number: ");
		int numberId = scanner.nextInt();
		System.out.println("Enter hourly wage: ");
		int hourlyWage = scanner.nextInt();
		System.out.println("Enter hours worked (monthly): ");
		int hoursWorked = scanner.nextInt();
		scanner.nextLine();
		
		return new Employee(name, numberId, hourlyWage, hoursWorked);
		
	}
	
public Employee addEmployeeInput2(Scanner scanner, int idNumber) {
		
		System.out.println("Enter name: ");
		String name = scanner.nextLine().toUpperCase();
		System.out.println("Enter hourly wage: ");
		int hourlyWage = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter hours worked (monthly): ");
		int hoursWorked = scanner.nextInt();
		scanner.nextLine();
		
		return new Employee(name, 0, hourlyWage, hoursWorked);
		
	}
	
	
	public void editEmployee(Scanner scanner) throws IdDoesNotExist{
		System.out.println("Please enter employee ID you're trying to edit");
		int editId = scanner.nextInt();
		scanner.nextLine();
		if (!(getEmployees().containsKey(editId))){
			throw new IdDoesNotExist("Unable to access Key. The ID number does not exist.");
		}
		Employee editEmpl = addEmployeeInput2(scanner, editId);
		editEmpl.setIdNumber(editId);
		getEmployees().put(editEmpl.getIdNumber(), editEmpl);
	}
	
	public void deleteEmployee(Scanner scanner) throws IdDoesNotExist{
		System.out.println("Please enter employee ID you're trying to delete");
		int delEmpl = scanner.nextInt();
		scanner.nextLine();
		if (!(getEmployees().containsKey(delEmpl))){
			throw new IdDoesNotExist("Unable to access Key. The ID number does not exist.");
		}
		getEmployees().remove(delEmpl);
	}


	public Map<Integer, Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(Map<Integer, Employee> employees) {
		this.employees = employees;
	}
	
///////////////////////////////////////////////////////////////////////	


	


}
