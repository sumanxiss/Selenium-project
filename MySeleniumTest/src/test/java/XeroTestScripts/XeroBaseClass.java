package XeroTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class XeroBaseClass {
	
	public static WebDriver driver = null;

	public static WebDriver InitializeDriver(String name) {
		if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (name.equalsIgnoreCase("chrome")) {
			System.out.println("chrome entered");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
		} else if (name.equalsIgnoreCase("ie")) {
			System.out.println("chrome entered");
			System.setProperty("webdriver.ie.driver", "C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;
	}

	public static void closeDriver() {
		driver.close();
	}

}


