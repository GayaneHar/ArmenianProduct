package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.search.field.ArmenianProductSearchLowercaseLetters;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductSearchLowercaseLettersTest extends ArmenianProductBaseTest{

	
	@Test
	public void searchButtonTest() {
		System.out.println("Test Case ID search5");
		System.out.println("Verify lowercase letters are allowed in the search field");

		ArmenianProductSearchLowercaseLetters lowercaseLetters = new ArmenianProductSearchLowercaseLetters(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		lowercaseLetters = lowercaseLetters.searchFieldClick();
		System.out.println("Step 1 Click on the search field");
		lowercaseLetters = lowercaseLetters.searchType();
		System.out.println("Step 2 Enter 'rings' in the search field");
		lowercaseLetters = lowercaseLetters.searchEnter();
		System.out.println("Step 3 Click the enter key");

		Assert.assertTrue(lowercaseLetters.searchResults.isDisplayed());
	}

}

