
package com.flipkart.screens;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends BaseScreen {
	
	String LIST_ID = "com.flipkart.android:id/flyout_recycler_view";
	
	public HomeScreen(AndroidDriver driver) {
		
		super(driver);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement menu;
	
	@AndroidFindBy(xpath="///android.widget.TextView[@text='My Account']")
	public WebElement myAccount;
	
	
	public HomeScreen clickMenu() {
		
		menu.click();
		return this;
	}
	
	public HomeScreen clickMyAccount(String text) {
		MobileElement element = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".resourceId(\""+LIST_ID+"\")).scrollIntoView("
                + "new UiSelector().text(\""+text+"\"));");  
		
		element.click();
		
		return this;
	}

}
