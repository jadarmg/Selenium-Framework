package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import generic.WebGeneric;
import page.DashboardPage;
import page.LoginPage;

public class TestLogin extends BaseTest
{
	@Test(priority=1,groups={"smoke"})
	public void testA()
	{
		//take the input from excel file
		String un = Utility.getXLData(DATA_PATH,"TestLogin", 1, 0);
		String pwd = Utility.getXLData(DATA_PATH, "TestLogin", 1, 1);
		String homePageURL=Utility.getXLData(DATA_PATH,"TestLogin", 1, 2);
		String loginPageURL=Utility.getXLData(DATA_PATH,"TestLogin",1, 3);
		//enter valid user name, password click on login
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pwd);
		l.clickLogin();
		
		//Verify that Dashboard page is displayed
		
		WebGeneric.VerifyURL(driver, lngETO, homePageURL);
		
		//verify that Dashboard page is displayed
		
		DashboardPage d=new DashboardPage(driver);
		d.clickWelcome();
		d.clicklogout(10);
		
		//Verify that Logout page is displayed
		WebGeneric.VerifyURL(driver, lngETO, loginPageURL);
		
		
	}
}
