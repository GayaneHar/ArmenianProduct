package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSize36to40 extends ArmenianProductBasePage {
	
	public ArmenianProductFashionSize36to40(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_36_40_XPATH)
	public WebElement button36_40;

	@FindBy(xpath = IMAGE_36_40_XPATH)
	public WebElement img36_40;

	public ArmenianProductFashionSize36to40 fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSize36to40(this.driver);

	}

	public ArmenianProductFashionSize36to40 button36_40Click() {
		button36_40.click();
		return new ArmenianProductFashionSize36to40(this.driver);

	}

}



