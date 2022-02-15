package com.web365.armenian.product.search.field;

import static com.web365.armenian.product.search.field.ArmenianProductSearchFieldConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductSearchNumbers extends ArmenianProductBasePage {

	
	public ArmenianProductSearchNumbers (WebDriver driver) {
		super(driver);
		this.driver = driver;
	}	
		
		@FindBy(xpath = SEARCH_FIELD_XPATH)
		public WebElement searchField;
		
		@FindBy(xpath = SEARCH_RESULTS_772030_XPATH)
		public WebElement searchResults;
		
		
		public ArmenianProductSearchNumbers searchFieldClick() {
			searchField.click();
			return new ArmenianProductSearchNumbers(this.driver);

		}

		public ArmenianProductSearchNumbers searchType() {
			searchField.sendKeys("772030");
			return new ArmenianProductSearchNumbers(this.driver);

		}

		public ArmenianProductSearchNumbers searchEnter() {
			searchField.sendKeys("Enter");
			return new ArmenianProductSearchNumbers(this.driver);

		}
		
		

		
		
		
}

