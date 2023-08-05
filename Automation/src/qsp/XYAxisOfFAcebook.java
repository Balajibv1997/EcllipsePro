package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XYAxisOfFAcebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		WebElement login = driver.findElement(By.name("login"));
		int xAxis = login.getLocation().getX();
		int yAxis = login.getLocation().getY();
		System.out.println(xAxis);
		System.out.println(yAxis);
		driver.quit();
	}
}
