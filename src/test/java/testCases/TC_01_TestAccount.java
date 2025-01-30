package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountInfo;
import pageObjects.HomePage;
import pageObjects.SignUpPage;
import testBase.BaseClass;

public class TC_01_TestAccount extends BaseClass {
	
	
	
	@Test
	public void test() {
		
		HomePage hp = new HomePage(driver);
		hp.clickSigUp();
		
		SignUpPage s = new SignUpPage(driver);
		s.enterName("Scott");
		s.enterEmail("abctuti@vm.com");
		s.clickSigUpButton();
		
		AccountInfo ac = new AccountInfo(driver);
		String msg= ac.accountPageMessage();
		Assert.assertEquals(msg, "ENTER ACCOUNT INFORMATION");
		
	
	
	}

}
