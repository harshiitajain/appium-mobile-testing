package com.flipkart.tests;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.flipkart.screens.BaseClass;
import com.flipkart.screens.HomeScreen;
import com.flipkart.screens.Item;
import com.flipkart.screens.LoginScreen;
import com.flipkart.screens.MyAccountScreen;
import com.flipkart.screens.SearchScreen;
import com.flipkart.screens.tshirtSearchResult;

public class SignIn_AddToCart extends BaseClass{
	
	
	@Test
	public void BeginTest() throws IOException {
		
		FileReader file = new FileReader("resources\\Utils\\data.properties");
		Properties properties = new Properties();
		properties.load(file);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginScreen loginScreen = new LoginScreen(driver);
		HomeScreen homeScreen = new HomeScreen(driver);
		MyAccountScreen myaccountScreen = new MyAccountScreen(driver);
		SearchScreen searchScreen = new SearchScreen(driver);
		tshirtSearchResult res = new tshirtSearchResult(driver);
		Item item = new Item(driver);
		
		loginScreen.closeScreen();
		homeScreen.clickMenu();
		homeScreen.clickMyAccount(properties.getProperty("myAccount"));
		loginScreen.enterMobileNo(properties.getProperty("mobileNo"));
		loginScreen.enterPassword(properties.getProperty("password"));
		loginScreen.clickSignIn();
		
		
		Assert.assertEquals(myaccountScreen.getTitle(), properties.getProperty("myAccount"));
		
		myaccountScreen.clickonSearch();
				
		searchScreen.enterSearchCategory(properties.getProperty("SearchProduct"));
		
		searchScreen.selectTshirt();
				
		res.addTshirt();
		
		item.addToCart();
		
		
		
	   
		
	}

}
