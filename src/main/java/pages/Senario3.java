package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Senario3 extends BaseClass {
	WebDriver driver;
	public Senario3(WebDriver driver) throws IOException {
		    this.driver=driver;
			
			PageFactory.initElements(driver, this);
	}
;
	@FindBy(xpath ="//*[@id='user-name']")
	private WebElement user_name;
	
	@FindBy(xpath ="//*[@id='password']")
	private WebElement pass_word;
	
	@FindBy(xpath ="//*[@id='login-button']")
	private WebElement loginbutton;
	

	//BACKPACKS
	@FindBy(xpath = "//*[@data-test='add-to-cart-sauce-labs-backpack']")
	private WebElement backpack_addtocart;
	
	@FindBy(xpath = "//*[text()='Sauce Labs Backpack']")
	private WebElement backpack_name;
	
	@FindBy(xpath = "//*[text()='29.99']")
	private WebElement backpack_price;
	
	
//BIKE_LIGHT
	@FindBy(xpath = "//*[@data-test='add-to-cart-sauce-labs-bike-light']")
	private WebElement bikelight_addtocart;
	
	@FindBy(xpath = "//*[text()='Sauce Labs Bike Light']")
	private WebElement bikelight_name;
	
	@FindBy(xpath = "//*[text()='9.99']")
	private WebElement bikeLight_price;
	
	
	
//BOLT_T_SHIRT
	@FindBy(xpath = "//*[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement tshirt_addtocart;
	
	@FindBy(xpath = "//*[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement boltShirt_name;
	
	@FindBy(xpath = "//*[@data-test='remove-sauce-labs-bolt-t-shirt']/parent::*[@class='pricebar']/child::div[text()='15.99']")
	private WebElement boltShirt_price;
	
	
	
//JACKET
	@FindBy(xpath = "//*[@data-test='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement jacket_addtocart;
	
	@FindBy(xpath = "//*[text()='Sauce Labs Fleece Jacket']")
	private WebElement jacket_name;
	
	@FindBy(xpath = "//*[text()='49.99']")
	private WebElement jacket_price;
	
//ONESIE	
	@FindBy(xpath = "//*[@data-test='add-to-cart-sauce-labs-onesie']")
	private WebElement onesie_addtocart;
	
	@FindBy(xpath = "//*[text()='Sauce Labs Onesie']")
	private WebElement onesie_name;
	
	@FindBy(xpath = "//*[text()='7.99']")
	private WebElement onesie_price;
	
	
//RED_TSHIRT
	@FindBy(xpath = "//*[@data-test='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement redtshirt_addtocart;
	@FindBy(xpath = "//*[text()='Test.allTheThings() T-Shirt (Red)']")
	private WebDriver red_tshirt_name;
	@FindBy(xpath = "//*[@data-test='remove-test.allthethings()-t-shirt-(red)']/parent::*[@class='pricebar']/child::div[text()='15.99']")
	private WebElement redshirt_price;
	

//CART
	@FindBy(xpath = "//*[@class='shopping_cart_link']")
	private WebElement cart;
	@FindBy(xpath = "//*[@class=\"shopping_cart_badge\"]")
	private WebElement cart_items;
//-----------------------------checkout-------------------------
	@FindBy(xpath = "//*[@id='checkout']")
	private WebElement checkout_button;
	
	@FindBy(xpath = "//*[@id='continue-shopping']")
	private WebElement continueshoping_button;
	
	@FindBy(xpath = "//*[@id='remove-test.allthethings()-t-shirt-(red)']")
	private WebElement remove_allthing_tshirt;
	
	@FindBy(xpath = "//*[@id='remove-sauce-labs-onesie']")
	private WebElement remove_onesie;
	
	@FindBy(xpath = "//*[@id='remove-sauce-labs-bolt-t-shirt']")
	private WebElement remove_boltTshirt;
	
	@FindBy(xpath = "//*[@id='remove-sauce-labs-fleece-jacket']")
	private WebElement remove_jacket;
	
	@FindBy(xpath = "//*[@id='remove-sauce-labs-bike-light']")
	private WebElement remove_bikelight;
	
	@FindBy(xpath = "//*[@id='remove-sauce-labs-backpack']")
	private WebElement remove_backpack;
	//---------------------------------------------------------------------------
	@FindBy(xpath = "//*[@id='finish']")//*[@id='finish']
	private WebElement finish;
	
	@FindBy(xpath = "//*[@id='cancel']")
	private WebElement cancle_order;
//	------------------------------------------------------------------------	

	@FindBy(xpath = "//*[@id='first-name']")
	private WebElement first_name;
	
	@FindBy(xpath = "//*[@id='last-name']") 
	private WebElement last_name;
	
	@FindBy(xpath = "//*[@id='postal-code']")
	private WebElement postalcode;
	
	@FindBy(xpath = "//*[@id='continue']")
	private WebElement continue_button ;
	
	@FindBy(xpath = "//*[@id='cancel']")
	private WebElement cancle_button;
//	-------------------------------------------------
	@FindBy(xpath="//*[@class=\"error-message-container error\"]")
	private WebElement error_mssg;
	@FindBy(xpath = "//*[text()=\"Products\"]")
	private WebElement cart_page_tital;
	
	@FindBy(xpath = "//*[text()=\"Thank you for your order!\"]")
	private WebElement thanku_msg;
	
	@FindBy(xpath = "//*[text()='Your Cart']")
	private WebElement your_cart_page_tital;
	
	@FindBy(xpath = "//*[text()='Checkout: Your Information']")
	private WebElement your_info_page;
	
	@FindBy(xpath = "//*[text()='Checkout: Overview']")
	private WebElement check_out_overview;
	
	
	public void enterCredentials()
	{
		user_name.sendKeys(prop.getProperty("username3"));
		pass_word.sendKeys(prop.getProperty("password1"));
		
loginbutton.click();
		
		if(cart_page_tital.isDisplayed())
		{
			System.out.println("You are on Product Page ");
		
		
		backpack_addtocart.click();
		System.out.println("Backpack added to cart ,Keep shopping");
		onesie_addtocart.click();
		System.out.println("Onesie added to cart , keep shopping");
		
		
		cart.click();
		
		if(your_cart_page_tital.isDisplayed())
		{
			checkout_button.click();
			if( your_info_page.isDisplayed())
	
			{  first_name.sendKeys("savita");
			last_name.sendKeys("chavan");
			postalcode.sendKeys("411033");
			
			
			String fname = first_name.getAttribute("value");
		//	System.out.println(fname);
			
			String lname=last_name.getAttribute("value");
		//	System.out.println(lname);
			String pcode=postalcode.getAttribute("value");
		
		if(fname.equals("savita"))
		{
			if(lname.equals("chavan") )
			{
				if(pcode.equals("411033") )
				{
		        	continue_button.click();
				}
				else
				{
					System.out.println("Invalid Postal code");
				}
				
			}
		else
				System.out.println("Invalid Last name");
		}
		else
		{
			System.out.println("Invalid Fisrt name");
		}
		
	
	//	continue_button.click();
		
		//checkout_button.click();
		if(check_out_overview.isDisplayed())
		{finish.click();
		if(thanku_msg.isDisplayed())
		{
			System.out.println("order placed successfully.... Thank you and keep shopping");
		}
		
			}
	}}}
}}
