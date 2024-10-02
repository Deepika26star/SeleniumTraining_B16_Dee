package com.companyname.productname.modulename.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.companyname.productname.modulename.testbase.TestBase;

public class TabAndWindows_TestNG_ConfigFiles3 extends TestBase {

	public static WebDriver driver;
	public static Properties config;
	public static Properties or;
	
	@Test
	public void clickURLs_3() throws InterruptedException {

		driver.findElement(By.xpath(or.getProperty("custID"))).sendKeys(config.getProperty("username"));

		driver.findElement(By.xpath(or.getProperty("custPass"))).sendKeys(config.getProperty("password"));

		driver.findElement(By.xpath(or.getProperty("loginButton"))).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Axix group  Child window ");
		Set<String> windows = driver.getWindowHandles();

		Iterator itr = windows.iterator();
 
		String parentWindow = (String) itr.next();
		String childWindow = (String) itr.next();

		System.out.println("Parent Window..." + parentWindow);
		System.out.println("Child Window..." + childWindow);

		driver.switchTo().window(childWindow);

		driver.findElement(By.xpath(or.getProperty("searchBox"))).sendKeys(config.getProperty("searchKeyword"));
		Thread.sleep(2000);
		
		driver.close();

		System.out.println("Child window closed");

		driver.switchTo().window(parentWindow);

		System.out.println("switch to parent window");
		System.out.println("about us link clicked on parent window");

		driver.findElement(By.xpath(or.getProperty("aboutUS"))).click();

		/////

		Set<String> windows1 = driver.getWindowHandles();

		Iterator itr1 = windows1.iterator();

		String parentWindow1 = (String) itr1.next();
		String childWindow1 = (String) itr1.next();

		System.out.println("Parent Window..111111." + parentWindow1);
		System.out.println("Child Window..111111111." + childWindow1);

		driver.switchTo().window(childWindow1);

		/////

		System.out.println("About us Child window ");
		driver.findElement(By.xpath(or.getProperty("searchChatInput"))).sendKeys(config.getProperty("searchKeywordonAboutUs"));
		Thread.sleep(2000);
		driver.close();
	}

}
