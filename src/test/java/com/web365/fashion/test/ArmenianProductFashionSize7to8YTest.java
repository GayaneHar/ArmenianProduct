package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSize7to8Y;
import com.web365.base.test.ArmenianProductBaseTest;


public class ArmenianProductFashionSize7to8YTest extends ArmenianProductBaseTest {
	
	@Test
	public void button7to8YTest() {
		System.out.println("Test Case ID Fashion16");
		System.out.println("Verify user is able to filter products to size 7-8Y");

		ArmenianProductFashionSize7to8Y button7to8Y = new ArmenianProductFashionSize7to8Y(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		button7to8Y = button7to8Y.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		button7to8Y = button7to8Y.button7_8YClick();
		System.out.println("Step 2 Click on the 7-8Y button from the left menu");

		Assert.assertTrue(button7to8Y.img7_8Y.isDisplayed());

}
	
}
