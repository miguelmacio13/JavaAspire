package chapter3;

import java.math.BigDecimal;

public class BigDecimalResta {
	public static void main(String args[]) {
		double a = 1.435;
		double b = 1.43;
		System.out.println(a-b);
		RestaBigDecimal(a,b);
		restaWrappedDouble(a, b);
	}
	
	private static void RestaBigDecimal(double a, double b) {
		BigDecimal c = BigDecimal.valueOf(a).subtract(BigDecimal.valueOf(b));
		System.out.println(c);
	}
	
	private static void restaWrappedDouble(double a, double b) { //no existe un método de resta en wrapped class Double
		Double a1 = a;
		Double b2 = b;
		System.out.println(a1-b2);
		
	}
}
