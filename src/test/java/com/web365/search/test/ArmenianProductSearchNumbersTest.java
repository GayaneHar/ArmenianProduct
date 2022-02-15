package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.search.field.ArmenianProductSearchNumbers;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductSearchNumbersTest extends ArmenianProductBaseTest {

	@Test
	public void numbersTest() {
		System.out.println("Test Case ID search1");
		System.out.println("Verify numbers are allowed in the search field");
		ArmenianProductSearchNumbers searchNum = new ArmenianProductSearchNumbers(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		searchNum = searchNum.searchFieldClick();
		System.out.println("Step 1 Click on the search field");
		searchNum = searchNum.searchType();
		System.out.println("Step 2 Enter ' 772030' in the search field");
		searchNum = searchNum.searchEnter();
		System.out.println("Step 3 Click the enter key");

		Assert.assertTrue(searchNum.searchResults.isDisplayed());
	}

}
