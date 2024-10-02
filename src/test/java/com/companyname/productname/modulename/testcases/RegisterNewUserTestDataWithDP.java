package com.companyname.productname.modulename.testcases;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.companyname.productname.modulename.pages.HomePage;
import com.companyname.productname.modulename.pages.SignInOrSignUpPage;
import com.companyname.productname.modulename.testbase.TestBase;
import com.companyname.productname.modulename.utilities.CommonMethods;
import com.companyname.productname.modulename.utilities.DataCollection;

public class RegisterNewUserTestDataWithDP extends TestBase { // Business logic
	
	@Test(dataProvider = "data_Collection") // Data Driven Framework (Data, Verification & Validation) 
	public void registerNewUserTestDataWithDP(Hashtable<String, String> ht) {
		
	//	String pagetitle = driver.getTitle();
	//	Assert.assertEquals(pagetitle, "Automation Exercise");
		
		//CommonMethods.verfiyPageTitle("Automation Exercise");
		
		//CommonMethods.verfiyPageTitle(ht.get("Page_Title"));
		
//		HomePage hp = new HomePage();
//		hp.verifyHomePageTitle(ht);
//		hp.navigateToSignInOrSignUpPage();
//		
//		SignInOrSignUpPage signIn = new SignInOrSignUpPage();
//		
//		signIn.registerNewUser(ht);
		
		new HomePage().verifyHomePageTitle(ht).navigateToSignInOrSignUpPage().registerNewUser(ht);
		
//		CommonMethods.clickOnWebElement("SignUpLogIn_btn", "SignUpLogIn button");
//		
//		CommonMethods.verifyTextOnThePage("NewUsrSignUp_Txt", ht.get("Home_Page_Text"));
//		
//		CommonMethods.enterTextIntoInputBox("name", ht.get("First_Name"));
//		
//		CommonMethods.enterTextIntoInputBox("signup-email", ht.get("Email_Address"), "email address");
//		
//		CommonMethods.clickOnWebElement("signup_btn", "SignUp button");
		
		CommonMethods.verifyTextOnThePage("pageText", ht.get("Accnt_Info_Page_Text"));
		
		CommonMethods.clickOnWebElement("gender_Mrs", "Mrs. Radio Button");
		
		CommonMethods.enterTextIntoInputBox("pwd", "Test@1234", "Password entered");
		
		CommonMethods.selectByVisibleText("dd_Days", ht.get("DOB_Days"));
		
		CommonMethods.selectByVisibleText("dd_month", ht.get("DOB_Month"));
		
		CommonMethods.selectByVisibleText("dd_years", ht.get("DOB_Year"));
		
	}
	
	@DataProvider
	public Object[][] data_Collection() {	
		DataCollection dc = new DataCollection(excel, "Test_Data", "RegisterNewUserTestDataWithDP");			
		return dc.dataArray();	
	}

}
