package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiUserAndPwdAlligned {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement user = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.name("pwd"));
		int  x1= user.getLocation().getX();
		int y1= user.getLocation().getY();
		int  x2= user.getLocation().getX();
		int y2= user.getLocation().getY();
		if(x1==x2 & y1==y2)
			System.out.println("username and pwd textfield alliged properly and pass");
		else
		System.out.println("username and pwd textfield not alliged properly and fail");
	}


}