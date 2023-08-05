package qsp;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandellingScrolbar {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bbc.com/");
			RemoteWebDriver r= (RemoteWebDriver) driver;
			r.executeScript("window.(0,3000)");
		}

}
