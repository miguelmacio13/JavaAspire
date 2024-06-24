package payrollManagement;

import java.util.HashMap;

public class Employee {
	private String name;
	private int idNumber;
	private int hourlyWage;
	private int hoursWorked;
	
	
	///Constructor/////////////////////////////
	
	public Employee(String name, int idNumber, int hourlyWage, int hoursWorked) {
		this.name = name;
		this.idNumber = idNumber;
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}
	
	public Employee() {
		
	}
	////////////////////////////////////
		
	
	
	
	//getters and setters/////////////////////////////////////////////////
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public int getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	////////////////////////////////////////////////////////
	
	
	/////Methods////////////////////////////////////////////
	@Override
	public String toString() {
		return "Employee name: " + name
				+ ", employee ID: " + idNumber
				+ ", hourly wage: " + hourlyWage
				+ ", hours worked: " + hoursWorked;
	}
	
	
}
