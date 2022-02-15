package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSize4to5Y;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSize4to5YTest extends ArmenianProductBaseTest {

	@Test
	public void button4to5Test() {
		System.out.println("Test Case ID Fashion15");
		System.out.println("Verify user is able to filter products to size 4-5Y");

		ArmenianProductFashionSize4to5Y button4to5Y = new ArmenianProductFashionSize4to5Y(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		button4to5Y = button4to5Y.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		button4to5Y = button4to5Y.button4_5YClick();
		System.out.println("Step 2 Click on the 4-5Y button from the left menu");

		Assert.assertTrue(button4to5Y.img4_5Y.isDisplayed());
	}
}

	

