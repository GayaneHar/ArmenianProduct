package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSize9M;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSize9MTest extends ArmenianProductBaseTest {

	@Test
	public void button9MTest() {
		System.out.println("Test Case ID Fashion6");
		System.out.println("Verify user is able to filter products to size 9M");

		ArmenianProductFashionSize9M button9M = new ArmenianProductFashionSize9M(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		button9M = button9M.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		button9M = button9M.button9MClick();
		System.out.println("Step 2 Click on the 9M button from the left menu");

		Assert.assertTrue(button9M.img9M.isDisplayed());
	}
}
