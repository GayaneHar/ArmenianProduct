package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFasionSize18M;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSize18MTest extends ArmenianProductBaseTest {

	@Test
	public void button18MTest() {
		System.out.println("Test Case ID Fashion2");
		System.out.println("Verify user is able to filter products to size 18M");
		ArmenianProductFasionSize18M button18M = new ArmenianProductFasionSize18M(driver);
		System.out.println("Navigate to https://armenianproduct.am/");
		button18M = button18M.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		button18M = button18M.fashionButtonClick();
		System.out.println("Step 2 Click on the 18M button from the left menu");

		Assert.assertTrue(button18M.img18M.isDisplayed());
	}
}
