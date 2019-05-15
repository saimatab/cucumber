package managers;




import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import DataProviders.ConfigFileReader;

 
public class webDriverManager {
 private WebDriver driver;
 ConfigFileReader configreader;
 String browser1;


 
 public webDriverManager() {
	 configreader= new ConfigFileReader();
browser1=configreader.getBrowser();

 }
 
 public WebDriver getDriver() {
 if(driver == null)
	 driver = createDriver();
 return driver;
 }
 

 

 
 private WebDriver createDriver() {
        switch (browser1) {     
        case "firefox" : 
        	driver = new FirefoxDriver();
      break;
        case "chrome" : 
        	  System.setProperty("webdriver.chrome.driver",configreader.getchromeDriverPath());
        	driver = new ChromeDriver();
      break;
      
      
    
    

        }
 
       driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(configreader.getImplicitlyWait(), TimeUnit.SECONDS);
 return driver;
 } 
 
 public void closeDriver() {

 driver.quit();
 }
}
 