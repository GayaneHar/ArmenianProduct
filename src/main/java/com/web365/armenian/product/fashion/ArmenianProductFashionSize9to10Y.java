package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSize9to10Y extends ArmenianProductBasePage {

	public ArmenianProductFashionSize9to10Y (WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_9_10Y_XPATH)
	public WebElement button9_10Y;

	@FindBy(xpath = IMAGE_9_10Y_XPATH)
	public WebElement img9_10Y;

	public ArmenianProductFashionSize9to10Y fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSize9to10Y(this.driver);

	}

	public ArmenianProductFashionSize9to10Y button9_10YClick() {
		button9_10Y.click();
		return new ArmenianProductFashionSize9to10Y(this.driver);

	}

}
	

