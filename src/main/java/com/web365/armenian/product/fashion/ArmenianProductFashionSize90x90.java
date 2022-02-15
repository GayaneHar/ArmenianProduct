package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSize90x90 extends ArmenianProductBasePage {

	public ArmenianProductFashionSize90x90(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_90X90_XPATH)
	public WebElement button90X90;

	@FindBy(xpath = IMAGE_90X90_XPATH)
	public WebElement img90X90;

	public ArmenianProductFashionSize90x90 fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSize90x90(this.driver);

	}

	public ArmenianProductFashionSize90x90 button90X90Click() {
		button90X90.click();
		return new ArmenianProductFashionSize90x90(this.driver);

	}

}
