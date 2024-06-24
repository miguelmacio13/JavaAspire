package chapter9;

public class Cake {
	protected String flavor;
	protected float price;
	
	public Cake(String flavor) {
		this.flavor = flavor;
	}
	
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
