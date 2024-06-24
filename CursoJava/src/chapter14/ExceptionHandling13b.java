package chapter14;

public class ExceptionHandling13b {
	public static void main(String args[]) {
		try {
			int c = 30/0;
		} catch (Exception e) {
			System.out.println("No se puede dividir entre 0");
		} finally {
			System.out.println("Division is fun");
		}
	}
}
