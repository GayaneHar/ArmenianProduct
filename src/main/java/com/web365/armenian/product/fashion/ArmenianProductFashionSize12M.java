package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSize12M extends ArmenianProductBasePage {

	public ArmenianProductFashionSize12M(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_12M_XPATH)
	public WebElement button12M;

	@FindBy(xpath = IMAGE_12M_XPATH)
	public WebElement img12M;

	public ArmenianProductFashionSize12M fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSize12M(this.driver);

	}

	public ArmenianProductFashionSize12M button12MClick() {
		button12M.click();
		return new ArmenianProductFashionSize12M(this.driver);

	}

}
