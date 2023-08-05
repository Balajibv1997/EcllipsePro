package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Cucummber {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public   WebDriver driver;
	public String landingpageprodName;
	public String oferpageprodName;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");



		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("tom");
		String landingpageprodName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		System.out.println(landingpageprodName);
		Thread.sleep(3000);


		//Thread.sleep(2000);
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i=s1.iterator();
		String parentwindow = i.next();
		String childwindow = i.next();

		driver.switchTo().window(childwindow);

		driver.findElement(By.id("search-field")).sendKeys("tom");
		Thread.sleep(2000);
		String oferpageprodName = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		System.out.println(oferpageprodName);
		Assert.assertEquals(landingpageprodName, oferpageprodName);

	} 


}








