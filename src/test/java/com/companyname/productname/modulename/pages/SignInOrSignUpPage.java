package com.companyname.productname.modulename.pages;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.companyname.productname.modulename.testbase.TestBase;
import com.companyname.productname.modulename.utilities.CommonMethods;

public class SignInOrSignUpPage extends TestBase {
	
	public SignInOrSignUpPage() {	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()=\"New User Signup!\"]")
	private static WebElement NewUsrSignUp_Txt;
	
	@FindBy(xpath = "//*[@name=\"name\"]")
	private static WebElement name;
	
	@FindBy(xpath = "//*[@name=\"email\"][@data-qa=\"signup-email\"]")
	private static WebElement signup_email;
	
	@FindBy(xpath = "//*[@data-qa=\"signup-button\"]")
	private static WebElement signup_btn;
	
	
	public void verifyHomePageTitle() {
		
		CommonMethods.verfiyPageTitle(null);
	}
	
	public EnterAccntInfoPage registerNewUser(Hashtable<String, String> ht) {
		
		CommonMethods.verifyTextOnThePage(NewUsrSignUp_Txt, ht.get("Home_Page_Text"));
		
		CommonMethods.enterTextIntoInputBox(name, ht.get("First_Name"));
		
		CommonMethods.enterTextIntoInputBox(signup_email, ht.get("Email_Address"), "email address");
		
		CommonMethods.clickOnWebElement(signup_btn, "SignUp button");
		
		return new EnterAccntInfoPage();
		}
	
	public void existingUserLogin() {
		
	}
	


}
