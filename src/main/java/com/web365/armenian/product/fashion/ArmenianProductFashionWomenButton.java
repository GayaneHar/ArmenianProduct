package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionWomenButton extends ArmenianProductBasePage{
	
	public ArmenianProductFashionWomenButton(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = WOMAN_BUTTON_XPATH)
	public WebElement womenButton;

	@FindBy(xpath = WOMAN_IMAGE_XPATH)
	public WebElement womenImage;

	public ArmenianProductFashionWomenButton fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionWomenButton(this.driver);

	}

	public ArmenianProductFashionWomenButton womenButtonClick() {
		womenButton.click();
		return new ArmenianProductFashionWomenButton(this.driver);

	}


}
