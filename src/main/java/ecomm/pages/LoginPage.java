package ecomm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomm.baseclass.BaseClass;

public class LoginPage extends BaseClass{
	
	//PageFactory
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Page Object Repo
	@FindBy(id = "email") WebElement emailID;
	@FindBy(id = "pass") WebElement passWord;
	@FindBy(xpath = "(//button[@id='send2'])[1]") WebElement btnSignIn;
	
	
	//Actions
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage verifyCustomerLogin() {
		emailID.sendKeys(properties.getProperty("emailID"));
		passWord.sendKeys(properties.getProperty("accountPassword"));
		
		btnSignIn.click();
		
		return new HomePage();
	}

}
