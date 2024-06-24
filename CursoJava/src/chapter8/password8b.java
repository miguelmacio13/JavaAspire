package chapter8;

public class password8b {
	public static void main(String args[]) {
		String oldPassword = "Aspire@123";
		String newPassword;
		String userName = "miguelmacio13";
		boolean isPasswordValid = false;
		
		
		
		while(!isPasswordValid) {
			newPassword = wrappedClass8b.getSentence();
			boolean isPasswordValid1 = passwordLength(newPassword);
			boolean isPasswordValid2 = passwordUC(newPassword);
			boolean isPasswordValid3 = passwordSC(newPassword);
			boolean isPasswordValid4 = usernameFlag(newPassword, userName);
			boolean isPasswordValid5 = oldPasswordFlag(newPassword, oldPassword);
			
			if(isPasswordValid1 && isPasswordValid2 && isPasswordValid3 &&isPasswordValid4 && isPasswordValid5) {
				isPasswordValid = true;
				oldPassword = newPassword;
			}
		}
		System.out.println("Password has changed to: " + oldPassword);
		
	}
	
	public static boolean passwordLength(String password) {
		if (password.length() <8) {
			System.out.println("Your password is too short; it must contain at least 8 characters");
			return false;
		}
		else {
			return true;	
		}
	}
	
	public static boolean passwordUC(String password) {
		boolean isPsswUP = false;
		for(int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))){
				isPsswUP = true;
				break;
			}
			else {
				isPsswUP = false;
				
			}
		}
		
		if (!isPsswUP) {
			System.out.println("Your password must contain an upper case");
		}
		return isPsswUP;
	}
	
	public static boolean passwordSC(String password) {
		boolean isPsswSC = false;
		for(int i = 0; i < password.length(); i++) {
			if (password.matches("[a-zA-Z0-9 ]*")){
				isPsswSC = false;
			}
			else {
				isPsswSC = true;
				break;
			}
		}
		
		if (!isPsswSC) {
			System.out.println("Your password must contain an special character");
		}
		return isPsswSC;
	}
	
	public static boolean usernameFlag(String password, String username) {
		if (password.toUpperCase().contains(username.toUpperCase())) {
			System.out.println("Cannot use username inside password");
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean oldPasswordFlag(String password, String oldPassword) {
		if (password.matches(oldPassword)) {
			System.out.println("You cannot use old password");
			return false;
		}
		else {
			return true;
		}
	}
	

}
