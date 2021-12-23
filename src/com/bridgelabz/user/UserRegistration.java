package com.bridgelabz.user;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	//Validate Password
	public static void validPassword(String password) {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$");
		Matcher matcher = pattern.matcher(password);

		if (!matcher.find()) {
			System.out.println("invalid password.");
		} else {
			System.out.println("Valid password.");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("----------Welcome To User Registration------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Password: ");
		String pass = sc.next();
		System.out.println("Password is: " + pass);
		validPassword(pass);

	}

}
