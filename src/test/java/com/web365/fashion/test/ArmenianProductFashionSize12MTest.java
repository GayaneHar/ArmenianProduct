package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSize12M;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSize12MTest extends ArmenianProductBaseTest {
	
	@Test
	public void button12MTest() {
		System.out.println("Test Case ID Fashion1");
		System.out.println("Verify user is able to filter products to size 12M");
		ArmenianProductFashionSize12M button12M = new ArmenianProductFashionSize12M(driver);
		System.out.println("Navigate to https://armenianproduct.am/");
		button12M = button12M.button12MTest();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		System.out.println("Step 2 Click on the 12M button from the left menu");
		

		Assert.assertTrue(button12M.img12M.isDisplayed());
	}

}
