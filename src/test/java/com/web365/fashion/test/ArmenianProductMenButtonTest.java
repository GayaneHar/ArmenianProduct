package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionMenButton;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductMenButtonTest extends ArmenianProductBaseTest {

	@Test
	public void menButtonTest() {
		System.out.println("Test Case ID Fashion10");
		System.out.println("Verify the list view option is clickable");

		ArmenianProductFashionMenButton men = new ArmenianProductFashionMenButton(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		men = men.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' button");
		men = men.menButtonClick();
		System.out.println("Step 2  Click on the Men's Fashion button");

		Assert.assertTrue(men.menImage.isDisplayed());
	}

}
