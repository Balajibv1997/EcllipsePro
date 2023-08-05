package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutGet {
static 
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		

	}

}
