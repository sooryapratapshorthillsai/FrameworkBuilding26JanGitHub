package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LogoutPage;
import pageObjects.SignUpPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_03_LoginExcelData extends BaseClass{
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test(String em,String pwd,String sts) throws InterruptedException {
		
		
		HomePage hp = new HomePage(driver);
		hp.clickSigUp();
		
		SignUpPage s = new SignUpPage(driver);
		s.enterLoginEmail(em);
		s.enterPassword(pwd);
		s.clickLogin();
		
		LogoutPage lp=new LogoutPage(driver);
		boolean a=lp.checkLogout();
		
		if(a) {
			lp.clickingLogout();
			Assert.assertTrue(a);
			
		}
		else
			Assert.assertTrue(false);
		
		
	
	}
	

}
