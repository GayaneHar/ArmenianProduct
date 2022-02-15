package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSize6M;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSize6MTest extends ArmenianProductBaseTest {

	@Test
	public void button6MTest() {
		System.out.println("Test Case ID Fashion3");
		System.out.println("Verify user is able to filter products to size 6M");

		ArmenianProductFashionSize6M button6M = new ArmenianProductFashionSize6M(driver);

		System.out.println("Navigate to https://armenianproduct.am/");

		button6M = button6M.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		button6M = button6M.button6MClick();
		System.out.println("Step 2 Click on the 6M button from the left menu");

		Assert.assertTrue(button6M.log6M.isDisplayed());
	}
}
