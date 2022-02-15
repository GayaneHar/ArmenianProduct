package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionListView2Button;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionListView2ButtonTest extends ArmenianProductBaseTest {

	@Test
	public void listView2ButtonTest() {
		System.out.println("Test Case ID Fashion9");
		System.out.println("Verify the list view option is clickable");

		ArmenianProductFashionListView2Button listViewButton = new ArmenianProductFashionListView2Button(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		listViewButton = listViewButton.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' button");
		listViewButton = listViewButton.listView2ButtonClick();
		System.out.println("Step 2 Click on the List View2 button");

		Assert.assertTrue(listViewButton.imgListView2.isDisplayed());
	}

}
