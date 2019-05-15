package stepdefinations;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import cucumber.api.Scenario;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import DataProviders.ConfigFileReader;
import DataProviders.excelreader;
import Pageobjects.CheckoutPage;
import Pageobjects.ConfirmationPage;
import Pageobjects.HomePage;
import Pageobjects.Loginpage;
import Pageobjects.SearchProduct;
import Pageobjects.ShoppingCartPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.pageObjectManager;
import managers.webDriverManager;


public class stepdef {
	 HomePage home ;
	  SearchProduct search ;
	  Loginpage login;
	  ShoppingCartPage  shopcart;
	  ConfirmationPage confirmorder;
	  pageObjectManager pageObjectManager1;
	  WebDriver driver;
	 CheckoutPage chkoutpage;
	  WebDriverWait wait;
	  webDriverManager webdriverManager1;
	  ConfigFileReader configreader;
	  excelreader excel;
	  
	  
	
	  
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {

		 webdriverManager1 = new webDriverManager();
		 driver = webdriverManager1.getDriver();

		 configreader= new ConfigFileReader();
		 
		wait=new WebDriverWait(driver, 50);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 
		 driver.get(configreader.getApplicationUrl());
		 
		 
	}

	@When("^user navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  pageObjectManager1 = new pageObjectManager(driver);
		 // driver.findElement(By.linkText("Sign in")).click();
 home = pageObjectManager1.getHomePage();
		 home.click_signin();
		
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // driver.findElement(By.id("email")).sendKeys("saimatab2016@gmail.com"); 
	   // driver.findElement(By.id("passwd")).sendKeys("goodluck");
	   // driver.findElement(By.id("SubmitLogin")).click();
	    
	    
		   login = pageObjectManager1.getloginpage();
		 login.enter_email("saimatab2016@gmail.com");
		 login.enter_password("goodluck");
		 login.click_login();
	}
	
	@Then("^message displayed login successfully$")
	public void message_displayed_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Login Successfully");
		 //  driver.quit();
	   
	}
	
	//**********************
	@Given("^user  is already signed in$")
	public void user_is_already_signed_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}


	@When("^user logout from the application$")
	public void user_logout_from_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
// login = tc.getPageObjectManager().getloginpage();
		  // login = pageObjectManager1.getloginpage();

		  login.click_logout(); 
	      
	  
	}

	@Then("^message displayed logout successfully$")
	public void message_displayed_logout_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Logout Successfully");
		 //  driver.quit();
	   
	}


	
	 
	
	

	
}
