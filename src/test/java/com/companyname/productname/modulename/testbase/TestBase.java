package com.companyname.productname.modulename.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//Deepika

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.companyname.productname.modulename.utilities.ExcelReader;

public class TestBase { //heart of framework

	
	public static WebDriver driver;
	public static Properties config;
	public static Properties or;
	
	public static ExtentSparkReporter spark; // Global variables
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static ExcelReader excel;

	@BeforeSuite
	public void loadProertiesFiles() throws IOException {
		
		//System.out.println("config file .... Read start...");
		config = new Properties();
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\files\\config.properties");
		config.load(fs);
		System.out.println("config file is loaded...");

		//System.out.println("OR file .... read start...");
		or = new Properties();
		FileInputStream fsor = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\files\\or.properties");
		or.load(fsor);
		System.out.println("OR file is loaded...");
		
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSSZ").format(new Date());
		
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir") 
				+"\\src\\test\\resources\\ExecutionReports\\report_"+timeStamp+".html");
		System.out.println("Report is created..." + System.getProperty("user.dir") 
		+"\\src\\test\\resources\\ExecutionReports\\report_"+timeStamp+".html");
		
		report.attachReporter(spark);
		
		excel = new ExcelReader(System.getProperty("user.dir")+
				"\\src\\test\\resources\\testData\\Test_Data_Sheet.xlsx");
		System.out.println("testbase.....EXPECTED TEST" + excel.getCellData("Test_Data", "Page_Title", 3));

	}

	@BeforeMethod
	public void atabandwindows_TestNG() throws InterruptedException {

		/*
		 * System.out.println("OR file is Browser..." + config.getProperty("Browser"));
		 * System.out.println("OR file is AppURL..." + config.getProperty("AppURL"));
		 * System.out.println("OR file is username..." +
		 * config.getProperty("username")); System.out.println("OR file is password..."
		 * + config.getProperty("password"));
		 * System.out.println("OR file is searchKeyword..." +
		 * config.getProperty("searchKeyword"));
		 * System.out.println("OR file is searchKeywordonAboutUs..." +
		 * config.getProperty("searchKeywordonAboutUs"));
		 */

		test = report.createTest("registerNewUser");
		if (config.getProperty("Browser").equalsIgnoreCase("CHROME")) {
			driver = new ChromeDriver();
			test.info("Driver - Chrome driver is launched...");
		} else if (config.getProperty("browser").equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			test.info("Driver - Firefox driver is launched...");
		} else {
			driver = new EdgeDriver();
			test.info("Driver - Edge driver is launched...");
		}
		driver.get(config.getProperty("AppURL"));
		
		test.info("User Navigated to URL: " + config.getProperty("AppURL"));
		Thread.sleep(5000);

		driver.manage().window().maximize();

		driver.getTitle();
		//System.out.println("Title ... " + driver.getTitle());
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		
		driver.quit();
	}
	
	@AfterSuite
	public void generateReport()
	{
		report.flush();
	}
}
