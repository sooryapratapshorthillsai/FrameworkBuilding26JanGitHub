package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
	
	public SignUpPage(WebDriver driver)
	  {
		  super(driver);
	  }  

	    // Locators
	    @FindBy(xpath = "//input[@placeholder='Name']")
	    WebElement nameBox;

	    @FindBy(xpath = "//input[@data-qa='signup-email']")
	     WebElement emailBox;

	    @FindBy(xpath = "//button[normalize-space()='Signup']")
	     WebElement signUpButton;
	    
	    @FindBy(xpath = "//input[@data-qa='login-email']")
	     WebElement loginEmailBox;
	    
	    @FindBy(xpath = "//input[@placeholder='Password']")
	     WebElement password;
	    
	    @FindBy(xpath = "//button[normalize-space()='Login']")
	     WebElement loginButton;
	  
	    
	    
	  

	  
	    // Actions
	    
	    public void enterName(String name) {
	    	nameBox.sendKeys(name);
	    }
	    
	    public void enterEmail(String email) {
	    	emailBox.sendKeys(email);
	    }
	    public void clickSigUpButton() {
	    	signUpButton.click();
	    }
	    
	    public void clickLogin() {
	    	loginButton.click();
	    }
	    
	    public void enterLoginEmail(String em) {
	    	loginEmailBox.sendKeys(em);
	    }
	    
	    public void enterPassword(String pass) {
	    	password.sendKeys(pass);
	    }

	    

	    

}
