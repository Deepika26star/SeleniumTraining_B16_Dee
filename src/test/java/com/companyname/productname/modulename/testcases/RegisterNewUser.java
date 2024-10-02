package com.companyname.productname.modulename.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.companyname.productname.modulename.testbase.TestBase;
import com.companyname.productname.modulename.utilities.CommonMethods;

public class RegisterNewUser extends TestBase {

	 @Test
	public static void registerNewUser() throws InterruptedException {

	//	CommonMethods.verifyPageTitle("Automation Exercise");
		 System.out.println("EXPECTED TEST" + excel.getCellData("Test_Data", "Page_Title", 3));
		CommonMethods.verifyPageTitle(excel.getCellData("Test_Data", "Page_Title", 3));

		CommonMethods.clickOnElemnent("signUpLogin", "signUpLogin Link");

	//	CommonMethods.verifyTextonPage("newUserSignUpText", "New User Signup!");
		CommonMethods.verifyTextonPage("newUserSignUpText",	excel.getCellData("Test_Data", "Page_Title", 3));
		String userName = config.getProperty("userName");

		System.out.println("userName" + userName);

		String email = config.getProperty("email");

		System.out.println("email" + email);

		//CommonMethods.enterTextInInputBox("signUpName", userName, userName);
		//CommonMethods.enterTextInInputBox("signUpEmail", email, email);
		
		CommonMethods.enterTextInInputBox("signUpName", excel.getCellData("Test_Data", "First_Name", 3));
		CommonMethods.enterTextInInputBox("signUpEmail", excel.getCellData("Test_Data", "Email_Address", 3));

		CommonMethods.clickOnElemnent("signUpButton", "SIgnUp");

		//CommonMethods.verifyTextonPage("enterAccountInfoText", "ENTER ACCOUNT INFORMATION");
		
		CommonMethods.verifyTextonPage("enterAccountInfoText",excel.getCellData("Test_Data", "Page_Title", 3));

		CommonMethods.clickOnElemnent("genderMr", "Mr");

		CommonMethods.enterTextInInputBox("password", "Dee$$$");

		//CommonMethods.selectDropdown("selectDays", "13");

		//CommonMethods.selectDropdown("selectMonths", "Februadddddry");
		//CommonMethods.selectDropdown("selectyear", "2017");
		
		CommonMethods.selectByVisibleText("selectDays", excel.getCellData("Test_Data", "DOB_Days", 3));

		CommonMethods.selectByVisibleText("selectMonths", excel.getCellData("Test_Data", "DOB_Month", 3));
		CommonMethods.selectByVisibleText("selectyear", excel.getCellData("Test_Data", "DOB_Year", 3));

		/*CommonMethods.selectChkBox("newsLetterChkBox", "Sign up for our newsletter!");
		CommonMethods.selectChkBox("specialOfferChkBox", "Receive special offers from our partners!");

		CommonMethods.enterTextInInputBox("firstName", "Deepika");
		CommonMethods.enterTextInInputBox("lastName", "Bedi");
		CommonMethods.enterTextInInputBox("company", "Google.com");
		CommonMethods.enterTextInInputBox("address1", "Viman Nagar");
		CommonMethods.enterTextInInputBox("address2", "Pune");
		CommonMethods.enterTextInInputBox("state", "MS");
		CommonMethods.enterTextInInputBox("city", "Pune");
		CommonMethods.enterTextInInputBox("zipCode", "411014");
		CommonMethods.enterTextInInputBox("mobile", "9890009939");

		CommonMethods.selectDropdown("selectCountry", "United States");

		CommonMethods.clickOnElemnent("buttonCreateAccount", "Create Account");

		CommonMethods.verifyTextonPage("accountCreated", "ACCOUNT CREATED!");

		CommonMethods.clickOnElemnent("continue", "Continue Button");

		WebElement getLoggedInuser = driver.findElement(By.xpath("//*[contains(text(),'" + userName + "')]"));
		System.out.println("FINALLINE:" + getLoggedInuser.getText());

		Assert.assertEquals("Logged in as " + getLoggedInuser.getText(), "Logged in as " + userName);

		CommonMethods.clickOnElemnent("deleteAccount", "delete Link");

		CommonMethods.verifyTextonPage("accountDeleted", "ACCOUNT DELETED!");
		*/

	}

//	@Test
	/*public static void LoginUserWithCorrectCredentials() throws InterruptedException {

		CommonMethods.verifyPageTitle("Automation Exercise");

		CommonMethods.clickOnElemnent("signUpLogin", "signUpLogin Link");

		CommonMethods.verifyTextonPage("lofintoUserAccountText", "Login to your account");

		String userEmail = config.getProperty("userEmail");
		String userPass = config.getProperty("userPass");

		CommonMethods.enterTextInInputBox("loginEmail", userEmail, userEmail);
		
		CommonMethods.enterTextInInputBox("loginpass", userPass, userPass);

		CommonMethods.clickOnElemnent("loginButton", "Login");

		String actualText = "Logged in as ";
		String expectedText = "Logged in as ";

		Assert.assertEquals(actualText, expectedText);

		CommonMethods.clickOnElemnent("deleteAccount", "delete Link");

		CommonMethods.verifyTextonPage("accountDeleted", "ACCOUNT DELETED!");

	}*/
//	@Test
	/*public static void LoginUserWithWrongCredentials() throws InterruptedException {

		CommonMethods.verifyPageTitle("Automation Exercise");

		CommonMethods.clickOnElemnent("signUpLogin", "signUpLogin Link");

		CommonMethods.verifyTextonPage("lofintoUserAccountText", "Login to your account");

		String userWrongEmail = config.getProperty("userEmail");
		String userPass = config.getProperty("userPass");

		CommonMethods.enterTextInInputBox("loginEmail", userWrongEmail, userWrongEmail);
		
		CommonMethods.enterTextInInputBox("loginpass", userPass, userPass);

		CommonMethods.clickOnElemnent("loginButton", "Login");

		CommonMethods.verifyTextonPage("wrongEmailOrPass", "Your email or password is incorrect!");
		 Thread.sleep(4000);

	}*/
	
//	@Test
	/*public static void LogoutAfterLogIn() throws InterruptedException {

		CommonMethods.verifyPageTitle("Automation Exercise");

		CommonMethods.clickOnElemnent("signUpLogin", "signUpLogin Link");

		CommonMethods.verifyTextonPage("lofintoUserAccountText", "Login to your account");

		String userEmail = config.getProperty("userEmail");
		String userPass = config.getProperty("userPass");

		CommonMethods.enterTextInInputBox("loginEmail", userEmail, userEmail);
		
		CommonMethods.enterTextInInputBox("loginpass", userPass, userPass);

		CommonMethods.clickOnElemnent("loginButton", "Login");

		String actualText = "Logged in as ";
		String expectedText = "Logged in as ";

		Assert.assertEquals(actualText, expectedText);

		CommonMethods.clickOnElemnent("logOut", "Log Out Link");
		
		CommonMethods.verifyTextonPage("signUpLogin", "Signup / Login");
		
		Thread.sleep(4000);
		
		

	}*/
}
