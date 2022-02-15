package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSize24M extends ArmenianProductBasePage {

	public ArmenianProductFashionSize24M(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_24M_XPATH)
	public WebElement button24M;

	@FindBy(xpath = IMAGE_24M_XPATH)
	public WebElement img24M;

	public ArmenianProductFashionSize24M fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSize24M(this.driver);

	}

	public ArmenianProductFashionSize24M button24MClick() {
		button24M.click();
		return new ArmenianProductFashionSize24M(this.driver);

	}

}
