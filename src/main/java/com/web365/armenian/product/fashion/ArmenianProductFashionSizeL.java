package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSizeL extends ArmenianProductBasePage {

	public ArmenianProductFashionSizeL (WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_SIZE_L_XPATH)
	public WebElement buttonL;

	@FindBy(xpath = IMAGE_SIZE_L_XPATH)
	public WebElement imgL;

	public ArmenianProductFashionSizeL fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSizeL(this.driver);

	}

	public ArmenianProductFashionSizeL buttonLClick() {
		buttonL.click();
		return new ArmenianProductFashionSizeL(this.driver);

	}

}
	

