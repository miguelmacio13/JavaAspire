package chapter3;

import java.math.BigDecimal;

public class BigDecimalResta {
	public static void main(String args[]) {
		double a = 1.435;
		double b = 1.43;
		
		RestaBigDecimal(a,b);
	}
	
	private static void RestaBigDecimal(double a, double b) {
		BigDecimal c = BigDecimal.valueOf(a).subtract(BigDecimal.valueOf(b));
		System.out.println(c);
	}
}
