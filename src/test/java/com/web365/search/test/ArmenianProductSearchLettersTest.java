package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.search.field.ArmenianProductSearchLetters;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductSearchLettersTest extends ArmenianProductBaseTest {

	@Test
	public void lettersTest() {
		System.out.println("Test Case ID search2");
		System.out.println("Verify letters are allowed in the search field");

		ArmenianProductSearchLetters searchLetters = new ArmenianProductSearchLetters(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		searchLetters = searchLetters.searchFieldClick();
		System.out.println("Step 1 Click on the search field");
		searchLetters = searchLetters.searchType();
		System.out.println("Step 2 Enter 'earrings' in the search field");
		searchLetters = searchLetters.searchEnter();
		System.out.println("Step 3 Click the enter key");

		Assert.assertTrue(searchLetters.searchResults.isDisplayed());
	}

}
