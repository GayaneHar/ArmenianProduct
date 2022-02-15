package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSize3M;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSize3MTest extends ArmenianProductBaseTest {
	
	@Test
	public void button3MTest() {
		System.out.println("Test Case ID Fashion14");
		System.out.println("Verify user is able to filter products to size 3M");

		ArmenianProductFashionSize3M button3M = new ArmenianProductFashionSize3M(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		button3M = button3M.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		button3M = button3M.button3MClick();
		System.out.println("Step 2 Click on the 3M button from the left menu");

		Assert.assertTrue(button3M.img3M.isDisplayed());
	}
}

