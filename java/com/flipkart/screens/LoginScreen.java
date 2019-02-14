package com.flipkart.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginScreen extends BaseScreen{
	
	
	
	public LoginScreen(AndroidDriver driver) {
		
		super(driver);
		
	}
	
	
	
	@AndroidFindBy(id="com.flipkart.android:id/btn_skip")
	public WebElement  closeBtn;
	
	@AndroidFindBy(id="com.flipkart.android:id/mobileNo")
	public WebElement mobileNo;
	
	@AndroidFindBy(id="com.flipkart.android:id/et_password")
	public WebElement password;
	
	@AndroidFindBy(id="com.flipkart.android:id/btn_mlogin")
	public WebElement signinBtn;
	
	

	public LoginScreen closeScreen() {
		
		closeBtn.click();
		
		return this;
	}
	
	public LoginScreen enterMobileNo(String text) {
		
		mobileNo.clear();
		mobileNo.sendKeys(text);
		return this;
	}

	public LoginScreen enterPassword(String text) {
	   
	   password.clear();
	   password.sendKeys(text);
	   return this;
	}

	public LoginScreen clickSignIn() {
	
	  signinBtn.click();
	  return this;
	}

}
