package Pageobjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
public class ConfirmationPage {
	public ConfirmationPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(how = How.XPATH, using = "//p[@id='cart_navigation']/button/span") 
	 private WebElement btn_confirmorder;
	 
	
		 
		 public void  confirmorder() {
			 btn_confirmorder.click();
			 }
	
		 
}
