package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;


public class ArmenianProductFashionSizeXL extends ArmenianProductBasePage{

		public ArmenianProductFashionSizeXL (WebDriver driver) {
			super(driver);
			this.driver = driver;

		}

		@FindBy(xpath = FASHION_BUTTON_XPATH)
		public WebElement fashionButton;

		@FindBy(xpath = BUTTON_SIZE_XL_XPATH)
		public WebElement buttonXL;

		@FindBy(xpath = IMAGE_SIZE_XL_XPATH)
		public WebElement imgXL;

		public ArmenianProductFashionSizeXL fashionButtonClick() {
			fashionButton.click();
			return new ArmenianProductFashionSizeXL(this.driver);

		}

		public ArmenianProductFashionSizeXL buttonSClick() {
			buttonXL.click();
			return new ArmenianProductFashionSizeXL(this.driver);

		}
	
}
