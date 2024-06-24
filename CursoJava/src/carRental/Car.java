package carRental;

public class Car {
	
	//fields of car
	private String carPlate;
	private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
    private boolean isAvailable = true;
    private double pricePerDay;
    
    //Constructor
    public Car(String carPlate, String make, String model, int year, String color, int mileage, boolean isAvailable, double rentalPricePerDay) {
        this.carPlate = carPlate;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.isAvailable = isAvailable;
        this.pricePerDay = rentalPricePerDay;
    }
    
//    Getters and Setters

	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	//To string override
	@Override
	public String toString() {
		return "Car plate: " + carPlate
				+ ", make: " + make
				+ ", model: " + model
				+ ", year: " + year
				+ ", color: " + color
				+ ", mileage: " + mileage
				+ ", Availability: " +  (isAvailable ? "Available" : "Not Available");
	}
}

	

