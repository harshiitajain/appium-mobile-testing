package com.flipkart.screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class tshirtSearchResult extends BaseScreen {

	public tshirtSearchResult(AndroidDriver driver) {
		super(driver);
		
	}
	
    @AndroidFindBy(xpath="//android.widget.TextView[contains(text, 'T-Shirt')]")
	public WebElement Tshirts;
	
	
	public tshirtSearchResult addTshirt() {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		Tshirts.click();
		return this;
	}

}
