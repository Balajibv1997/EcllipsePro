package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTextboxEqualrnot {

	

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement usname = driver.findElement(By.id("username"));
		WebElement pswd = driver.findElement(By.name("pwd"));
		int h1 = usname.getSize().getHeight();
		int w1=usname.getSize().getWidth();
		int h2 = pswd.getSize().getHeight();
		int w2 = pswd.getSize().getWidth();
		if(h1==h2 & w1==w2)
		{
			System.out.println("username and pswd textfield equal and pass");
		}
		else {
			System.out.println("username and pswd textfield enot qual and fail");
			
		}
		System.out.println(h1+"$"+h2);
		System.out.println(w1+"$"+w2);
	}
}

