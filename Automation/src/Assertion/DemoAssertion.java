package Assertion;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		@Test
		public void verifyTitle() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			String eTitle = "soogle";
		    String aTitle = driver.getTitle();
		    SoftAssert s=new SoftAssert();
		   s.assertEquals(eTitle, aTitle);
		    driver.close();
		    s.assertAll();
		    
		}

}
