package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ansari/OneDrive/Desktop/html%20code/Demo.html");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	int count = allLinks.size();
	System.out.println(count);
	String text;
	for(int i=0; i<count; i++) {
    text=allLinks.get(i).getText();
	System.out.println(text);
	}
		
	
	
	
	
	
}


}
