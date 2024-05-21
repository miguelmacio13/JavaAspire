package BankingSystem;

public class CustomExceptions {
    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    public static class NegativeAmountException extends Exception {
        public NegativeAmountException(String message) {
            super(message);
        }
    }
    
    
    public static class InvalidAccountNumberExceptions extends Exception {
        public InvalidAccountNumberExceptions(String message) {
            super(message);
        }
    }
}
