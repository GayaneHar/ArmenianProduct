package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSizeS extends ArmenianProductBasePage {

	public ArmenianProductFashionSizeS (WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_SIZE_S_XPATH)
	public WebElement buttonS;

	@FindBy(xpath = IMAGE_SIZE_S_XPATH)
	public WebElement imgS;

	public ArmenianProductFashionSizeS fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSizeS(this.driver);

	}

	public ArmenianProductFashionSizeS buttonSClick() {
		buttonS.click();
		return new ArmenianProductFashionSizeS(this.driver);

	}
}
