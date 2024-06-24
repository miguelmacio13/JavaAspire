package payrollManagement;

import java.util.InputMismatchException;

public class CustomExceptions{
	
	public static class IdAlreadyExist extends Exception {
		public IdAlreadyExist(String message) {
			super(message);
		}
	}
	
	public static class IdDoesNotExist extends Exception {
		public IdDoesNotExist(String message) {
			super(message);
		}
	}
	
}
