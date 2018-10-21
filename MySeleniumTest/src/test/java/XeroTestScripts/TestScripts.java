package XeroTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScripts {

	//@Test
	public static void Navigate_To_XERO() {

		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://login.xero.com/");
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);*/

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.clear();
		username.sendKeys("sumankumari.xiss@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("siya@1234");
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		submitButton.click();
		
		System.out.println("Entered homepage");

		driver.quit();

	}

	// @Test
	public static void Incorrect_Password() {

		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://login.xero.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.clear();
		username.sendKeys("sumankumari.xiss@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("siya@123");
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		submitButton.click();
		
		System.out.println("Error message displayed");

		driver.quit();

	}

	// @Test
	public static void Incorrect_Email() {

		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://login.xero.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.clear();
		username.sendKeys("sumankumari@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("siya@1234");
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		submitButton.click();

		System.out.println("Incorrect email message displayed");

		driver.quit();

	}

	// @Test
	public static void Forgot_Password() {

		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://login.xero.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement Forgot_Password = driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
		Forgot_Password.click();

		WebElement username = driver.findElement(By.xpath("//input[@id='UserName']"));
		username.clear();
		username.sendKeys("sumankumari.xiss@gmail.com");

		WebElement sendLinkBtn = driver.findElement(By.xpath("//a[@class='x-btn blue']"));
		sendLinkBtn.click();

		System.out.println("Password reset message displayed");

		driver.quit();

	}

	// @Test
	public static void FreeTrail_Inbox_Page() {

		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.xero.com/us/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement FreeTrail = driver.findElement(By.xpath("//a[@class=\"btn btn-primary global-ceiling-bar-btn\"]"));
		FreeTrail.click();

		WebElement FirstName = driver.findElement(By.xpath("//input[@name=\"FirstName\"]"));
		FirstName.clear();
		FirstName.sendKeys("Suman");

		WebElement LastName = driver.findElement(By.xpath("//input[@name=\"LastName\"]"));
		LastName.clear();
		LastName.sendKeys("Kumari");

		WebElement Email = driver.findElement(By.xpath("//input[@name=\"EmailAddress\"]"));
		Email.clear();
		Email.sendKeys("sumankumari.xiss@gmail.com");

		WebElement phoneNo = driver.findElement(By.xpath("//input[@name=\"PhoneNumber\"]"));
		phoneNo.clear();
		phoneNo.sendKeys("9165950805");

		Select country_dropdown = new Select(driver.findElement(By.xpath("//select[@name='LocationCode']")));
		country_dropdown.selectByVisibleText("United States");

		WebElement chkbox = driver.findElement(By.xpath("//input[@value='true']"));
		chkbox.click();

		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();

		System.out.println("Inbox page is displayed");

		driver.quit();

	}

	// @Test
	public static void FreeTrial_PolicyCheckBox() {

		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.xero.com/us/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement FreeTrail = driver.findElement(By.xpath("//a[@class=\"btn btn-primary global-ceiling-bar-btn\"]"));
		FreeTrail.click();

		WebElement submitButton = driver.findElement(By.xpath("//span[@class=\"g-recaptcha-submit\"]"));
		submitButton.click();

		System.out.println("Error message displayed");

		WebElement Email = driver.findElement(By.xpath("//input[@name=\"EmailAddress\"]"));
		Email.clear();
		Email.sendKeys("suman.com");

		System.out.println("invalid email address displayed");

		WebElement submitButton1 = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		submitButton1.click();

		System.out.println("Terms and condition checkbox highlighted");

		driver.quit();

	}

	// @Test
	public static void FreeTrial_Privacy_Policy() {

		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.xero.com/us/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement FreeTrail = driver.findElement(By.xpath("//a[@class=\"btn btn-primary global-ceiling-bar-btn\"]"));
		FreeTrail.click();

		WebElement termsOfUse_link = driver.findElement(By.xpath("//a[contains(text(),'terms of use')]"));
		termsOfUse_link.click();
		System.out.println("Terms New webpage open");

		WebElement privacy_link = driver.findElement(By.xpath("//a[contains(text(),'privacy notice')]"));
		privacy_link.click();
		System.out.println("Privacy New webpage open");

		driver.quit();

	}

	//@Test
	public static void FreeTrial_OfferDetails() {

		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.xero.com/us/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement FreeTrail = driver.findElement(By.xpath("//a[@class=\"btn btn-primary global-ceiling-bar-btn\"]"));
		FreeTrail.click();
		
		WebElement offerDetails_link = driver.findElement(By.xpath("//a[contains(text(),'offer details')]"));
		offerDetails_link.click();
		System.out.println("Offer New webpage open");
		
		driver.quit();

	}
	
	//@Test
	public static void FreeTrial_Accountant() {
		
		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.xero.com/us/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement FreeTrail = driver.findElement(By.xpath("//a[@class=\"btn btn-primary global-ceiling-bar-btn\"]"));
		FreeTrail.click();
		
		WebElement accountant_link = driver.findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"));
		accountant_link.click();
		System.out.println("Lets get started webpage displayed");
		
		driver.quit();
		
	}
	
	//@Test
	public static void logout_functionality() {
		
		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://login.xero.com/");
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
*/
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.clear();
		username.sendKeys("sumankumari.xiss@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("siya@1234");
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		submitButton.click();
		WebElement dropdown = driver.findElement(By.xpath("//a[@class='username']"));
		dropdown.click();
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		
		driver.quit();
		
	}

}
