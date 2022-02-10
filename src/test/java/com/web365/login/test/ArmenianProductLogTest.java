package com.web365.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.login.ArmenianProductLoginPage;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductLogTest extends ArmenianProductBaseTest {

	@Test
	public void logTest() {
		System.out.println("Test Case ID Login1");
		System.out.println("Verify user is not allowed to login without filling in the UserName and Password fields");
		ArmenianProductLoginPage loginPage = new ArmenianProductLoginPage(driver);
		System.out.println("Navigate to https://armenianproduct.am/");
		loginPage = loginPage.loginTest();
		System.out.println("Step 1 Click on the 'My Account' button");
		System.out.println("Step 2 Click on the Login button in the popup");

		Assert.assertTrue(loginPage.loginError.isDisplayed());

	}

}
