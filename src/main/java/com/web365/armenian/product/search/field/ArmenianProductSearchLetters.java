package com.web365.armenian.product.search.field;

import static com.web365.armenian.product.search.field.ArmenianProductSearchFieldConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductSearchLetters extends ArmenianProductBasePage{
	
	public ArmenianProductSearchLetters (WebDriver driver) {
		super(driver);
		this.driver = driver;
	}	
		
		@FindBy(xpath = SEARCH_FIELD_XPATH)
		public WebElement searchField;
		
		@FindBy(xpath = SEARCH_RESULTS_EARRINGS_XPATH)
		public WebElement searchResults;
		
		
		public ArmenianProductSearchLetters searchFieldClick() {
			searchField.click();
			return new ArmenianProductSearchLetters(this.driver);

		}

		public ArmenianProductSearchLetters searchType() {
			searchField.sendKeys("earrings");
			return new ArmenianProductSearchLetters(this.driver);

		}

		public ArmenianProductSearchLetters searchEnter() {
			searchField.sendKeys("Enter");
			return new ArmenianProductSearchLetters(this.driver);

		}
		
		

		
		
		
}




