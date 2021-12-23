package com.bridgelabz.user;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegTesting {

	boolean result;
	UserRegistrationForTest user = new UserRegistrationForTest();
	
	@Test
	public void firstNamePass() {
		result = user.isFirstName("Ashok");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void firstNameFail() {
		result = user.isFirstName("ashok");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void lastNamePass() {
		result = user.isLastName("Koda");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void lastNameFail() {
		result = user.isLastName("koda");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void EmailPass() {
		result = user.isValidEmail("a.koda59@gmail.com");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void EmailFail() {
		result = user.isValidEmail("a.koda59gmail.com");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void mobileNoPass() {
		result = user.isMobileNumber("91 7396382673");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void mobileNoFail() {
		result = user.isMobileNumber("917396382673");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void passwordPass() {
		result = user.isValidPassword("Koda@1996");
		Assert.assertEquals(true,result);
	}
	@Test
	public void passwordFail() {
		result = user.isValidPassword("koda_1996");
		Assert.assertEquals(true,result);
	}
	

}
