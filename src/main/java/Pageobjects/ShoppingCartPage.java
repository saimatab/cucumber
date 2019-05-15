package Pageobjects;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
public class ShoppingCartPage {
	public ShoppingCartPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	@FindBy(how = How.LINK_TEXT, using = "Printed Chiffon Dress") 
	 private WebElement lnk_product;
	 

	 
	 @FindBy(how = How.NAME, using = "Submit") 
	 private WebElement btn_submit;
	 
	
	 
		@FindBy(how = How.LINK_TEXT, using = "Proceed to checkout") 
		 private WebElement lnk_procced;
		 
		 public void  prod_Detail() {
			 lnk_product.click();
			 }
		 
		 public void  submit() {
			 btn_submit.click();
			 }
		 public void  proceed() {
			 lnk_procced.click();
			 }
		 
	 
}
