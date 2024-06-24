package chapter9;

public class BirthdayCake extends Cake {

	protected int candles;
	
	public BirthdayCake(String flavor) {
		super(flavor);
	}
	
	public int getCandles() {
		return candles;
	}

	public void setCandles(int candles) {
		this.candles = candles;
	}

	

}
