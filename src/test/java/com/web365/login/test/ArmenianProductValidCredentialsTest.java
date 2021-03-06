package com.web365.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.login.ArmenianProductLoginValidCredentials;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductValidCredentialsTest extends ArmenianProductBaseTest {

	@Test
	public void credentialsTest() {
		System.out.println("Test Case ID Login4");
		System.out.println("Verify user is able to sign in with valid credentials");

		ArmenianProductLoginValidCredentials valCredentials = new ArmenianProductLoginValidCredentials(driver);

		System.out.println("Navigate to https://armenianproduct.am/");

		valCredentials = valCredentials.myAccountClick();
		System.out.println("Step 1 Click on the 'My Account' button");
		valCredentials = valCredentials.usernameFieldClick();
		System.out.println("Step 2 Click on the username field ");
		valCredentials = valCredentials.usernameFieldType();
		System.out.println("Step 3 Enter 'gayane' in the username field");
		valCredentials = valCredentials.passwordFieldClick();
		System.out.println("Step 4 Click on the password field");
		valCredentials = valCredentials.passwordFieldType();
		System.out.println("Step 5 Enter 'gh020499@' in the password field");
		valCredentials = valCredentials.loginButtonClick();
		System.out.println("Step 6 Click on the Login button ");

		Assert.assertTrue(valCredentials.credentials.isDisplayed());
	}

}
