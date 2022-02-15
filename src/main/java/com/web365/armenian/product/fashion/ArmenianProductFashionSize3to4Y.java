package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSize3to4Y extends ArmenianProductBasePage {

	public ArmenianProductFashionSize3to4Y(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_3_4Y_XPATH)
	public WebElement button3_4Y;

	@FindBy(xpath = IMAGE_3_4Y_XPATH)
	public WebElement img3_4Y;

	public ArmenianProductFashionSize3to4Y fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSize3to4Y(this.driver);

	}

	public ArmenianProductFashionSize3to4Y button3_4YClick() {
		button3_4Y.click();
		return new ArmenianProductFashionSize3to4Y(this.driver);

	}

}
