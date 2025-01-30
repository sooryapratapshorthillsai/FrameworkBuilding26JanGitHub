package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountInfo extends BasePage {
	
	public AccountInfo(WebDriver driver)
	  {
		  super(driver);
	  } 
	
	// Locators
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement headerTitle;

    
  
    public String accountPageMessage() {
    	 return headerTitle.getText();
    	
    }

}
