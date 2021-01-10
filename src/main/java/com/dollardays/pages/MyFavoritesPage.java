package com.dollardays.pages;

import java.util.List;

import javax.swing.text.View;

import java.awt.Desktop.Action;
import java.io.UnsupportedEncodingException;
import java.lang.constant.Constable;
import java.nio.channels.InterruptedByTimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;
import com.dollardays.listners.ExtentTestManager;

//import com.aventstack.extentreports.Status;
///import com.dollardays.listners.ExtentTestManager;

//import com.dollardays.testcases.BaseTest;

public class MyFavoritesPage{
	
// Creating Driver for WebBrowser
	WebDriver driver; 
	
//Assigning Local Driver to WebDriver
	public MyFavoritesPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	}

	
//Common Methods for Favorites Module - Sort By and View Drop Down List
//Sort By DropDown List For Best Match, Newest First, Popularity, Case Quantity, Price Per Unit (Low to High) 
//Price Per Unit (High to Low), Alphabetically By Name
//*[@id="aspnetForm"]/div[5]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div/div/select/option[1]
//We Can Use The above Xpath if We are not going to use SendKeys in TestCase
	
//For Choosing Sort By DropDown
	@FindBy(xpath ="//*[@id=\"aspnetForm\"]/div[5]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div/div/select")
	private WebElement Option_SortByDropDown;
	
//Method for Sort By DropDown
	public WebElement getOption_SortByDropDown()
	{ return Option_SortByDropDown; }

//View Drop Down List - 12, 24, 48 and so on
	
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[5]/div[1]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/select")
	private WebElement Option_ItemViewDropDown;
	
//Method for View Drop Down List - 12, 24, 48 and so on
	public WebElement getOption_ItemViewDropDown()
	{ return Option_ItemViewDropDown; }
	
//For Opening the MyFavorites Page
	//@FindBy(xpath="//a[@href ='/myaccount/favorites.aspx']")
	@FindBy(xpath = "//a[normalize-space(.)='Favorites']")
	//@FindBy(xpath = "//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/ul/li[5]/a")
	//@FindBy(xpath = "//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/ul/li[4]/a")
	private WebElement FavoritesPage;
	
//Method for MyFavorites Page
	public WebElement getFavoritesPage() throws InterruptedException
	{ return FavoritesPage; }

	
//For Next Button
//For Next Page
	@FindBy(xpath = "//a[@title='Next Page']")
	private WebElement nextBtn;

//Method For Next Page
	public WebElement getNextBtn() 
	{ return nextBtn;	}


//For DisabledNext Button CSS Class
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[5]/div[1]/div/div/div/div[2]/div/div/div[2]/div[2]/div/ul/li[5]")
	private WebElement classDisabledNextButton;
	
//Method for Disabled Button
	public WebElement getClassDisabledNextButton()
	{ return classDisabledNextButton; }
	

//For Pagination Unordered List
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[5]/div[1]/div/div/div/div[2]/div/div/div[2]/div[2]/div/ul")
	private WebElement paginationUL;

	public WebElement getPaginationUL() {
		return paginationUL;
	}
	
//boolean function to determine if next button is disabled
	public boolean isNextPageButton()
	{ 
		boolean b1 = true; //Assigning b1 Variable = true
		List<WebElement> li_All = getPaginationUL().findElements(By.tagName("li"));
		
		System.out.println("LI size :: " + li_All.size());
        for(int i = 0; i < li_All.size(); i++){
        	
    		if (li_All.get(i).getAttribute("class").equalsIgnoreCase("DISABLED"))
    		{
    			System.out.println("Inside IF LI class ::" + i + ":: " + li_All.get(i).getAttribute("class"));
    			b1 = false; //to terminate while loop 
    		}
        }       
        return b1;
	}
	
	// method to fire next button [pagination]
	public void clickNextPageButton() throws InterruptedException 
	{
		while (isNextPageButton()) // next button will be clicked till the last page is identified
		{
			getNextBtn().click();
			Thread.sleep(1000);
		}
	}
	

//For Opening the First Product, which is Displaying in the Screen as per Search Box
		
	@FindBy(xpath = "//*[@id=\"central-content\"]/div[3]/div[1]/div/div/div[1]")
	private WebElement FirstProductDisplay;
	
	public WebElement getFirstProductDisplay()
	{ return FirstProductDisplay; }
	
	
//For Favorite Symbol
//Click the Favorite Symbol

	@FindBy(xpath = "//*[@id=\"example1\"]/div[2]/span/div/i")
	private WebElement FavHeartSymbol;
	
	public WebElement getFavHeartSymbol()
	{ return FavHeartSymbol; }
	
// For Product Added to the Favorites Page
// Click the Favorite Symbol
	
	@FindBy(xpath ="//[@class ='fa-fa-heart-o']")
	private WebElement ProductAddFavPage;
	
	public WebElement getProductAddFavPage()
	{ return ProductAddFavPage; }
	

// For Product Removed from the Favorites Page
// Click the Favorite Symbol
	
	@FindBy(xpath ="//[@class ='fa-fa-heart']")
	private WebElement ProductRemoveFavPage;
	
	public WebElement getProductRemoveFavPage()
	{ return ProductRemoveFavPage; }

	
//For SKU Code
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_divProductInfo\"]/div/div/div[1]/div[3]/div/ul/li[1]")
	private WebElement SelectedSKU;
	
	public WebElement getSelectedSKU()
	{ return SelectedSKU; }

//Click on the product id link retrieved from search page
	@FindBy(xpath = "//*[@id=\"central-content\"]/div[3]/div[1]/div/div/div/div/div[3]/div[1]/a")
	private WebElement RetrievedProduct;
	
	public WebElement getRetrievedProduct()
	{ return RetrievedProduct; }

//Find All Rows in All Pages
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[5]/div[2]")
	private WebElement AllRows;
	
	public WebElement getAllRows()
	{ return AllRows; }
	
// scroll down the page
	public static void scrollToDown(WebDriver driver) {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollTo(0, 2500)");

	}
	
//Searching SKUCode in all Pages
		
	// method to fire next button [pagination]
	public boolean clickNextPageButtonForSKU(String pSKU) throws InterruptedException 
	{
		boolean b2 = false; //Assigning b2 Variable = false		
		List<WebElement> li_All = driver.findElements(By.xpath("//*[contains(text(),'" +  "SKU #" + pSKU + " ')]"));
		
		System.out.println("SKUCODE :: " + pSKU + " : SIZE : " + li_All.size());
		
		if (li_All.size() > 0)
			b2 = true;
		else 
		{
			while (isNextPageButton()) // next button will be clicked till the last page is identified
			{
				getNextBtn().click();
				Thread.sleep(1000);
				
				li_All = driver.findElements(By.xpath("//*[contains(text(),'" +  "SKU #" + pSKU + " ')]"));
				System.out.println("Inside WHILE LI size :: " + li_All.size());
				
				if (li_All.size() > 0)
				{
					//System.out.println("Inside IF stmt");
					b2 = true;
					break;
				}
			}
		}
		
		//System.out.println("b2::" + b2);
		return b2;
	}

}