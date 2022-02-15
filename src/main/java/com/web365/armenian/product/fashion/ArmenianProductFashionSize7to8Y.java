package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSize7to8Y extends ArmenianProductBasePage  {

	public ArmenianProductFashionSize7to8Y (WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_7_8Y_XPATH)
	public WebElement button7_8Y;

	@FindBy(xpath = IMAGE_7_8Y_XPATH)
	public WebElement img7_8Y;

	public ArmenianProductFashionSize7to8Y fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSize7to8Y(this.driver);

	}

	public ArmenianProductFashionSize7to8Y button7_8YClick() {
		button7_8Y.click();
		return new ArmenianProductFashionSize7to8Y(this.driver);

	}

}



