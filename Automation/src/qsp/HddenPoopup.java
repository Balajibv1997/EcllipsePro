package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HddenPoopup {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
			driver.findElement(By.id("policynumber")).sendKeys("123");
			driver.findElement(By.id("dob")).click();
			WebElement month = driver.findElement(By.className("ui-datepicker-month"));
			Select s1=new Select(month);
			s1.selectByValue("6");
		//	year=driver.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			driver.findElement(By.id("alternative_number")).sendKeys("8971472784");
			driver.findElement(By.id("renew_policy_submit")).click();
			
		}
		
			

}
