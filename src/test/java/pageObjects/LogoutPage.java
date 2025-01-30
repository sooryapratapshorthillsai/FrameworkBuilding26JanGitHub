package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

	public LogoutPage(WebDriver driver) {
		super(driver);
		
	}
	
	// Locators
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutButton;
    
    public boolean checkLogout() {
    	return logoutButton.isDisplayed();
    	
    }
    
    public void clickingLogout() {
    	 logoutButton.click();
    	
    }
    
    


}
