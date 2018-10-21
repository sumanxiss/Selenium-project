package XeroTestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class AutomationScript extends ReusableMethod {

	@Test

	public static void Navigate_To_XERO() throws Exception {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\DataFiles\\Navigate_To_XERO.properties");
		prop.load(fs);

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\ObjectRepository\\ObjRepo.properties");
		pro.load(fis);

		logger = extent.createTest("Navigate_To_XERO");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		InitializeDriver(prop.getProperty("browser"));
		logger.log(Status.INFO, "Firefox is launched");

		driver.get(prop.getProperty("url"));
		logger.log(Status.INFO, "Xero page is opened");

		WebElement username = driver.findElement(By.xpath(pro.getProperty("xero.login.username")));
		// WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		enterText(username, prop.getProperty("username"), "username");

		WebElement password = driver.findElement(By.xpath(pro.getProperty("xero.login.password")));
		// WebElement password
		// =driver.findElement(getLocator("xpath",pro.getProperty("xero.login.password")));
		// driver.findElement(By.xpath("//input[@id='password']"));
		enterText(password, "password", "password");

		WebElement submitButton = driver.findElement(By.xpath(pro.getProperty("xero.login.submitButton")));
		// WebElement submitButton
		// =driver.findElement(By.xpath("//button[@id='submitButton']"));
		clickobj(submitButton, "submitButton");

		closeDriver();
		logger.log(Status.INFO, "Browser closed");

	}

	@Test
	public static void Incorrect_Password() throws IOException {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\DataFiles\\Incorrect_Password.properties");
		prop.load(fs);

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\ObjectRepository\\ObjRepo.properties");
		pro.load(fis);

		logger = extent.createTest("Incorrect_Password");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		InitializeDriver(prop.getProperty("browser"));
		logger.log(Status.INFO, "Firefox is launched");

		WebElement username = driver.findElement(By.xpath(pro.getProperty("xero.login.xerousername")));
		// WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		enterText(username, "username", "username");

		WebElement password = driver.findElement(By.xpath(pro.getProperty("xero.login.password")));
		// WebElement password =
		// driver.findElement(By.xpath("//input[@id='password']"));
		enterText(password, "password", "password");

		WebElement submitButton = driver.findElement(By.xpath(pro.getProperty("xero.login.submitButton")));
		// WebElement submitButton =
		// driver.findElement(By.xpath("//button[@id='submitButton']"));
		clickobj(submitButton, "submitButton");

		closeDriver();
		logger.log(Status.INFO, "Browser closed");

	}

	@Test
	public static void Incorrect_Email() throws IOException {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\DataFiles\\Incorrect_Email.properties");
		prop.load(fs);

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\ObjectRepository\\ObjRepo.properties");
		pro.load(fis);

		logger = extent.createTest("Incorrect_Email");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		InitializeDriver(prop.getProperty("browser"));
		logger.log(Status.INFO, "Firefox is launched");

		driver.get(prop.getProperty("url"));
		logger.log(Status.INFO, "Xero page is opened");

		WebElement username = driver.findElement(By.xpath(pro.getProperty("xero.login.username")));
		// WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		enterText(username, "username", "username");

		WebElement password = driver.findElement(By.xpath("xero.login.password"));
		// WebElement password =
		// driver.findElement(By.xpath("//input[@id='password']"));
		clickobj(password, "password");

		WebElement submitButton = driver.findElement(By.xpath("xero.login.submitButton"));
		// WebElement submitButton =
		// driver.findElement(By.xpath("//button[@id='submitButton']"));
		clickobj(submitButton, "submitButton");

		closeDriver();
		logger.log(Status.INFO, "Browser closed");

	}

	@Test
	public static void Forgot_Password() throws IOException {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\DataFiles\\Forgot_Password.properties");
		prop.load(fs);

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\ObjectRepository\\ObjRepo.properties");
		pro.load(fis);

		logger = extent.createTest("Forgot_Password");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		InitializeDriver(prop.getProperty("browser"));
		logger.log(Status.INFO, "Firefox is launched");

		driver.get(prop.getProperty("url"));
		logger.log(Status.INFO, "Xero page is opened");

		WebElement Forgot_Password = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.forgotPassword")));
		// WebElement Forgot_Password =
		// driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
		clickobj(Forgot_Password, "forgotPassword");

		WebElement username = driver.findElement(By.xpath(pro.getProperty("xero.login.username")));
		// WebElement username =
		// driver.findElement(By.xpath("//input[@id='UserName']"));
		enterText(username, "username", "username");

		WebElement sendLinkBtn = driver.findElement(By.xpath(pro.getProperty("xero.forgotPassword.sendlink")));
		// WebElement sendLinkBtn = driver.findElement(By.xpath("//a[@class='x-btn
		// blue']"));
		clickobj(sendLinkBtn, "sendLink");

		closeDriver();
		logger.log(Status.INFO, "Browser closed");

	}

	@Test
	public static void FreeTrail_Inbox_Page() throws IOException {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\DataFiles\\FreeTrail_Inbox_Page.properties");
		prop.load(fs);

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\ObjectRepository\\ObjRepo.properties");
		pro.load(fis);

		logger = extent.createTest("FreeTrail_Inbox_Page");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		InitializeDriver(prop.getProperty("browser"));
		logger.log(Status.INFO, "Firefox is launched");

		driver.get(prop.getProperty("url"));
		logger.log(Status.INFO, "Xero page is opened");

		WebElement FreeTrail = driver.findElement(By.xpath(pro.getProperty("xero.freeTrail")));
		// WebElement FreeTrail = driver.findElement(By.xpath("//a[@class=\"btn
		// btn-primary global-ceiling-bar-btn\"]"));
		clickobj(FreeTrail, "freeTrialLink");

		WebElement FirstName = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.firstName")));
		// WebElement FirstName =
		// driver.findElement(By.xpath("//input[@name=\"FirstName\"]"));
		enterText(FirstName, "firstName", "firstName");

		WebElement LastName = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.lastName")));
		// WebElement LastName =
		// driver.findElement(By.xpath("//input[@name=\"LastName\"]"));
		enterText(LastName, "lastName", "lastName");

		WebElement Email = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.email")));
		// WebElement Email =
		// driver.findElement(By.xpath("//input[@name=\"EmailAddress\"]"));
		enterText(Email, "email", "email");

		WebElement phoneNo = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.ph")));
		// WebElement phoneNo =
		// driver.findElement(By.xpath("//input[@name=\"PhoneNumber\"]"));
		enterText(phoneNo, "ph", "phoneNo");

		Select country_dropdown = new Select(
				driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.countryDropdown"))));
		country_dropdown.selectByVisibleText("United States");
		/*
		 * Select country_dropdown = new
		 * Select(driver.findElement(By.xpath("//select[@name='LocationCode']")));
		 * country_dropdown.selectByVisibleText("United States");
		 */

		WebElement chkbox = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.checkbox")));
		// WebElement chkbox = driver.findElement(By.xpath("//input[@value='true']"));
		clickobj(chkbox, "checkbox");

		WebElement submitButton = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.submitButton")));
		// WebElement submitButton =
		// driver.findElement(By.xpath("//button[@type='submit']"));
		clickobj(submitButton, "submitButton");

		closeDriver();
		logger.log(Status.INFO, "Browser closed");

	}

	@Test
	public static void FreeTrial_PolicyCheckBox() throws IOException {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\DataFiles\\FreeTrial_PolicyCheckBox.properties");
		prop.load(fs);

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\ObjectRepository\\ObjRepo.properties");
		pro.load(fis);

		logger = extent.createTest("FreeTrial_PolicyCheckBox");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		InitializeDriver(prop.getProperty("browser"));
		logger.log(Status.INFO, "Firefox is launched");

		driver.get(prop.getProperty("url"));
		logger.log(Status.INFO, "Xero page is opened");

		WebElement FreeTrail = driver.findElement(By.xpath(pro.getProperty("xero.freeTrail")));
		// WebElement FreeTrail = driver.findElement(By.xpath("//a[@class=\"btn
		// btn-primary global-ceiling-bar-btn\"]"));
		clickobj(FreeTrail, "freeTrail");

		WebElement submitButton = driver.findElement(By.xpath(pro.getProperty("xero.freeTrail.submitButton")));
		// WebElement submitButton =driver.findElement(By.xpath("//span[@class=\"g-recaptcha-submit\"]"));
		clickobj(submitButton, "submitButton");

		WebElement Email = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.email")));
		// WebElement Email =driver.findElement(By.xpath("//input[@name=\"EmailAddress\"]"));
		enterText(Email, "email", "email");

		WebElement submitButton1 = driver.findElement(By.xpath(pro.getProperty("xero.freeTrail.submitButton")));
		// WebElement submitButton1 =
		// driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		clickobj(submitButton1, "submitButton");

		closeDriver();
		logger.log(Status.INFO, "Browser closed");

	}

	@Test
	public static void FreeTrial_Privacy_Policy() throws IOException {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\DataFiles\\FreeTrial_Privacy_Policy.properties");
		prop.load(fs);

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\ObjectRepository\\ObjRepo.properties");
		pro.load(fis);

		logger = extent.createTest("FreeTrial_Privacy_Policy");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		InitializeDriver(prop.getProperty("browser"));
		logger.log(Status.INFO, "Firefox is launched");

		driver.get(prop.getProperty("url"));
		logger.log(Status.INFO, "Xero page is opened");

		WebElement FreeTrail = driver.findElement(By.xpath(pro.getProperty("xero.freeTrail")));
		// WebElement FreeTrail = driver.findElement(By.xpath("//a[@class=\"btn
		// btn-primary global-ceiling-bar-btn\"]"));
		clickobj(FreeTrail, "freeTrail");

		WebElement termsOfUse_link = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.termsOfUseLink")));
		// WebElement termsOfUse_link =
		// driver.findElement(By.xpath("//a[contains(text(),'terms of use')]"));
		clickobj(termsOfUse_link, "termsLink");

		WebElement privacy_link = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.privacyLink")));
		// WebElement privacy_link =
		// driver.findElement(By.xpath("//a[contains(text(),'privacy notice')]"));
		clickobj(privacy_link, "privacyLink");

		closeDriver();
		logger.log(Status.INFO, "Browser closed");

	}

	@Test
	public static void FreeTrial_OfferDetails() throws IOException {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\DataFiles\\FreeTrial_OfferDetails.properties");
		prop.load(fs);

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\ObjectRepository\\ObjRepo.properties");
		pro.load(fis);

		logger = extent.createTest("FreeTrial_OfferDetails");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		InitializeDriver(prop.getProperty("browser"));
		logger.log(Status.INFO, "Firefox is launched");

		driver.get(prop.getProperty("url"));
		logger.log(Status.INFO, "Xero page is opened");

		WebElement FreeTrial = driver.findElement(By.xpath(pro.getProperty("xero.freeTrail")));
		// WebElement FreeTrial = driver.findElement(By.xpath("//a[@class=\"btn
		// btn-primary global-ceiling-bar-btn\"]"));
		clickobj(FreeTrial, "freeTrial");

		WebElement offerDetails_link = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.offerDetailsLink")));
		// WebElement offerDetails_link =
		// driver.findElement(By.xpath("//a[contains(text(),'offer details')]"));
		clickobj(offerDetails_link, "offerLink");

		closeDriver();
		logger.log(Status.INFO, "Browser closed");

	}

	@Test
	public static void FreeTrial_Accountant() throws IOException {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\DataFiles\\FreeTrial_Accountant.properties");
		prop.load(fs);

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\ObjectRepository\\ObjRepo.properties");
		pro.load(fis);

		logger = extent.createTest("FreeTrial_Accountant");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		InitializeDriver(prop.getProperty("browser"));
		logger.log(Status.INFO, "Firefox is launched");

		driver.get(prop.getProperty("url"));
		logger.log(Status.INFO, "Xero page is opened");

		WebElement FreeTrail = driver.findElement(By.xpath(pro.getProperty("xero.freeTrail")));
		// WebElement FreeTrail = driver.findElement(By.xpath("//a[@class=\"btn
		// btn-primary global-ceiling-bar-btn\"]"));
		clickobj(FreeTrail, "freeTrail");

		WebElement accountant_link = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.accountantLink")));
		// WebElement accountant_link =
		// driver.findElement(By.xpath("//a[contains(text(),'accountant or
		// bookkeeper')]"));
		clickobj(accountant_link, "accountantLink");

		closeDriver();
		logger.log(Status.INFO, "Browser closed");
	}

	@Test
	public static void logout_functionality() throws IOException {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\DataFiles\\logout_functionality.properties");
		prop.load(fs);

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\src\\test\\resources\\ObjectRepository\\ObjRepo.properties");
		pro.load(fis);

		logger = extent.createTest("logout_functionality");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\geckodriver.exe");
		InitializeDriver(prop.getProperty("browser"));
		logger.log(Status.INFO, "Firefox is launched");

		driver.get(prop.getProperty("url"));
		logger.log(Status.INFO, "Xero page is opened");

		WebElement username = driver.findElement(By.xpath(pro.getProperty("xero.login.username")));
		// WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		enterText(username, "username", "username");

		WebElement password = driver.findElement(By.xpath(pro.getProperty("xero.login.password")));
		// WebElement password =
		// driver.findElement(By.xpath("//input[@id='password']"));
		enterText(password, "password", "password");

		WebElement submitButton = driver.findElement(By.xpath(pro.getProperty("xero.login.submitButton")));
		// WebElement submitButton =
		// driver.findElement(By.xpath("//button[@id='submitButton']"));
		clickobj(submitButton, "submitButton");

		WebElement dropdown = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.menuDropDown")));
		// WebElement dropdown = driver.findElement(By.xpath("//a[@class='username']"));
		clickobj(dropdown, "dropdown");

		WebElement logout = driver.findElement(By.xpath(pro.getProperty("xero.freeTrial.logout")));
		// WebElement logout =
		// driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		clickobj(logout, "logout");

		closeDriver();
		logger.log(Status.INFO, "Browser closed");
	}

}
