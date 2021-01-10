package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.Hashtable;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;
import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.MyFavoritesPage;
import com.dollardays.pages.SearchPage;


	@SuppressWarnings("unused")
	public class MyFavoritesTestcase extends BaseTest
	{
	
//For Favorites Symbol is Enabled or Disabled
		String SKUCode = null;
//For Sort By -> Best Match Option
		
//Fetching TestCase from Excel Sheet
		@DDDataProvider(datafile = "testdata/MyFavorites.xlsx", sheetName = "Favorites",  testcaseID = "", runmode = "Yes")
		@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
		public void TC_08BestMatch(Hashtable<String, String> datatable) throws Exception
	{
					
//Calling LoginPage 
//ExtentTestManager is Used for Print the Log in Reports
		ExtentTestManager.getTest().log(Status.INFO, "Testcase 8 : Verify Best Match Functionality");
		LoginPage loginPage = new LoginPage(driver); //New used for Creating Object
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid Credentials");

//Fetching UserName and Password from Excel Sheet and Displaying Here
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(2000); // Wait Time between two events	
		
//For Returning Customers Sign In Page Open
 		Thread.sleep(2000);
		loginPage.getUserDrodown().click();
		Thread.sleep(1000);
		
//Calling MyFavoritesPage
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Login Dropdown Clicked");
		MyFavoritesPage myFavoritesPage = new MyFavoritesPage(driver);
		myFavoritesPage.getFavoritesPage().click();             //Favorites Module Opened
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : My Favorites Page Loaded Successfully");
		Thread.sleep(2000);
		
//Best Match Test Case #Start
		
//myFavoritesPage.getOption_SortByDropDown().sendKeys("Best Match");
		//Select For selecting String or Index or Value from Drop Down List
		Select SBDdown= new Select(myFavoritesPage.getOption_SortByDropDown());
		SBDdown.selectByVisibleText(datatable.get("Sort By"));
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Best Match Sort Option Success");
		
//myFavoritesPage.getOption_ItemViewDropDown().sendKeys("12");
		Select VDdown= new Select(myFavoritesPage.getOption_ItemViewDropDown());
		VDdown.selectByIndex(0);
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : 12 Items are Displaying For Best Match");
		Thread.sleep(2000);
//CODE FOR NEXT PAGE BUTTON
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : 12 Items :: Next Button click event");
		Thread.sleep(2000);
		
		VDdown.selectByIndex(1);	
		ExtentTestManager.getTest().log(Status.PASS, "Step 7  : 24 Items are Displaying For Best Match");
		Thread.sleep(2000);
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 8 : 24 Items :: Next Button click event");		

		VDdown.selectByIndex(2);	
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 9  : 48 Items are Displaying For Best Match");
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 10 : 48 Items :: Next Button click event");
//Best Match Test Case #End		
  }

//For Sort By -> Newest First Option
//Fetching TestCase from Excel Sheet
		@DDDataProvider(datafile = "testdata/MyFavorites.xlsx", sheetName = "Favorites",  testcaseID = "TC9", runmode = "Yes")
		@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
		public void TC_09NewestFirst(Hashtable<String, String> datatable) throws Exception
	{
			
//Calling LoginPage 
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 9 : Verify Newest First Functionality");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid Credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(2000);	
		
		Thread.sleep(2000);
		loginPage.getUserDrodown().click();
		Thread.sleep(1000);
		
//Calling MyFavoritesPage
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Login Dropdown Clicked");
		MyFavoritesPage myFavoritesPage = new MyFavoritesPage(driver);
		myFavoritesPage.getFavoritesPage().click();
		Thread.sleep(2000);
		
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : My Favorites Page Loaded Successfully");

//Newest First Test Case #Start
		//Select For selecting String or Index or Value from Drop Down List
		Select SBDdown= new Select(myFavoritesPage.getOption_SortByDropDown());
		SBDdown.selectByVisibleText(datatable.get("Sort By"));
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Newest First Sort Option Success");
		
//myFavoritesPage.getOption_ItemViewDropDown().sendKeys("12");
		Select VDdown= new Select(myFavoritesPage.getOption_ItemViewDropDown());
		VDdown.selectByIndex(0);
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : 12 Items are Displaying For Newest First");
		Thread.sleep(2000);
//CODE FOR NEXT PAGE BUTTON
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : 12 Items :: Next Button click event");
		Thread.sleep(2000);
		
		VDdown.selectByIndex(1);	
		ExtentTestManager.getTest().log(Status.PASS, "Step 7  : 24 Items are Displaying For Newest First");
		Thread.sleep(2000);
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 8 : 24 Items :: Next Button click event");		

		VDdown.selectByIndex(2);	
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 9  : 48 Items are Displaying For Newest First");
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 10 : 48 Items :: Next Button click event");
//Newest First Test Case #End
	}

//For Sort By -> Popularity Option
//Fetching TestCase from Excel Sheet
		@DDDataProvider(datafile = "testdata/MyFavorites.xlsx", sheetName = "Favorites",  testcaseID = "TC10", runmode = "Yes")
		@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
		public void TC_10Popularity(Hashtable<String, String> datatable) throws Exception{
			
//Calling LoginPage 
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 10 : Verify Popularity Functionality");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid Credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(2000);	
		
		Thread.sleep(2000);
		//RC's Sign In Drop Down List
		loginPage.getUserDrodown().click();
		Thread.sleep(1000);
		
//Calling MyFavoritesPage
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Login Dropdown Clicked");
		MyFavoritesPage myFavoritesPage = new MyFavoritesPage(driver);
		myFavoritesPage.getFavoritesPage().click();
		Thread.sleep(2000);
		
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : My Favorites Page Loaded Successfully");

//Popularity Test Case #Start
		//Select For selecting String or Index or Value from Drop Down List
		Select SBDdown= new Select(myFavoritesPage.getOption_SortByDropDown());
		SBDdown.selectByVisibleText(datatable.get("Sort By"));
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Popularity Sort Option Success");
		
//myFavoritesPage.getOption_ItemViewDropDown().sendKeys("12");
		Select VDdown= new Select(myFavoritesPage.getOption_ItemViewDropDown());
		VDdown.selectByIndex(0);
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : 12 Items are Displaying For Popularity");
		Thread.sleep(2000);
//CODE FOR NEXT PAGE BUTTON
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : 12 Items :: Next Button click event");
		Thread.sleep(2000);
		
		VDdown.selectByIndex(1);	
		ExtentTestManager.getTest().log(Status.PASS, "Step 7  : 24 Items are Displaying For Popularity");
		Thread.sleep(2000);
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 8 : 24 Items :: Next Button click event");		

		VDdown.selectByIndex(2);	
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 9  : 48 Items are Displaying For Popularity");
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 10 : 48 Items :: Next Button click event");
//Popularity Test Case #End	
	}		

//For Sort By -> Case Quantity Option
//Fetching TestCase from Excel Sheet
		@DDDataProvider(datafile = "testdata/MyFavorites.xlsx", sheetName = "Favorites",  testcaseID = "TC11", runmode = "Yes")
		@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
		public void TC_11CaseQuantity(Hashtable<String, String> datatable) throws Exception{
			
//Calling LoginPage 
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 11 : Verify Case Quantity Functionality");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid Credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(2000);	
		
		Thread.sleep(2000);
		loginPage.getUserDrodown().click();
		Thread.sleep(1000);
		
//Calling MyFavoritesPage
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Login Dropdown Clicked");
		MyFavoritesPage myFavoritesPage = new MyFavoritesPage(driver);
		myFavoritesPage.getFavoritesPage().click();
		Thread.sleep(2000);
		
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : My Favorites Page Loaded Successfully");

//Case Quantity Test Case #Start
		//Select For selecting String or Index or Value from Drop Down List
		Select SBDdown= new Select(myFavoritesPage.getOption_SortByDropDown());
		SBDdown.selectByVisibleText(datatable.get("Sort By"));
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Case Quantity Sort Option Success");
		
//myFavoritesPage.getOption_ItemViewDropDown().sendKeys("12");
		Select VDdown= new Select(myFavoritesPage.getOption_ItemViewDropDown());
		VDdown.selectByIndex(0);
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : 12 Items are Displaying For Case Quantity");
		Thread.sleep(2000);
//CODE FOR NEXT PAGE BUTTON
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : 12 Items :: Next Button click event");
		Thread.sleep(2000);
		
		VDdown.selectByIndex(1);	
		ExtentTestManager.getTest().log(Status.PASS, "Step 7  : 24 Items are Displaying For Case Quantity");
		Thread.sleep(2000);
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 8 : 24 Items :: Next Button click event");		

		VDdown.selectByIndex(2);	
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 9  : 48 Items are Displaying For Case Quantity");
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 10 : 48 Items :: Next Button click event");
//Case Quantity Test Case #End	
  }		

//For Sort By -> Price Per Unit (Low to High) Option
//Fetching TestCase from Excel Sheet
		@DDDataProvider(datafile = "testdata/MyFavorites.xlsx", sheetName = "Favorites",  testcaseID = "TC12", runmode = "Yes")
		@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
		public void TC_12PricePerUnitLH(Hashtable<String, String> datatable) throws Exception{
			
//Calling LoginPage 
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 12 : Verify Price Per Unit (Low to High) Functionality");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid Credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(2000);	
		
		Thread.sleep(2000);
		loginPage.getUserDrodown().click();
		Thread.sleep(1000);
		
//Calling MyFavoritesPage
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Login Dropdown Clicked");
		MyFavoritesPage myFavoritesPage = new MyFavoritesPage(driver);
		myFavoritesPage.getFavoritesPage().click();
		Thread.sleep(2000);
		
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : My Favorites Page Loaded Successfully");

//Price Per Unit (Low to High) Test Case #Start
		//Select For selecting String or Index or Value from Drop Down List
		Select SBDdown= new Select(myFavoritesPage.getOption_SortByDropDown());
		SBDdown.selectByVisibleText(datatable.get("Sort By"));
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Price Per Unit (Low to High) Sort Option Success");
		
//myFavoritesPage.getOption_ItemViewDropDown().sendKeys("12");
		Select VDdown= new Select(myFavoritesPage.getOption_ItemViewDropDown());
		VDdown.selectByIndex(0);
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : 12 Items are Displaying For Price Per Unit (Low to High)");
		Thread.sleep(2000);
//CODE FOR NEXT PAGE BUTTON
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : 12 Items :: Next Button click event");
		Thread.sleep(2000);
		
		VDdown.selectByIndex(1);	
		ExtentTestManager.getTest().log(Status.PASS, "Step 7  : 24 Items are Displaying For Price Per Unit (Low to High)");
		Thread.sleep(2000);
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 8 : 24 Items :: Next Button click event");		

		VDdown.selectByIndex(2);	
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 9  : 48 Items are Displaying For Price Per Unit (Low to High)");
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 10 : 48 Items :: Next Button click event");
//Price Per Unit (Low to High) Test Case #End	
}		
//For Sort By -> Price Per Unit (High to Low) Option
//Fetching TestCase from Excel Sheet
		@DDDataProvider(datafile = "testdata/MyFavorites.xlsx", sheetName = "Favorites",  testcaseID = "TC13", runmode = "Yes")
		@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
		public void TC_13PricePerUnitHL(Hashtable<String, String> datatable) throws Exception {
			
//Calling LoginPage 
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 13 : Verify Price Per Unit (High to Low) Functionality");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid Credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(2000);	
		
		Thread.sleep(2000);
		loginPage.getUserDrodown().click();
		Thread.sleep(1000);
		
//Calling MyFavoritesPage
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Login Dropdown Clicked");
		MyFavoritesPage myFavoritesPage = new MyFavoritesPage(driver);
		myFavoritesPage.getFavoritesPage().click();
		Thread.sleep(2000);
		
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : My Favorites Page Loaded Successfully");

//Price Per Unit (High to Low) Test Case #Start
		//Select For selecting String or Index or Value from Drop Down List
		Select SBDdown= new Select(myFavoritesPage.getOption_SortByDropDown());
		SBDdown.selectByVisibleText(datatable.get("Sort By"));
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Price Per Unit (High to Low) Sort Option Success");
		
//myFavoritesPage.getOption_ItemViewDropDown().sendKeys("12");
		Select VDdown= new Select(myFavoritesPage.getOption_ItemViewDropDown());
		VDdown.selectByIndex(0);
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : 12 Items are Displaying For Price Per Unit (High to Low)");
		Thread.sleep(2000);
//CODE FOR NEXT PAGE BUTTON
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : 12 Items :: Next Button click event");
		Thread.sleep(2000);
		
		VDdown.selectByIndex(1);	
		ExtentTestManager.getTest().log(Status.PASS, "Step 7  : 24 Items are Displaying For Price Per Unit (High to Low)");
		Thread.sleep(2000);
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 8 : 24 Items :: Next Button click event");		

		VDdown.selectByIndex(2);	
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 9  : 48 Items are Displaying For Price Per Unit (High to Low)");
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 10 : 48 Items :: Next Button click event");
//Price Per Unit (High to Low) Test Case #End	
}

//For Sort By -> Alphabetically By Name Option
//Fetching TestCase from Excel Sheet
		@DDDataProvider(datafile = "testdata/MyFavorites.xlsx", sheetName = "Favorites",  testcaseID = "TC14", runmode = "Yes")
		@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
		public void TC_14AlphabeticallyByName(Hashtable<String, String> datatable) throws Exception {
			
//Calling LoginPage 
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 14 : Verify Alphabetically By Name Functionality");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid Credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(2000);	
		
		Thread.sleep(2000);
		loginPage.getUserDrodown().click();
		Thread.sleep(1000);
		
//Calling MyFavoritesPage
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Login Dropdown Clicked");
		MyFavoritesPage myFavoritesPage = new MyFavoritesPage(driver);
		myFavoritesPage.getFavoritesPage().click();
		Thread.sleep(2000);
		
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : My Favorites Page Loaded Successfully");

//AlphabeticallyByName Test Case #Start
		Select VDdown= new Select(myFavoritesPage.getOption_ItemViewDropDown());
		VDdown.selectByIndex(0);
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Alphabetically By Name Sort Option Success");
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : 12 Items are Displaying For Alphabetically By Name");
		Thread.sleep(2000);
//CODE FOR NEXT PAGE BUTTON
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : 12 Items :: Next Button click event");
		Thread.sleep(2000);
		
		VDdown.selectByIndex(1);	
		ExtentTestManager.getTest().log(Status.PASS, "Step 7  : 24 Items are Displaying For Alphabetically By Name");
		Thread.sleep(2000);
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 8 : 24 Items :: Next Button click event");		

		VDdown.selectByIndex(2);	
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 9  : 48 Items are Displaying For Alphabetically By Name");
		myFavoritesPage.clickNextPageButton();
		ExtentTestManager.getTest().log(Status.PASS, "Step 10 : 48 Items :: Next Button click event");
//Alphabetically By Name Test Case #End	
	}		
		
//For Product Added to the Favorites Page - Click FavoriteSymbol
//Fetching TestCase from Excel Sheet
	    @DDDataProvider(datafile = "testdata/MyFavorites.xlsx", sheetName = "Favorites",  testcaseID = "TC15", runmode = "Yes")
		@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
		public void TC_15AddtoFavorites(Hashtable<String, String> datatable) throws Exception {
		
					
//Calling LoginPage 
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Verify Search Functionality");
		LoginPage loginPage = new LoginPage(driver);
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid Credentials");
		Thread.sleep(2000);
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(2000);	
		
//Calling Search Page
		Thread.sleep(2000);
		SearchPage searchpage = new SearchPage(driver);
		searchpage.getSearchBar().sendKeys("Book");//Searching the Product - BOOK
		Thread.sleep(1000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Enter Search Data in the Search Bar");
		Thread.sleep(1000);
		
		searchpage.getsearchBtn().click();//Click the Search Button Icon
		Thread.sleep(1000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Clicked on the Search Button");
		Thread.sleep(1500);

//Retrieve First Product Display Link
		MyFavoritesPage myFavoritesPage = new MyFavoritesPage(driver);
		Thread.sleep(2000);
		myFavoritesPage.getFirstProductDisplay().click();//Retrieve First Product Display
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : First Product Selected & Displayed");
		
//Click Favorite Symbol
		Thread.sleep(2000);
		myFavoritesPage.getFavHeartSymbol().click();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : Product Should Add OR Remove - Favorites Module");
		
// Saving the favorite SKU Id 
		//SKUCode stores Selected Product's SKU
		SKUCode = myFavoritesPage.getSelectedSKU().getAttribute("data-sku"); //data-sku denotes SKU's attribute
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 6  : Favorite Product Clicked  ::  SKU  :: " + SKUCode);
		Thread.sleep(2000);
		
//Traversing to Favorites page
		Thread.sleep(2000);
		loginPage.getUserDrodown().click(); //RC's Sign In Drop Down List
		Thread.sleep(2000);
		myFavoritesPage.getFavoritesPage().click(); //Favorites Page Opened
		Thread.sleep(2000);
		
// Searching for the SKU which was chosen for favorite
		searchpage.getSearchBar().sendKeys(SKUCode);
		Thread.sleep(2000);
		searchpage.getsearchBtn().click();
		Thread.sleep(2000);
		
//Click on the product id link retrieved from search page
		myFavoritesPage.getRetrievedProduct().click();
		Thread.sleep(2000);
					
		//ExtentTestManager.getTest().log(Status.PASS, "Step 7 : PRODUCT Attribute ::   " + myFavoritesPage.getFavHeartSymbol().getAttribute("data-original-title"));
				
//Check if favorite button is enabled
		//data-original-title denotes Product is already added to Favorites Page or Not
		if (myFavoritesPage.getFavHeartSymbol().getAttribute("data-original-title").equalsIgnoreCase(" REMOVE FROM FAVORITES")) 
			ExtentTestManager.getTest().log(Status.PASS, "Step 7.1  : Product Added to the Favorite Page ");			
		else
			ExtentTestManager.getTest().log(Status.PASS, "Step 7.2 : Product Removed from Favorite Page "); 
		
 } 
   
//For Product Added to the Favorites Page - Check Product is Displayed under Favorites Page
//Fetching TestCase from Excel Sheet                                  
		@DDDataProvider(datafile = "testdata/MyFavorites.xlsx", sheetName = "Favorites",  testcaseID = "TC16", runmode = "Yes")
		@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
		public void TC_16ValidateProdFavPage(Hashtable<String, String> datatable) throws Exception 
	{
		boolean bIsProdFound  = false;
//Calling LoginPage 
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Verify Favorite Symbol Functionality");
		
		LoginPage loginPage = new LoginPage(driver);
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid Credentials");
		Thread.sleep(2000);
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(2000);	
		
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Returning Customers Sign In Page Opened");
		loginPage.getUserDrodown().click();
		Thread.sleep(2000);
		
//Calling FavoritesPage
		
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Favourites Page Opened ");
		MyFavoritesPage myFavoritesPage = new MyFavoritesPage(driver);
		myFavoritesPage.getFavoritesPage().click();
		Thread.sleep(2000);
		
//Displaying Best Match Option
		
		myFavoritesPage.getOption_ItemViewDropDown().sendKeys("12");
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : 12 Items are Displaying For Best Match");

//Display SkuCode
		Thread.sleep(1000);
		ExtentTestManager.getTest().log(Status.PASS,  "Step 5 : SKU #" + SKUCode);		
		
//Retrieve the SKU # and it Stored in List
		
//Searching SKUCode in all Pages
		bIsProdFound = myFavoritesPage.clickNextPageButtonForSKU(SKUCode);
		
		if (bIsProdFound == true)
			ExtentTestManager.getTest().log(Status.PASS, "Step 6.1 : Product with :" + SKUCode + " Found in Favourites Page");
		else
			ExtentTestManager.getTest().log(Status.PASS, "Step 6.2 : Product with :" + SKUCode + " NOT Found in Favourites Page");
			
		Thread.sleep(2000);
		loginPage.getUserDrodown().click();
		Thread.sleep(2000);
		loginPage.getLogoutBtn().click();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step  7 : Clicked on LogOut");
 }
}
