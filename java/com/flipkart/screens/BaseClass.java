package com.flipkart.screens;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	public AndroidDriver driver;
	
	@BeforeTest
	public void beforeTest() throws MalformedURLException {
		
	//	File file = new File("src\\test\\resources\\app\\flipkartx86.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformName","Android");
	//	capabilities.setCapability("app",file.getAbsolutePath() );
		capabilities.setCapability("PlatformVersion","7.0");
		capabilities.setCapability("deviceName","CET8GAQGYHGUS8OV");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.flipkart.android");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.flipkart.android.activity.HomeFragmentHolderActivity");
		
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
	
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
