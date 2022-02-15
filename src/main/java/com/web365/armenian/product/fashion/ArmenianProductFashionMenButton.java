package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionMenButton extends ArmenianProductBasePage {

	public ArmenianProductFashionMenButton(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = MEN_BUTTON_XPATH)
	public WebElement menButton;

	@FindBy(xpath = MEN_IMAGE_XPATH)
	public WebElement menImage;

	public ArmenianProductFashionMenButton fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionMenButton(this.driver);

	}

	public ArmenianProductFashionMenButton menButtonClick() {
		menButton.click();
		return new ArmenianProductFashionMenButton(this.driver);

	}

}
