package com.flipkart.screens;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Item extends BaseScreen {

	public Item(AndroidDriver driver) {
		super(driver);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	public WebElement addToCartBtn;
	
	
	public Item addToCart() {
		
		addToCartBtn.click();
		return this;
	}

}
