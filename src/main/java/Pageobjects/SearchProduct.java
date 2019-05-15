package Pageobjects;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
public class SearchProduct {
	public SearchProduct(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	
	 @FindBy(how = How.ID, using = "search_query_top") 
	 private WebElement txtbx_search;
	 
	 
	 
	 @FindBy(how = How.NAME, using = "submit_search") 
	 private WebElement btn_search;
	 
	 
	 
	 
	 
	 public void  enter_product_to_search(String prodname) {
		 txtbx_search.sendKeys(prodname);
		 }
	
	 
	 public void  click_search() {
		 btn_search.click();
		 }
	 
}
