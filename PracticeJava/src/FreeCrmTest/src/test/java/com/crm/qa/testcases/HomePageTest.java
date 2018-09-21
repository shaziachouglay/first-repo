package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import com.crm.qa.base.baseTest;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends baseTest {
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialisation();
	testUtil =new TestUtil();
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test
	public void verifyHomePageTitletest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO");
		
	}
    @Test
    public void verifyuserNametest() {
    	testUtil.switchtoFrame();
    	contactsPage = homePage.clickonContactsLink();
    }
   
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

