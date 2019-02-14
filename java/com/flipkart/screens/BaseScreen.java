package com.flipkart.screens;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BaseScreen {

	public static AndroidDriver driver;
	
	public BaseScreen(AndroidDriver driver) {
		
		this.driver = driver;
		loadElements();
	}
	
public void loadElements() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}
