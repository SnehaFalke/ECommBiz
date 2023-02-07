package ecomm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecomm.baseclass.BaseClass;
import ecomm.pages.HomePage;
import ecomm.pages.LoginPage;
import ecomm.pages.MyAccountPage;

public class TestLoginPage extends BaseClass{
	
	HomePage homePage;
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	
	public TestLoginPage() {
		super();
	}
	
	
	@BeforeMethod
	public void launchBrowser() {
		initializeBrowser();
		homePage = new HomePage();
		loginPage = new LoginPage();
		loginPage = homePage.verifySignInLink();
	}
	
	@Test(priority = 1)
	public void testPageTitle() {
		String pageTitle = loginPage.verifyPageTitle();
		Assert.assertEquals(pageTitle, "Customer Login");
	}
	
	@Test(priority = 2)
	public void testCustomerLogin() {
		homePage = loginPage.verifyCustomerLogin();
	}
	
	@AfterMethod
	public void closeAction() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
