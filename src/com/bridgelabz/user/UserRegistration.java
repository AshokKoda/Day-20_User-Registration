package com.bridgelabz.user;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	//Validate email id
	public static void validEmail(String email) {
		Pattern pattern = Pattern.compile("^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$");
		Matcher matcher = pattern.matcher(email);

		if (!matcher.find()) {
			System.out.println("Invalid email.");
		} else {
			System.out.println("Valid email.");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("----------Welcome To User Registration------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email: ");
		String emailId = sc.next();
		System.out.println("Email is: " + emailId);
		validEmail(emailId);

	}

}
