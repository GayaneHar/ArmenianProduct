package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSize24M;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSize24MTest extends ArmenianProductBaseTest {

	@Test
	public void button24MTest() {
		System.out.println("Test Case ID Fashion4");
		System.out.println("Verify user is able to filter products to size 24M");

		ArmenianProductFashionSize24M button24M = new ArmenianProductFashionSize24M(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		button24M = button24M.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		button24M = button24M.button24MClick();
		System.out.println("Step 2 Click on the 24M button from the left menu");

		Assert.assertTrue(button24M.img24M.isDisplayed());
	}
}
