package com.bridgelabz.user;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	//Validate mobile no
	public static void validMobileNo(String phone) {
		Pattern pattern = Pattern.compile("^[0-9]{2}+[ ][0-9]{10}$");
		Matcher matcher = pattern.matcher(phone);

		if (!matcher.find()) {
			System.out.println("invalid mobile no.");
		} else {
			System.out.println("Valid mobile no.");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("----------Welcome To User Registration------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Mobile no: ");
		String phone = sc.next();
		System.out.println("Mobile No is: " + phone);
		validMobileNo(phone);

	}

}
