package var;

import java.util.regex.Pattern;

public class StringPatternRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(usernameCheck("Zohaib166"));
		System.out.println(passwordCheck("Zz1#"));
		System.out.println(emailCheck("zohaib@gmailcom"));
	}
	
	public static boolean usernameCheck(String uname) {
		return Pattern.matches("[a-z0-9]{5,}", uname);
	}
	
	public static boolean passwordCheck(String password) {
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";

		return Pattern.matches(regex, password);
	}
	
	public static boolean emailCheck(String email) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		return Pattern.matches(regex, email);
	}

}
