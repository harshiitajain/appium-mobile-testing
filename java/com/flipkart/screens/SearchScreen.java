package com.flipkart.screens;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchScreen extends BaseScreen{

	public SearchScreen(AndroidDriver driver) {
		super(driver);
		
	}
	
	@AndroidFindBy(id="com.flipkart.android:id/search_autoCompleteTextView")
	public WebElement searchField;
	
	@AndroidFindBy(id="com.flipkart.android:id/root_titles")
	public List<WebElement> itemList;
	
	@AndroidFindBy(id="com.flipkart.android:id/back_icon")
	public WebElement backBtn;
	
	
	public SearchScreen enterSearchCategory(String text) {
		
		searchField.sendKeys(text);	
		
		return this;
	}
	

	public SearchScreen selectTshirt() {
		
	//	driver.pressKeyCode(AndroidKeyCode.ENTER);
		itemList.get(0).click();
		return this;
	}
	
	public SearchScreen pressBackBtn() {
		
		backBtn.click();
		return this;
	}

}
