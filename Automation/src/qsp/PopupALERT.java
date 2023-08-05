package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupALERT {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			String text = driver.switchTo().alert().getText();
			System.out.println(text);
			driver.switchTo().alert().accept();
		}

}
