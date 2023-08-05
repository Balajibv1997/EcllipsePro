package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ansari\\eclipse-workspace\\Automation\\driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");

	}

}
