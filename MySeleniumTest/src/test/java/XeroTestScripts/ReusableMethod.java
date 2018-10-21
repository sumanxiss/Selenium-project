package XeroTestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReusableMethod extends XeroBaseClass {

	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent = null;
	static ExtentTest logger = null;

	// EnteringText
	public static void enterText(WebElement obj, String textValue, String objName) {
		if (obj.isDisplayed()) {
			obj.sendKeys(textValue);
			logger.log(Status.PASS,
					MarkupHelper.createLabel(textValue + "is entered in" + objName + "field", ExtentColor.GREEN));
			// System.out.println("Pass: " + textValue + "username is entered in " + objName
			// + " field");
		} else {
			logger.log(Status.FAIL, MarkupHelper
					.createLabel(objName + "field doesn't exist,please check your application", ExtentColor.RED));
			// System.out.println("Fail: " + objName + " field doesn't exist, please check
			// your application");
		}
	}

	// ClickObject
	public static void clickobj(WebElement obj, String objName) {
		if (obj.isDisplayed()) {
			obj.click();
			logger.log(Status.PASS, MarkupHelper.createLabel(objName + "is clicked", ExtentColor.GREEN));
			// System.out.println("Pass:" + objName + " is clicked");
		} else {
			logger.log(Status.FAIL, MarkupHelper
					.createLabel(objName + "object doesn't exist, please check your application", ExtentColor.RED));
			// System.out.println("Fail: " + objName + " object doesn't exist, please check
			// your application");
		}
	}

	// ReportExecution
	public static void executionReport(String ReportName) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String timeNow = dtf.format(now);
		timeNow = timeNow.replace(":", "_");
		timeNow = timeNow.replace(" ", "_");
		timeNow = timeNow.replace("/", "_");

		System.out.println(ReportName + "_" + timeNow + ".html");

		htmlReporter = new ExtentHtmlReporter("C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\target\\ExtentReports"
				+ ReportName + "_" + timeNow + ".html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

//Read xls file
	public static String[][] readSheet(String dt_Path, String sheetName) throws IOException {

		/* Step 1: Get the XL Path */
		File xlFile = new File(dt_Path);

		/* Step2: Access the Xl File */
		FileInputStream xlDoc = new FileInputStream(xlFile);

		/* Step3: Access the work book */
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);

		/* Step4: Access the Sheet */
		HSSFSheet sheet = wb.getSheet(sheetName);

		int iRowCount = sheet.getLastRowNum() + 1;
		int iColCount = sheet.getRow(0).getLastCellNum();

		String[][] xlData = new String[iRowCount][iColCount];

		for (int i = 0; i < iRowCount; i++) {
			for (int j = 0; j < iColCount; j++) {
				xlData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}

		}

		return xlData;
	}

	// Takes screenshot
	public static String takeScreenShot() throws IOException {
		String reportPath = new SimpleDateFormat("yyyyMMddHHmmss").format(LocalDateTime.now());
		String curDir = System.getProperty("user.dir");
		String destination = curDir + "/target/Screenshots/" + reportPath + "image.PNG";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(destination), true);
		return destination;

	}

	// Locators identification
	public static By getLocator(String strElement, String propertyName) throws Exception {

		// retrieve the specified object from the object list
		//String locator = propertyfile.getProperty(strElement);
		String locator = propertyName;

		// extract the locator type and value from the object
		String locatorType = locator.split(":")[0];
		String locatorValue = locator.split(":")[1];

		// for testing and debugging purposes
		System.out.println(
				"Retrieving object of type '" + locatorType + "' and value '" + locatorValue + "' from the object map");

		// return a instance of the By class based on the type of the locator
		// this By can be used by the browser object in the actual test
		if (locatorType.toLowerCase().equals("id"))
			return By.id(locatorValue);
		else if (locatorType.toLowerCase().equals("name"))
			return By.name(locatorValue);
		else if ((locatorType.toLowerCase().equals("classname")) || (locatorType.toLowerCase().equals("class")))
			return By.className(locatorValue);
		else if ((locatorType.toLowerCase().equals("tagname")) || (locatorType.toLowerCase().equals("tag")))
			return By.className(locatorValue);
		else if ((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link")))
			return By.linkText(locatorValue);
		else if (locatorType.toLowerCase().equals("partiallinktext"))
			return By.partialLinkText(locatorValue);
		else if ((locatorType.toLowerCase().equals("cssselector")) || (locatorType.toLowerCase().equals("css")))
			return By.cssSelector(locatorValue);
		else if (locatorType.toLowerCase().equals("xpath"))
			return By.xpath(locatorValue);
		else
			throw new Exception("Unknown locator type '" + locatorType + "'");
	}

}
