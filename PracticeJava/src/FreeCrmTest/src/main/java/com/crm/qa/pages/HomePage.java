package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.baseTest;

public class HomePage extends baseTest{
	@FindBy(xpath = "//td[contains(text(),'User: shanad chou')]")
	WebElement userNameLabel;
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	//intialising PageObjects
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public boolean verifyCorrectuserName() {
		return userNameLabel.isDisplayed();
	}
	public ContactsPage clickonContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	

}
