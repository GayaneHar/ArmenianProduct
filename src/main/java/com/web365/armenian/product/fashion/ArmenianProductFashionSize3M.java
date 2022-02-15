package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSize3M extends ArmenianProductBasePage {
	
	public ArmenianProductFashionSize3M (WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_3M_XPATH)
	public WebElement button3M;

	@FindBy(xpath = IMAGE_3M_XPATH)
	public WebElement img3M;

	public ArmenianProductFashionSize3M fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSize3M(this.driver);

	}

	public ArmenianProductFashionSize3M button3MClick() {
		button3M.click();
		return new ArmenianProductFashionSize3M(this.driver);

	}


}
