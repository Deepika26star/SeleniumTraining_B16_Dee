package com.companyname.productname.modulename.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.companyname.productname.modulename.testbase.TestBase;
import com.google.common.io.Files;

// Deepika

public class CommonMethods extends TestBase {

	public static void takeScreenShot() {
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());

		File dest = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\screenShots\\screenshot_"
				+ timeStamp + ".png");

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			Files.copy(scrFile, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest.toString()).build());

	}

	public static void clickOnElemnent(String xpath, String elmentName) {
		driver.findElement(By.xpath(or.getProperty(xpath))).click();
		System.out.println("User clicked on " + elmentName);
		test.info("User clicked on " + elmentName);

		// List<String> lst = new ArrayList<String>();
	}

	public static void clickOnElemnent(WebElement e, String elmentName) {
		e.click();
		System.out.println("User clicked on " + elmentName);
		test.info("User clicked on " + elmentName);

		// List<String> lst = new ArrayList<String>();
	}

	public static void enterTextIntoInputBox(String xpath, String data, String message) {// Method Overloading//
																							// Polymorphism
		driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(data);
		System.out.println("User entered " + message + " and it's value is: " + data);
		test.info("User entered " + message + " and it's value is: " + data);
	}

	public static void enterTextIntoInputBox(WebElement ele, String data, String message) {// Method Overloading//
																							// Polymorphism
		ele.sendKeys(data);
		System.out.println("User entered " + message + " and it's value is: " + data);
		test.info("User entered " + message + " and it's value is: " + data);
	}

	public static void enterTextInInputBox(String xpath, String data) { // Data type should be different
		driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(data);
		System.out.println("User entered " + data);
		test.info("User entered " + data);
	}

	public static void enterTextInInputBox(WebElement ele, String data) { // Data type should be different
		ele.sendKeys(data);
		System.out.println("User entered " + data);
		test.info("User entered " + data);
	}

	public static void verifyPageTitle(String expected_title) {
		String actual_pagetitle = driver.getTitle();
		System.out.println("Atal title" + actual_pagetitle);
		Assert.assertEquals(actual_pagetitle, expected_title);
		System.out.println("Page title is verified and Title is: " + actual_pagetitle);
		test.pass("Page title is verified and Title is: " + actual_pagetitle);
		takeScreenShot();
	}

	public static void verifyTextonPage(String xpath, String expected_text) {
		String actual_text = driver.findElement(By.xpath(or.getProperty(xpath))).getText();
		Assert.assertEquals(actual_text, expected_text);
		System.out.println("Page text is verified and the text is: " + actual_text);
		test.pass("Page text is verified and the text is: " + actual_text);
		takeScreenShot();
	}

	public static void verifyTextonPage(WebElement e, String expected_text) {
		String actual_text = e.getText();
		Assert.assertEquals(actual_text, expected_text);
		System.out.println("Page text is verified and the text is: " + actual_text);
		test.pass("Page text is verified and the text is: " + actual_text);
		takeScreenShot();
	}

	public static void selectByVisibleText(String xpath, String visible_Text) {
		Select sel = new Select(driver.findElement(By.xpath(or.getProperty(xpath))));
		sel.selectByVisibleText(visible_Text);
		System.out.println(visible_Text + " value is selected from the dropdown box");
		test.pass(visible_Text + " value is selected from the dropdown box");
		takeScreenShot();
	}

	public static void selectByVisibleText(WebElement e, String visible_Text) {
		Select sel = new Select(e);
		sel.selectByVisibleText(visible_Text);
		System.out.println(visible_Text + " value is selected from the dropdown box");
		test.pass(visible_Text + " value is selected from the dropdown box");
		takeScreenShot();
	}

	public static void selectByIndex(String xpath, int index) {
		Select sel = new Select(driver.findElement(By.xpath(or.getProperty(xpath))));
		sel.selectByIndex(index);
		System.out.println(index + " value is selected from the dropdown box");
		test.pass(index + " value is selected from the dropdown box");
		takeScreenShot();
	}

	public static void selectByValue(String xpath, String value) {
		Select sel = new Select(driver.findElement(By.xpath(or.getProperty(xpath))));
		sel.selectByValue(value);
		System.out.println(value + " value is selected from the dropdown box");
		test.pass(value + " value is selected from the dropdown box");
		takeScreenShot();
	}

	/*
	 * public static void takeScreenshort() {
	 * 
	 * File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 * String timeStamp = new
	 * SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSSZ").format(new Date());
	 * 
	 * File dest = new File( System.getProperty("user.dir") +
	 * "\\src\\test\\resources\\screenShorts\\" + timeStamp + ".png");
	 * 
	 * //System.out.println("Destination Folder: " + dest);
	 * 
	 * try { //System.out.println("Screenshot saved to: " + dest.getAbsolutePath());
	 * Files.copy(srcFile, dest);
	 * 
	 * } catch (IOException e) { // System.err.println("Failed to save screenshot: "
	 * + e.getMessage()); e.printStackTrace(); }
	 * 
	 * test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest.toString()).
	 * build()); }
	 * 
	 * public static void clickOnElemnent(String butonName, String
	 * webElementClicked) {
	 * driver.findElement(By.xpath(or.getProperty(butonName))).click();
	 * test.info("user clicked on: " + webElementClicked);
	 * //System.out.println("user clicked on..." + webElementClicked); }
	 * 
	 * public static void enterTextInInputBox (String xpath, String data, String
	 * message) {
	 * driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(data);
	 * //System.out.println("User Entered: " + data); test.info("user Entered: " +
	 * data); }
	 * 
	 * public static void enterTextInInputBox (String xpath, String data) //method
	 * overloading ... Polymorphism {
	 * driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(data);
	 * //System.out.println("User Entered: " + data); test.info("user Entered: " +
	 * data); }
	 * 
	 * public static void verifyPageTitle(String expectedTitle) { String
	 * actualpageTitle = driver.getTitle(); Assert.assertEquals(actualpageTitle,
	 * expectedTitle); test.pass("Page Title is verified and the page title is: " +
	 * actualpageTitle); takeScreenshort(); }
	 * 
	 * public static void verifyTextonPage(String textToVeify, String expectedText)
	 * { String actualText =
	 * driver.findElement(By.xpath(or.getProperty(textToVeify))).getText();
	 * Assert.assertEquals(actualText, expectedText);
	 * //System.out.println("Page text is verified and the page text is ..." +
	 * actualText); test.pass("Page text is verified and the page text is: " +
	 * actualText); takeScreenshort(); }
	 * 
	 * public static void selectDropdown(String selectDays, String selectValue)
	 * throws InterruptedException { Select dropDown = new
	 * Select(driver.findElement(By.xpath(or.getProperty(selectDays))));
	 * dropDown.selectByVisibleText(selectValue);
	 * //System.out.println("Select Value is selected as :" + selectValue);
	 * test.info("Dropdown selected is: " + selectValue); takeScreenshort(); }
	 * 
	 * public static void selectChkBox(String chkBoxNme, String message) {
	 * driver.findElement(By.xpath(or.getProperty(chkBoxNme))).click();
	 * //System.out.println("checkbox  " + message + "is selected" );
	 * test.info("Checkbox selected is: " + message); takeScreenshort(); }
	 * 
	 * 
	 * public static void checkLoggedInUser() {
	 * 
	 * }
	 */
}
