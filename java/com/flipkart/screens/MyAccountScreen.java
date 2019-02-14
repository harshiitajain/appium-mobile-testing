package com.flipkart.screens;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyAccountScreen extends BaseScreen
{

	public MyAccountScreen(AndroidDriver driver) {
		super(driver);
		
		
	}
	
	@AndroidFindBy(id="com.flipkart.android:id/title_action_bar")
	public WebElement pageTitle;
	
	@AndroidFindBy(id="com.flipkart.android:id/search_icon")
	public WebElement searchIcon;
	
	public String getTitle() {
		
		return pageTitle.getText();
	}
	
	

	public MyAccountScreen clickonSearch() {

		searchIcon.click();
		return this;
	}
	
	public MyAccountScreen pressLogout(String text) {
		
		MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().index(\""+text+"\"));");  
		
		elementToClick.click();
		return this;
	}
	

      
}
