package com.bridgelabz.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSamples {

	//Email valid samples
	public boolean isValidEmailTest(String pass) {
        String regex = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pass);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		EmailSamples user = new EmailSamples();
		
		System.out.println(user.isValidEmailTest("abc@.com"));
		System.out.println(user.isValidEmailTest("abc123@.com.co"));
		System.out.println(user.isValidEmailTest("abc@yahoo.com"));
        System.out.println(user.isValidEmailTest("abc-100@yahoo.com"));
        System.out.println(user.isValidEmailTest("abc.100@yahoo.com"));
        System.out.println(user.isValidEmailTest("abc111@abc.com"));
        System.out.println(user.isValidEmailTest("abc-100@abc.net"));
        System.out.println(user.isValidEmailTest("abc.100@abc.com.au"));
        System.out.println(user.isValidEmailTest("abc@1.com"));
        System.out.println(user.isValidEmailTest("abc@yahoo.com.com"));
        System.out.println(user.isValidEmailTest("abc+100@yahoo.com"));

	}

}