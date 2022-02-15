package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionChildrenButton extends ArmenianProductBasePage {
	
	public ArmenianProductFashionChildrenButton(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = CHILDREN_BUTTON_XPATH)
	public WebElement childrenButton;

	@FindBy(xpath = CHILDREN_IMAGE_XPATH)
	public WebElement childrenImage;

	public ArmenianProductFashionChildrenButton fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionChildrenButton(this.driver);

	}

	public ArmenianProductFashionChildrenButton childrenButtonClick() {
		childrenButton.click();
		return new ArmenianProductFashionChildrenButton(this.driver);

	}


}



