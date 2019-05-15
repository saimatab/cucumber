package DataProviders;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class ConfigFileReader {
	
	
	
	 private Properties properties;
	 private final String propertyFilePath= "configs//config.properties";
	 
	 
	 public ConfigFileReader(){
	 BufferedReader reader;
	 try {
	 reader = new BufferedReader(new FileReader(propertyFilePath));
	 properties = new Properties();
	 try {
	 properties.load(reader);
	 reader.close();
	 } catch (IOException e) {
	 e.printStackTrace();
	 }
	 } catch (FileNotFoundException e) {
	 e.printStackTrace();
	 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
	 } 
	 }
	 

	 
	 public String getApplicationUrl() {
	 String url = properties.getProperty("URL");
	 if(url != null) return url;
	 else throw new RuntimeException("url not specified in the Configuration.properties file.");
	 }
	 
	 public String getBrowser() {
		 String browserName = properties.getProperty("browser");
		 if(browserName == null || browserName.equals("chrome")) return browserName;
		 else if(browserName.equalsIgnoreCase("firefox")) return browserName;
		 else if(browserName.equals("iexplorer")) return browserName;
		 else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
		 }
	 
	 public long getImplicitlyWait() { 
		 String implicitlyWait = properties.getProperty("implicitlyWait");
		
		 return Long.parseLong(implicitlyWait);
	 }
	 
	 public String getchromeDriverPath(){
		 String driverPath = properties.getProperty("chromedriverpath");
		 if(driverPath!= null) return driverPath;
		 else throw new RuntimeException("Driver Path not specified in the Configuration.properties file for the Key:driverPath"); 
		 }
	 public String getReportConfigPath(){
		 String reportConfigPath = properties.getProperty("reportconfigpath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
		}
}
