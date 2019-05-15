package managers;


	import org.openqa.selenium.WebDriver;
	 
	import Pageobjects.CheckoutPage;
	 
	import Pageobjects.ConfirmationPage;
	import Pageobjects.HomePage;
	import Pageobjects.Loginpage;
	import Pageobjects.SearchProduct;
	import Pageobjects.ShoppingCartPage;
	
	public class pageObjectManager {
	 
	 private WebDriver driver;
	 
	 
	 private	 HomePage homepage ;
	 private  SearchProduct searchpage ;
	 private  Loginpage loginpage;
	 private  ShoppingCartPage  shopcartpage;
	 private  ConfirmationPage confirmorderpage;
	
	 private CheckoutPage chkoutpage;
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public pageObjectManager(WebDriver driver) {
	 
	 this.driver = driver;
	 
	 }
	 
	 
	 
	 public HomePage getHomePage(){
	
	 
	 return (homepage == null) ? homepage = new HomePage(driver) : homepage;
	 
	 }
	 
	 
	 
	 public SearchProduct getsearchproductPage() {
	 
	 return (searchpage == null) ? searchpage = new SearchProduct(driver) : searchpage;
	 
	 }
	 
	 
	 
	 public Loginpage getloginpage() {
		 
	 return (loginpage == null) ? loginpage = new Loginpage(driver) : loginpage;
	 
	 }
	 
	 
	
	 
	 public ShoppingCartPage getshopcartpage() {
		 
	 return (shopcartpage == null) ? shopcartpage = new ShoppingCartPage(driver) : shopcartpage;
	 
	 }
	
	
	 
	 public ConfirmationPage getconfirmpage() {
		 
	 return (confirmorderpage == null) ? confirmorderpage = new ConfirmationPage(driver) : confirmorderpage;
	 
	 }
	
	
	
	
	 public CheckoutPage getcheckoutpage() {
		 
	 return (chkoutpage == null) ? chkoutpage = new CheckoutPage(driver) : chkoutpage;
	 
	 }
	
	
	
	
	

}
