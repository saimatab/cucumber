package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 

public class CheckoutPage {
	 
	 public CheckoutPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 
	 
	 @FindBy(how = How.NAME, using = "message") 
	 private WebElement txtbox_address_comments;
	 

	 
	 @FindBy(how = How.NAME, using = "processAddress") 
	 private WebElement btn_processAdress;


	 @FindBy(how = How.ID, using = "cgv") 
	 private WebElement chckbox_TC;
	 
	 @FindBy(how = How.NAME, using = "processCarrier") 
	 private WebElement btn_processcarrier;
	 
	 
	 
	 @FindBy(how = How.LINK_TEXT, using = "Pay by check (order processing will be longer)") 
	 private WebElement lnk_paymentoption;
	 
	 
	 public void  enter_comments_address(String comments) {
		 txtbox_address_comments.sendKeys(comments);
		 }
	 
	 
	 public void  processAddress() {
		 btn_processAdress.click();
		 }
	 
	 
	 
	 
		 
		 public void  check_terms_conditions() {
			 chckbox_TC.click();
			 }
		 
		 public void  processcarrier() {
			 btn_processcarrier.click();
			 }
		 public void  click_paymentoption() {
			 lnk_paymentoption.click();
			 }
		 
	
		 
		 
		 
		 
	
		 
}
