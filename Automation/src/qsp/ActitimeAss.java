package qsp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeAss {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("About your actiTIME")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'Read Service Agreement')]")).click();
			Thread.sleep(3000);
			Set<String> wh = driver.getWindowHandles();
			int count=wh.size();
			System.out.println(count);
			Thread.sleep(3000);
			for(String alltab:wh) {
      		driver.switchTo().window(alltab);		
      		List<WebElement> headings = driver.findElements(By.xpath("//h2"));
      		Thread.sleep(3000);
      		for(WebElement allheadings:headings)
      		{
      			String text = allheadings.getText();
      			System.out.println(text);
      		}
			}
			driver.quit();
			
		}
		

}
