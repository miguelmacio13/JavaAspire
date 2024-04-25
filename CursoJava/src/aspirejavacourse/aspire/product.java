package aspirejavacourse.aspire;

public class product {
	private String Name;
	private int SN;
	private float Price;
	private String Department;
	
	public product(String Name, float Price, int SN, String Department) {
		this.Name = Name;
		this.Price = Price;
		this.SN = SN;
		this.Department = Department;		
	}
	

	public product(){
		
	}
	
	//Getters & Setters
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getSN() {
		return SN;
	}
	public void setSN(int sN) {
		this.SN = sN;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		this.Price = price;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		this.Department = department;
	}
	
	
}
