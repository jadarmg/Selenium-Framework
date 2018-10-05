package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Result;
import generic.Utility;
import page.LoginPage;



public class DemoA extends BaseTest{
	@Test
	public void testA(){
		String un=Utility.getXLData(DATA_PATH,"DemoA",1,0);
		String pw=Utility.getXLData(DATA_PATH, "DemoA", 1,1);
		
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
	}
}
