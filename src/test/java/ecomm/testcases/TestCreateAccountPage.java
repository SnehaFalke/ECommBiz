package ecomm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecomm.baseclass.BaseClass;
import ecomm.pages.CreateAccountPage;
import ecomm.pages.HomePage;

public class TestCreateAccountPage extends BaseClass{
	
	HomePage homePage;
	CreateAccountPage createAccountPage;
	
	// super() is used to call constructor of BaseClass 
		public TestCreateAccountPage() {
			super();
		}
		
		@BeforeMethod
		public void launchBrowser() {
			initializeBrowser();
			homePage = new HomePage();
			createAccountPage = new CreateAccountPage();
			homePage.verifyCreateAccountLink();
		}
		
		//@Test(priority = 1)
		public void testPageTitle() {
			//String title = homePage.verifyPageTitle();
			System.out.println(createAccountPage.verifyPageTitle());
			Assert.assertEquals(createAccountPage.verifyPageTitle(), "Create New Customer Account");
		}
		
		@Test(priority = 2)
		public void testCreateAccount() {
			createAccountPage.verifyCreateAccount();
		}
		
		@AfterMethod
		public void closeAction() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
		}

}
