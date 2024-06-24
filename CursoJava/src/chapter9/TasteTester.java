package chapter9;

public class TasteTester {
	public static void main(String args[]) {
		BirthdayCake BDCake = new BirthdayCake("Chocolate");
		WeddingCake WddCake = new WeddingCake("Strawberries and cream");
		
		
		//Birthday Cake
		BDCake.setPrice(40.75f);
		BDCake.setCandles(28);
		System.out.println("Price of your birthday cake is:" + BDCake.getPrice());
		System.out.println("Flavor of your birthday cake is:" + BDCake.getFlavor());
		System.out.println("Number of candles on your birthday cake are:" + BDCake.getCandles());
		
		
		
		
		WddCake.setPrice(80);
		WddCake.setTiers(4);
		System.out.println("Price of your wedding cake is:" + WddCake.getPrice());
		System.out.println("Flavor of your wedding cake is:" + WddCake.getFlavor());
		System.out.println("Number of tiers in your cake:" + WddCake.getTiers());
		
	}
}
