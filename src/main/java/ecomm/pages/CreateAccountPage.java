package ecomm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ecomm.baseclass.BaseClass;

public class CreateAccountPage extends BaseClass{
	
	public CreateAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Page Object Repo
	//PageFactory - class - annotation @FindBy  // initElements()
	@FindBy(id = "firstname") WebElement firstName;
	@FindBy(name = "lastname") WebElement lastName;
	@FindBy(id = "email_address") WebElement emailAddress;
	@FindBy(id = "password") WebElement passWord;
	@FindBy(id = "password-confirmation") WebElement passWordConfirm;
	@FindBy(xpath = "//button[@title='Create an Account']") WebElement btnCreateAccount;
	
	
	//Actions
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public MyAccountPage verifyCreateAccount() {
		firstName.sendKeys(properties.getProperty("firstName"));
		lastName.sendKeys(properties.getProperty("lastName"));
		emailAddress.sendKeys(properties.getProperty("emailID"));
		passWord.sendKeys(properties.getProperty("accountPassword"));
		passWordConfirm.sendKeys(properties.getProperty("accountPassword"));
		
		btnCreateAccount.click();
		
		return new MyAccountPage();
		
	}
	
	

}
