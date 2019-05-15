package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 

public class Loginpage {
	 
	 public Loginpage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 
	 @FindBy(how = How.ID, using = "email") 
	 private WebElement txtbx_email;
	 
	 @FindBy(how = How.ID, using = "passwd") 
	 private WebElement txtbx_pwd;
	 
	 @FindBy(how = How.ID, using = "SubmitLogin") 
	 private WebElement btn_login;
	 
	 
	 @FindBy(how = How.LINK_TEXT, using = "Sign out") 
	 private WebElement btn_logout;
	 
	 
	 
	 public void  enter_email(String email) {
		 txtbx_email.sendKeys(email);
		 }
	 public void  enter_password(String password) {
		 txtbx_pwd.sendKeys(password);
		 } 
	 
	 public void  click_login() {
		 btn_login.click();
		 }
	 
	 public void  click_logout() {
		 btn_logout.click();
		 }
	  
	 
	  
}
