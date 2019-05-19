package managers;


import java.util.concurrent.TimeUnit;
import DataProviders.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class webDriverManager {
    private static WebDriver driver;
    private static ConfigFileReader configreader;
    private static String browser1;


    public webDriverManager() {
        configreader = new ConfigFileReader();
        browser1 = configreader.getBrowser();

    }

    public static WebDriver getDriver() {
        if (driver == null)
            driver = createDriver();
        return driver;
    }


    private static WebDriver createDriver() {
        if ("firefox".equals(browser1)) {
            driver = new FirefoxDriver();
        } else if ("chrome".equals(browser1)) {
            System.setProperty("webdriver.chrome.driver", configreader.getchromeDriverPath());
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(configreader.getImplicitlyWait(), TimeUnit.SECONDS);
        return driver;
    }

    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            try {
                driver.quit();
            } catch ( Exception e ) {
                // e.printStackTrace();
            }
        }
    };

    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }
}
 