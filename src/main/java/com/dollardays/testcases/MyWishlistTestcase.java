package com.dollardays.testcases;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.MyWishlistPage;
import com.dollardays.pages.SearchPage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class MyWishlistTestcase extends BaseTest
{
	@DDDataProvider(datafile = "testdata/MyWishlist.xlsx", sheetName = "MyWishlist",  testcaseID = "TC2", runmode = "No")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_2MyWishList(Hashtable<String, String> datatable) throws Exception 
{
//Calling LoginPage 
//ExtentTestManager is Used for Print the Log in Reports
	ExtentTestManager.getTest().log(Status.PASS, "Testcase  : Verify Login Functionality");
	LoginPage loginPage = new LoginPage(driver); //New used for Creating Object
	ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid Credentials");

//Fetching UserName and Password from Excel Sheet and Displaying Here
	loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
	Thread.sleep(2000); // Wait Time between two events	
		
//Opening WishList DropDown List
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : My Wishlist Drop Down List Functionality");

	ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Wishlist Dropdown Clicked");
	MyWishlistPage myWishlist = new MyWishlistPage(driver);
	myWishlist.getWishlistDropDown().click();             
	Thread.sleep(2000);
	ExtentTestManager.getTest().log(Status.PASS, "Step 3  : My Wishlist Page Loaded Successfully");
	Thread.sleep(2000);



//For Returning Customers Sign Out
	Thread.sleep(2000);
	loginPage.getUserDrodown().click();
	Thread.sleep(1000);
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	@DDDataProvider(datafile = "testdata/MyWishlist.xlsx", sheetName = "MyWishlist",  testcaseID = "TC1", runmode = "No")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_1MyWishList(Hashtable<String, String> datatable, String String) throws Exception 
{
//Opening WishList DropDown List	
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : My Wishlist Drop Down List Functionality");
	ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Wishlist Dropdown Clicked");
	MyWishlistPage myWishlist = new MyWishlistPage(driver);
	myWishlist.getWishlistDropDown().click();             
	Thread.sleep(2000);
	ExtentTestManager.getTest().log(Status.PASS, "Step 3  : My Wishlist Page Loaded Successfully");
	Thread.sleep(2000);
	
//Learn More Page Opened
	ExtentTestManager.getTest().log(Status.PASS, "Step 4 : Learn Page Opened");
	Thread.sleep(2000);
	myWishlist.getLearnMore().click();
	Thread.sleep(2000);
}	
}*/	
/*
//For Organization Name or WishList Name
	
	ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Entering Organization Or WishList Name in the Text Box");
	getOrgWishBar().clear();
	myWishlist.getOrganizationName().sendKeys("Organisation Name or Wishlist Name");
	Thread.sleep(3000);
	
	
	
	ExtentTestManager.getTest().log(Status.PASS, "Step 6 : Entering City,State,Zipcode in the Text Box");
	//myWishlist.getCityStateZipBar().sendKeys("Florida");
	Thread.sleep(4000);
	
	ExtentTestManager.getTest().log(Status.PASS, "Step 7 : Click Search Button");
	myWishlist.getSearchButton().click();
	Thread.sleep(2000);
	
	
	
//Click Create a WishList Button
/*	ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Clicked Create a Wishlist Button");
	Thread.sleep(2000);
	myWishlist.getCreateWishListButton().click();
	*/
//
	

	

	
	
	
	




	
	
	
	
	
	
	


	

