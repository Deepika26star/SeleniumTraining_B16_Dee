package com.companyname.productname.modulename.pages;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.companyname.productname.modulename.testbase.TestBase;
import com.companyname.productname.modulename.utilities.CommonMethods;

public class HomePage extends TestBase {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()=\" Signup / Login\"]")
	private static WebElement SignUpLogIn_btn;
	

	public HomePage verifyHomePageTitle(Hashtable<String, String> ht) {
		CommonMethods.verfiyPageTitle(ht.get("Page_Title"));
		return this;
	}

	public SignInOrSignUpPage navigateToSignInOrSignUpPage() {
		SignUpLogIn_btn.click();
		
		return new SignInOrSignUpPage();
	}

	public void navigateToContactUsPage() {

	}

	public void navigateToCartPage() {

	}
}

