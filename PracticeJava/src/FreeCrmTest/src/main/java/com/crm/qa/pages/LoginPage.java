package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.baseTest;

public class LoginPage extends baseTest {
	//page factory -OR
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath ="//input[@value='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath ="//button[contains(text(),'Sign Up')]")
	WebElement signupBtn;
	@FindBy(xpath ="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this); //how would u initialise page factory ans i would initpage factory using init method using 
		//driver and this which means the current class obj
	}
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateCrmImage() {
		return crmLogo.isDisplayed();
	}
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginbtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
				    	js.executeScript("arguments[0].click();", loginbtn);
		
		
		return new HomePage();
	}
	

}
