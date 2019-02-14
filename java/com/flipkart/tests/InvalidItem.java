package com.flipkart.tests;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.flipkart.screens.BaseClass;
import com.flipkart.screens.HomeScreen;
import com.flipkart.screens.Item;
import com.flipkart.screens.LoginScreen;
import com.flipkart.screens.MyAccountScreen;
import com.flipkart.screens.ResultNotFound;
import com.flipkart.screens.SearchScreen;
import com.flipkart.screens.tshirtSearchResult;

public class InvalidItem extends BaseClass {
	   
		@Test
		public void BeginTest() throws IOException {
			
			FileReader f = new FileReader("src\\test\\resources\\Utils\\data.properties");
			Properties prop = new Properties();
			prop.load(f);
			
			LoginScreen loginScreen = new LoginScreen(driver);
			HomeScreen homeScreen = new HomeScreen(driver);
			MyAccountScreen myaccountScreen = new MyAccountScreen(driver);
			SearchScreen searchScreen = new SearchScreen(driver);
			tshirtSearchResult res = new tshirtSearchResult(driver);
			Item item = new Item(driver);
			ResultNotFound noResults = new ResultNotFound(driver);
			
			loginScreen.closeScreen();
			homeScreen.clickMenu();
			homeScreen.clickMyAccount(prop.getProperty("myAccountText"));
			loginScreen.enterMobileNo(prop.getProperty("mobileNo"));
			loginScreen.enterPassword(prop.getProperty("password"));
			loginScreen.clickSignIn();
			
			
			Assert.assertEquals(myaccountScreen.getTitle(), prop.getProperty("myAccountText"));
			
			myaccountScreen.clickonSearch();
			
			searchScreen.enterSearchCategory(prop.getProperty("invalidSearchTerm"));		
			
			noResults.getErrorText("Sorry, no results found!");
			
			noResults.pressBackBtn();
			
			searchScreen.pressBackBtn();
			
			homeScreen.clickMenu();
			
			homeScreen.clickMyAccount(prop.getProperty("myAccountText"));
			
			myaccountScreen.pressLogout(prop.getProperty("indexLogout"));
			
	
			
		   
			
		}
	}
