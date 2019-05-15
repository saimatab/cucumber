package Pageobjects;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
public class HomePage {
	public HomePage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	
	 
	 @FindBy(how = How.LINK_TEXT, using = "Sign in") 
	 private WebElement link_signIn;
	 
	 public void  click_signin( ) {
		 link_signIn.click();
		 }
}
