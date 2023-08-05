package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandellingDisabled {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Ansari/OneDrive/Desktop/Disable.html");
			driver.findElement(By.id("d1")).sendKeys("admin");
			Thread.sleep(3000);
			RemoteWebDriver r= (RemoteWebDriver) driver;
			r.executeScript("document.getElementById('d2').value='manager'");
			driver.findElement(By.id("d3")).click();
			
		}
}
