package com.bridgelabz.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForTest {

	//Check First name
	public boolean isFirstName(String fname) {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
		Matcher matcher = pattern.matcher(fname);
		
		if (!matcher.find()) {
			return false;
		}
		return true;
	}
	
	//Check Last name
	public boolean isLastName(String lname) {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
		Matcher matcher = pattern.matcher(lname);
		
		if (!matcher.find()) {
			return false;
		}
		return true;
	}
	
	//Check email
	public boolean isValidEmail(String email) {
		Pattern pattern = Pattern.compile("^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$");
		Matcher matcher = pattern.matcher(email);
		
		if (!matcher.find()) {
			return false;
		}
		return true;
	}
	
	//Check Mobile number
	public boolean isMobileNumber(String phone) {
		Pattern pattern = Pattern.compile("^[0-9]{2}+[ ][0-9]{10}$");
		Matcher matcher = pattern.matcher(phone);
		
		if (!matcher.find()) {
			return false;
		}
		return true;
	}
	
	//Check password
	public boolean isValidPassword(String password) {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$");
		Matcher matcher = pattern.matcher(password);
		
		if (!matcher.find()) {
			return false;
		}
		return true;
	}

}
