package carRental;

import java.time.LocalDate;

public class Rental {
	 private Car car;
	    private String customerName;
	    private LocalDate rentalDate;
	    private int rentalDuration;
	    private double totalCost;
	    private LocalDate returnDate;
	    
	    public Rental(Car car, String customerName, LocalDate rentalDate, int rentalDuration) {
	        this.car = car;
	        this.customerName = customerName;
	        this.rentalDate = rentalDate;
	        this.rentalDuration = rentalDuration;
	        this.totalCost = rentalDuration * car.getPricePerDay();
	        this.returnDate = rentalDate.plusDays(rentalDuration);
	    }
	    
		public Car getCar() {
			return car;
		}
		public void setCar(Car car) {
			this.car = car;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public LocalDate getRentalDate() {
			return rentalDate;
		}
		public void setRentalDate(LocalDate rentalDate) {
			this.rentalDate = rentalDate;
		}
		public int getRentalDuration() {
			return rentalDuration;
		}
		public void setRentalDuration(int rentalDuration) {
			this.rentalDuration = rentalDuration;
		}
		public double getTotalCost() {
			return totalCost;
		}
		public void setTotalCost(double totalCost) {
			this.totalCost = totalCost;
		}
		public LocalDate getReturnDate() {
			return returnDate;
		}
		public void setReturnDate(LocalDate returnDate) {
			this.returnDate = returnDate;
		}
		
		public LocalDate getRentalEndDate() {
	        return rentalDate.plusDays(rentalDuration);
	    }
		
		 @Override
		    public String toString() {
		        return "Rental:" +car +
		                "\nCustomer Name='" + customerName +
		                "\nrentalDate = " + rentalDate +
		                "\nrentalDuration = " + rentalDuration +
		                "\ntotalCost (will incrase if damaged or late return) = " + totalCost +
		                "\nreturnDate=" + returnDate + "\n";
		    }
}
