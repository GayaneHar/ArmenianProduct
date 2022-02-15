package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSize3to4Y;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSize3to4YTest extends ArmenianProductBaseTest {

	@Test
	public void button3to4YTest() {
		System.out.println("Test Case ID Fashion5");
		System.out.println("Verify user is able to filter products to size 3-4Y");

		ArmenianProductFashionSize3to4Y button34Y = new ArmenianProductFashionSize3to4Y(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		button34Y = button34Y.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		button34Y = button34Y.button3_4YClick();
		System.out.println("Step 2 Click on the 3-4Y button from the left menu");

		Assert.assertTrue(button34Y.img3_4Y.isDisplayed());
	}
}
