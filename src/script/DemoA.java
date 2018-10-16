package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Result;
import generic.Utility;
import page.LoginPage;



public class DemoA extends BaseTest
{
	@Test
	public void testA()
	{
		Reporter.log("Executing testA",true);
	}
}
