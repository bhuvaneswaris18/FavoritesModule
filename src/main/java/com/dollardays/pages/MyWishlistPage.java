package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishlistPage {

// Creating Driver for WebBrowser
	WebDriver driver; 
		
//Assigning Local Driver to WebDriver
	public MyWishlistPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	}

	
//For WishList Display Without Sign In
//For Wish list Drop Down List
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[2]/a/i")
	private WebElement WishlistDropDown;
	
	public WebElement getWishlistDropDown()
	{ return WishlistDropDown; }
	
//For Learn More Link Under Wish list
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[2]/ul/li[2]/a")
	private WebElement LearnMore;
	
	public WebElement getLearnMore()
	{ return LearnMore; }
	
//For Create a Wish list Under Wish list 
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[2]/ul/li[3]/a")
	private WebElement CreateWishListLink;
	
	public WebElement getCreateWishListLink()
	{ return CreateWishListLink; }

//For Donate Today Under Wish List
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[2]/ul/li[4]/a")
	private WebElement DonateToday;
	
	public WebElement getDonateToday()
	{ return DonateToday; }
	
	
//For Organization or WishList Name Text Box - Learn More Page
	@FindBy(xpath = "//*[@class = form-control txtwishlistname]")
	private WebElement OrgWishBar;
	
	public WebElement getOrgWishBar()
	{ return OrgWishBar; }
	
//For City,State,zipcode Text Box - - Learn More Page
	@FindBy(xpath = "//*[@class = form-control txtcitystate]")
	private WebElement CityStateZipBar;
	
	public WebElement getCityStateZipBar()
	{ return CityStateZipBar; }
	
//For Search Button - Learn More Page
	@FindBy(xpath = "//*[@class = btn btnsearch]")
	private WebElement SearchButton;
	
	public WebElement getSearchButton()
	{ return SearchButton; }
	
//For Select the Care Packages Link Under WishList Results - Learn More Page
	@FindBy(xpath = "//*[@id=\"wishlistsearch\"]/div/div/div[2]/div[1]/div/div/a[2]")
	private WebElement CarePackages;
	
	public WebElement getCarePackages()
	{ return CarePackages; }
	
//For Donate Now Button Under WishList Results - Learn More Page
	@FindBy(xpath = "//*[@id=\"wishlistsearch\"]/div/div/div[2]/div[1]/div/div/a[2]")
	private WebElement DonateNowButton;
	
	public WebElement getDonateNowButton()
	{ return DonateNowButton; }
	
//Sort By DropDown List - Low to High - WishList Category
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_wishlistcontainer\"]/div[2]/div/div/div/select/option[2]")
	private WebElement SortByLowtoHigh;
	
	public WebElement getSortByLowtoHigh()
	{ return SortByLowtoHigh; }
	
//Sort By DropDown List - High to Low - WishList Category
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_wishlistcontainer\"]/div[2]/div/div/div/select/option[3]")
	private WebElement SortByHightoLow;
	
	public WebElement getSortByHightoLow()
	{ return SortByHightoLow; }

	
//For Enter the Number of Cases in the Text Box
	@FindBy(xpath = "//*[@class = form-control wlquantity]")
	private WebElement NumberofCases;
	
	public WebElement getNumberofCases()
	{ return NumberofCases; }
	
//For Donate Button from the First Product
	@FindBy(xpath = "//*[@class = btn btn-donate]")
	private WebElement DonateButton;
	
	public WebElement getDonateButton()
	{ return DonateButton; }
	
//For Select and Display the First Product from SortBy DropDown  Low to High List 
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_divProductInfo\"]/div[1]/div[1]/div/div[3]/div/ul/li[1]")
	private WebElement FirstProductDisplay;
	
	public WebElement getFirstProductDisplay()
	{ return FirstProductDisplay; }

//For Login to Buy Button from the Product Page
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_divProductInfo\"]/div[1]/div[1]/div/div[3]/div/div[3]/div[1]/div/div/a")
	private WebElement LogintoBuyButton;
	
	public WebElement getLogintoBuyButton()
	{ return LogintoBuyButton; }
	
	
//For Create a Wish List Button - In Learn More Page - It Will Redirect to Sign In Page
	@FindBy(xpath = "//*[@id=\"carousel-home\"]/div/div[1]/a")
	private WebElement CreateWishListButton;
	
	public WebElement getCreateWishListButton()
	{ return CreateWishListButton; }
	
//For MyWishlist Page from Returning Customer's Sign In Page
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/ul/li[4]/a")
	private WebElement MyWishlist;
	
	public WebElement getMyWishlist()
	{ return MyWishlist; }
	
//For WishList Cart from Returning Customer's Sign In Page
	@FindBy(xpath = "/html/body/header/div/div/div/div[3]/div/ul/li[2]/ul/li[4]/a")
	private WebElement WishListCart;

	public WebElement getWishListCart()
	{ return WishListCart; }
	
	
//For Click here to manage link from create a wish list button
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[3]/h5/a")
	private WebElement ClickHeretoManage;
	
	public WebElement getClickHeretoManage()
	{ return ClickHeretoManage; }
	
//For WishList URL Link
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[3]/div/section/div/div[2]/h2/a")
	private WebElement WishListURL;
	
	public WebElement getWishListURL()
	{ return WishListURL; }
	
//For My WishList Page
	@FindBy(xpath = "/html/body/header/div/div/div/div[3]/div/ul/li[2]/ul/li[3]/a")
	private WebElement MyWishListPage;
	
	public WebElement getMyWishListPage()
	{ return MyWishListPage; }
	
//For Organization Details Under My WishList Page
	@FindBy(xpath ="/html/body/div[2]/div/section/div/div[3]/div/div[2]/div/div[1]/div[1]/div/h5/a")
	private WebElement OrganizationDetails;
	
	public WebElement getOrganizationDetails()
	{ return OrganizationDetails; }
	
//For Project Event Date Details Under My WishList Page
	@FindBy(xpath = "/html/body/div[2]/div/section/div/div[3]/div/div[2]/div/div[1]/div[2]/div/h5/a")
	private WebElement ProjectEventDate;
	
	public WebElement getProjectEventDate()
	{ return ProjectEventDate; }

//For WishList Products Under My WishList Page
	@FindBy(xpath = "/html/body/div[2]/div/section/div/div[3]/div/div[2]/div/div[2]/div[1]/div/h5/a")
	private WebElement WishListProducts;
	
	public WebElement getWishListProducts()
	{ return WishListProducts; }

//For WishList Orders Under My WishList Page
	@FindBy(xpath = "/html/body/div[2]/div/section/div/div[3]/div/div[2]/div/div[2]/div[2]/div/h5/a")
	private WebElement WishListOrders;
	
	public WebElement getWishListOrders()
	{ return WishListOrders; }
	
//For Organization's Name Under Your Organization Details
	@FindBy(xpath ="//*[@titile = Organization Name]")
	private WebElement OrganizationName;
	
	public WebElement getOrganizationName()
	{ return OrganizationName; }
	
//For Organization's WebSite Under Your Organization Details
	@FindBy(xpath = "//*[@title = Organization Website]")
	private WebElement OrganizationWebsite;
	
	public WebElement getOrganizationWebsite()
	{ return OrganizationWebsite; }
	
//For Contact Name Under Your Organization Details
	@FindBy(xpath = "//*[@title = Contact Name]")
	private WebElement ContactName;
	
	public WebElement getContactName()
	{ return ContactName; }

//For Contact Email Address Under Your Organization Details
	@FindBy(xpath = "//*[@title = Contact Email Address]")
	private WebElement ContactEmailAddress;
	
	public WebElement getContactEmailAddress()
	{ return ContactEmailAddress; }
	
//For Email Receipts Copies to: Under Your Organization Details
	@FindBy(xpath = " //*[@title = Email Receiptcopies to]")
	private WebElement EmailReceiptCopies;
	
	public WebElement getEmailReceiptCopies()
	{ return EmailReceiptCopies; }
	
//For Address Line 1 Under Your Organization Details
	@FindBy(xpath = " //*[@title = Address Line1]")
	private WebElement AddressLine1;
	
	public WebElement getAddressLine1()
	{ return AddressLine1; }
	
//For Address Line 2 Under Your Organization Details
	@FindBy(xpath = "//*[@title = Address Line1]")
	private WebElement AddressLine2;
	
	public WebElement getAddressLine2()
	{ return AddressLine2; }
	
//For City Under Your Organization Details
	@FindBy(xpath = "//*[@title = City]")
	private WebElement City;
	
	public WebElement getCity()
	{ return City; }
	
//For State Under Your Organization Details
	@FindBy(xpath = "//*[@id =ctl00_cphContent_ddlstate]")
	private WebElement State;
	
	public WebElement getState()
	{ return State; }
	
//For Zipcode Under Your Organization Details
	@FindBy(xpath = "//*[@title = Zip Code]")
	private WebElement Zipcode;
	
	public WebElement getZipcode()
	{ return Zipcode; }
	
//For Phone Number Under Your Organization Details
	@FindBy(xpath = "//*[@title = Phone Number]")
	private WebElement PhoneNumber;
	
	public WebElement getPhoneNumber()
	{ return PhoneNumber; }
	
//For Extension Under Your Organization Details
	@FindBy(xpath = "//*[@title = Extension]")
	private WebElement Extension;
	
	public WebElement getExtension()
	{ return Extension; }
	
//For Describe your organization Under Your Organization Details
	@FindBy(xpath = "//*[@title = Describe your organization]")
	private WebElement DesOrganization;
	
	public WebElement getDesOrganization()
	{ return DesOrganization; }

//For Update Information Button Under Your Organization Details
	@FindBy(xpath = "//*[@value = UPDATE INFORMATION]")
	private WebElement UpdateInfo;
	
	public WebElement getUpdateInfo()
	{ return UpdateInfo; }
	
//For My WishList
	@FindBy(xpath = "/html/body/div[2]/div/section/div/div[3]/div/div[1]/div/div/ul/li[7]/a/i")
	private WebElement MyWishList;
	
	public WebElement getMyWishList()
	{ return MyWishList; }
	
//For Project Event Name 
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txtprojectname\"]")
	private WebElement ProjectEventNameTextBox;
	
	public WebElement getProjectEventNameTextBox()
	{ return ProjectEventNameTextBox; }
	
//For Project Event Date
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txteventdate\"]")
	private WebElement ProjEventDate;
	
	public WebElement getProjEventDate()
	{ return ProjEventDate; }
	
//For Describe your project and/or event
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txtMission\"]")
	private WebElement DescribeProjEventTextBox;
	
	public WebElement getDescribeProjEventTextBox()
	{ return DescribeProjEventTextBox; }

//For Thank you message for donors
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txtThankMsg\"]")
	private WebElement ThankYouMsgBox;

	public WebElement getThankYouMsgBox()
	{ return ThankYouMsgBox; }

//For WishList Logo
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txtlogo\"]")
	private WebElement WishListLogo;
	
	public WebElement getWishListLogo()
	{ return WishListLogo; }
	
//For Browse Button
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[3]/div/section/div/div[3]/div/div[2]/div/div/div[7]/div/div/label")
	private WebElement BrowseButton;
	
	public WebElement getBrowseButton()
	{ return BrowseButton; }
	
//For Update Information under Project Event
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_btnOrgUpdate\"]")
	private WebElement UpdateInformation;
	
	public WebElement getUpdateInformation()
	{ return UpdateInformation; }

//For Clear Cart Under WishList Products 
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_btnClearCart\"]")
	private WebElement ClearCart;
	
	public WebElement getClearCart()
	{ return ClearCart; }
	
//For Update Cart Under WishList Products
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_btnUpdateCart\"]")
	private WebElement UpdateCart;
		
	public WebElement getUpdateCart()
	{ return UpdateCart; }
	
//For My Account Link
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[3]/div/section/div/div[3]/div/div[1]/div/div/h5/a")
	private WebElement MyAccountLink;
	
	public WebElement getMyAccountLink()
	{ return MyAccountLink; }

//For Start Date under WishList Order History
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txtStartDate\"]")
	private WebElement StartDate;
	
	public WebElement getStartDate()
	{ return StartDate; }
	
//For End Date under WishList Order History
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txtEndDate\"]")
	private WebElement EndDate;
	
	public WebElement getEndDate()
	{ return EndDate; }
	
//For Submit Button under WishList Order History
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_btnFetchOrders\"]")
	private WebElement SubmitButton;
	
	public WebElement getSubmitButton()
	{ return SubmitButton; }

//For Return To WishList Under WishList Cart
	@FindBy(xpath = "//*[@id=\"ctl00_cphContent_wishlistcontainer\"]/div[2]/div/div[1]/div[1]/div/h3/span/a")
	private WebElement ReturnToWishList;
	
	public WebElement getReturnToWishList()
	{ return ReturnToWishList; }
	
//For Update Button Under WishList Cart
	@FindBy(xpath = "//*[@id=\"cartform\"]/div[1]/div[2]/div[2]/div/span/a")
	private WebElement UpdateButton;
	
	public WebElement getUpdateButton()
	{ return UpdateButton; }

//For Remove Item Icon Under WishList Cart
	@FindBy(xpath = "//*[@id=\"cartform\"]/div[1]/div[2]/div[4]/span/input")
	private WebElement RemoveIcon;
	
	public WebElement getRemoveIcon()
	{ return RemoveIcon; }
	

//For CheckOut Button Under WishList Cart
	@FindBy(xpath = "//*[@id=\"sticky\"]/div[1]/div/div/a")
	private WebElement CheckOutButton;
	
	public WebElement getCheckOutButton()
	{ return CheckOutButton; }

//For Email - donor & Payment Page
	@FindBy(xpath = "//*[@name = ccemail]")
	private WebElement DonorEmail;
	
	public WebElement getDonorEmail()
	{ return DonorEmail; }
	
//For Name - donor & Payment Page
	@FindBy(xpath = "//*[@name = donorname]")
	private WebElement DonorName;
	
	public WebElement getDonorName()
	{ return DonorName; }

//For Name on Card - Credit or debit Card 
	@FindBy(xpath =" //*[@name = ccholder]")
	private WebElement CreditDebitName;
	
	public WebElement getCreditDebitName()
	{ return CreditDebitName; }
	
//For Card Number  - Credit or debit Card
	@FindBy(xpath = "//*[@name = ccnumber]")
	private WebElement CardNumber;
	
	public WebElement getCardNumber()
	{ return CardNumber; }
	
//For Expiration Month - Credit or debit Card
	@FindBy(xpath = "//*[@name = ccexpireMnth]")
	private WebElement ExpMonth;
	
	public WebElement getExpMonth()
	{ return ExpMonth; }
	
//For Expiration Year - Credit or debit Card
	@FindBy(xpath = "//*[@name = ccexpireYear]")
	private WebElement ExpYear;
	
	public WebElement getExpYear()
	{ return ExpYear; }
	
//For Security Code - Credit or debit Card
	@FindBy(xpath = "//*[@name = cccvv2id]")
	private WebElement SecurityCode;
	
	public WebElement getSecurityCode()
	{ return SecurityCode; }

//For Address Line 1 - Credit or debit Card
	@FindBy(xpath = "//*[@name = ccaddress]")
	private WebElement CDAddressLine1;
	
	public WebElement getCDAddressLine1()
	{ return CDAddressLine1; }
	
//For Address Line 2 - Credit or debit Card
	@FindBy(xpath = "//*[@name = ccaddress2]")
	private WebElement CDAddressLine2;
	
	public WebElement getCDAddressLine2()
	{ return CDAddressLine2; }
	
//For City - Credit or debit Card
	@FindBy(xpath = "//*[@name = cccity]")
	private WebElement CDCity;
	
	public WebElement getCDCity()
	{ return CDCity; }

//For State - Credit or debit Card
	@FindBy(xpath = "//*[@name = ccstate]")
	private WebElement CDState;
	
	public WebElement getCDState()
	{ return CDState; }
	
//For Zipcode - Credit or debit Card
	@FindBy(xpath = "//*[@name = cczipcode]")
	private WebElement CDZipcode;
	
	public WebElement getCDZipcode()
	{ return CDZipcode; }
	
//For Country - Credit or debit Card
	@FindBy(xpath = "//*[@name = cccountry]")
	private WebElement CDCountry;
	
	public WebElement getCDCountry()
	{ return CDCountry; }

//For Submit Button - Credit or debit Card
	@FindBy(xpath = "//*[@name = ccsubmitbtn]")
	private WebElement CDSubmitButton;
	
	public WebElement getCDSubmitButton()
	{ return CDSubmitButton; }

//For Return to Cart Link - It will redirect to wishlist
	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div/h5/a")
	private WebElement ReturnCart;
	
	public WebElement getReturnCart()
	{ return ReturnCart; }
	
//For Return to Cart Icon - It will redirect to wishlist cart
	@FindBy(xpath = " /html/body/div[2]/div[1]/div/div/h5/a/i")
	private WebElement ReturnIcon;
	
	public WebElement getReturnIcon()
	{ return ReturnIcon; }

	public void OrganizationName(String string) {
		// TODO Auto-generated method stub
		
	}

}
