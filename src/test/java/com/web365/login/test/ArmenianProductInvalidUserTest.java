package com.web365.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.login.ArmenianProductInvalidUsername;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductInvalidUserTest extends ArmenianProductBaseTest {

	@Test
	public void invalidUsername() {
		System.out.println("Test Case ID Login2");
		System.out.println("Verify user is not allowed to sign in with invalid username and valid password");
		ArmenianProductInvalidUsername invUser = new ArmenianProductInvalidUsername(driver);
		System.out.println("Navigate to https://armenianproduct.am/");
		invUser = invUser.myAccountClick();
		System.out.println("Step 1 Click on the 'My Account' button");
		invUser = invUser.usernameFieldClick();
		System.out.println("Step 2 Click on the username field ");
		invUser = invUser.usernameFieldType();
		System.out.println("Step 3 Enter 'gayush' in the username field");
		invUser = invUser.passwordFieldClick();
		System.out.println("Step 4 Click on the password field");
		invUser = invUser.passwordFieldType();
		System.out.println("Step 5 Enter 'gh040299@' in the password field");
		invUser = invUser.loginButtonClick();
		System.out.println("Step 6 Click on the Login button ");

		Assert.assertTrue(invUser.invalidUsername.isDisplayed());

	}
}
