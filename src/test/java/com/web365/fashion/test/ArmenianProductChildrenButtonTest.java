package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionChildrenButton;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductChildrenButtonTest extends ArmenianProductBaseTest {
	
	@Test
	public void childButtonTest() {
		System.out.println("Test Case ID Fashion12");
		System.out.println("Verify the list view option is clickable");

		ArmenianProductFashionChildrenButton child = new ArmenianProductFashionChildrenButton(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		child = child.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' button");
		child = child.childrenButtonClick();
		System.out.println("Step 2  Click on the Children's Fashion button");
        
		Assert.assertTrue(child.childrenImage.isDisplayed());
	}


}


