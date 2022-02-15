package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSizeM extends ArmenianProductBasePage {
	
	public ArmenianProductFashionSizeM (WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_SIZE_M_XPATH)
	public WebElement buttonM;

	@FindBy(xpath = IMAGE_SIZE_M_XPATH)
	public WebElement imgM;

	public ArmenianProductFashionSizeM fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSizeM(this.driver);

	}

	public ArmenianProductFashionSizeM buttonMClick() {
		buttonM.click();
		return new ArmenianProductFashionSizeM(this.driver);

	}


}
