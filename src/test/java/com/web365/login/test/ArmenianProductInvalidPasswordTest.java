package com.web365.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.login.ArmenianProductInvalidPassword;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductInvalidPasswordTest extends ArmenianProductBaseTest {
	
	@Test
	public void invalidPasswordTest() {
		System.out.println("Test Case ID Login3");
		System.out.println("Verify user is not allowed to sign in with valid username and invalid password");
		ArmenianProductInvalidPassword invPassword = new ArmenianProductInvalidPassword(driver);
		System.out.println("Navigate to https://armenianproduct.am/");
		invPassword = invPassword.invPasswordTest();
		System.out.println("Step 1 Click on the 'My Account' button");
		System.out.println("Step 2 Click on the username field ");
		System.out.println("Step 3 Enter 'gayane' in the username field" );
		System.out.println("Step 4 Click on the password field");
		System.out.println("Step 5 Enter '123123' in the password field");
		System.out.println("Step 6 Click on the Login button ");

		Assert.assertTrue(invPassword.invalidPassword.isDisplayed());
	}

}
