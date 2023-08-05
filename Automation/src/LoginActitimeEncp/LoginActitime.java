package LoginActitimeEncp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginActitime {
	private WebElement unTbx;    // declaration
	private WebElement pwTbx;
	private WebElement lgBtn;
	
	public  LoginActitime(WebDriver driver) {
    unTbx=driver.findElement(By.id("username"));
    pwTbx=driver.findElement(By.name("pwd"));
    lgBtn=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	public void setlogin(String un,String pw) {
		unTbx.sendKeys("admin");
		pwTbx.sendKeys("manager");
		lgBtn.click();
	}
}
