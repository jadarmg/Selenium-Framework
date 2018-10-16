package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class WebGeneric
{
    public static void waitForVisibilityAndClick(WebDriver driver,long time,WebElement element)
    {
    	WebDriverWait wait=new WebDriverWait(driver,time);
    	try{
    	wait.until(ExpectedConditions.visibilityOf(element));
    	Reporter.log("Element is Visible", true);
    	}
    	catch(Exception e)
    	{
    	Reporter.log("Element is NOT visible",true);
    	Assert.fail();
    	}
    	element.click();
    }
    public static void VerifyURL(WebDriver driver,long time,String partialURL)
    {
    	try
    	{
    		WebDriverWait wait=new WebDriverWait(driver,time);
    		Reporter.log("Req page is Displayed",true);
    	}
    	
    	catch(Exception e)
    	{
    		Reporter.log("Req page is NOT dispalyed",true);
    		Assert.fail();
    	}
    }
}
