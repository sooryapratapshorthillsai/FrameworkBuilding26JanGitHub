package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LogoutPage;
import pageObjects.SignUpPage;
import testBase.BaseClass;

public class TC_02_TestLogin extends BaseClass{
	
	@Test
	public void test() throws InterruptedException {
		
		
		HomePage hp = new HomePage(driver);
		hp.clickSigUp();
		
		SignUpPage s = new SignUpPage(driver);
		s.enterLoginEmail("joss.butler@eng.com");
		s.enterPassword("Joss@2000");
		s.clickLogin();
		
		LogoutPage lp=new LogoutPage(driver);
		boolean a=lp.checkLogout();
		Assert.assertTrue(a);
	}
		

}
