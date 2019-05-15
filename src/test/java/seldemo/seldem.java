package seldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seldem {

	public static void main(String[] args) {
		
		
		
		  WebDriver driver = new FirefoxDriver();
		    //where is geck.exe file ?
		    driver.get("http://automationpractice.com/index.php");
		    
		    driver.findElement(By.linkText("Sign in")).click();
		    http://automationpractice.com/index.php?controller=my-account
		    driver.findElement(By.id("email")).sendKeys("saimatab2016@gmail.com"); 
		    
	        // Find the element that's ID attribute is 'pwd' (Password)
	 
	        // Enter Password on the element found by the above desc.
	 
	        driver.findElement(By.id("passwd")).sendKeys("goodluck");
	 
	        // Now submit the form. WebDriver will find the form for us from the element 
	 
	        driver.findElement(By.id("SubmitLogin")).click();
	 
	        // Print a Log In message to the screen
	 
	        System.out.println("Login Successfully");
	        
	        driver.findElement(By.linkText("Sign out")).click(); 
	        
	        
	        driver.quit();


	}

}
