package ecomm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecomm.baseclass.BaseClass;
import ecomm.pages.HomePage;
import ecomm.pages.LoginPage;

public class TestHomePage extends BaseClass{
	
	HomePage homePage;
	LoginPage loginPage;
	
	// super() is used to call constructor of BaseClass 
	public TestHomePage() {
		super();
	}
	
	@BeforeMethod
	public void launchBrowser() {
		initializeBrowser();
		homePage = new HomePage();
	}
	
	@Test
	public void testPageTitle() {
		//String title = homePage.verifyPageTitle();
		Assert.assertEquals(homePage.verifyPageTitle(), "Home Page");
	}
	
	@Test
	public void testLogo() {
		boolean logocheck = homePage.verifyLogo();
		Assert.assertTrue(logocheck);
	}
	
	@Test
	public void testSignInLink() {
		homePage.verifySignInLink();
	}
	
	@Test
	public void testCreateAccountLink() {
		homePage.verifyCreateAccountLink();
	}
	
	@AfterMethod
	public void closeAction() throws InterruptedException {
		Thread.sleep(1500);
		driver.quit();
	}
}
