package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	  
	  
	  public HomePage(WebDriver driver)
	  {
		  super(driver);
	  }  

	    // Locators
	    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	    WebElement signup;

	 

	  
	    // Actions
	    public void clickSigUp() {
	    	signup.click();
	    }
	}
