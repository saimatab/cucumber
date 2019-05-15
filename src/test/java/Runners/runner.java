package Runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import DataProviders.ConfigFileReader;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/Features",
		 glue= {"stepdefinations"},
					plugin = {  "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
							"pretty", "json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
							"html:target/cucumber-reports","html:target/cucumber-html-report"}
 )

public class runner {
	 //@AfterClass
	 public static void writeExtentReport() {
		  ConfigFileReader configreader;
		  configreader=new   ConfigFileReader();
	 Reporter.loadXMLConfig(new File(configreader.getReportConfigPath()));
	 
	   Reporter.setSystemInfo("User Name", System.getProperty("saima"));
	     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	     Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	     Reporter.setSystemInfo("Selenium", "3.7.0");
	     Reporter.setSystemInfo("Maven", "3.5.2");
	     Reporter.setSystemInfo("Java Version", "1.8.0_151");
	     Reporter.assignAuthor("saima tabassum");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
}
