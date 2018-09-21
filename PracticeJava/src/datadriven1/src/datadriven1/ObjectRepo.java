package datadriven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectRepo {
	
	public static WebElement username(WebDriver wd) {
		WebElement we = wd.findElement(By.name("userName"));
		return we;
		
	}
	public static WebElement password(WebDriver wd) {
	WebElement we=	wd.findElement(By.name("password"));
		return we;
		
	}
	public static WebElement  login(WebDriver wd) {
	WebElement we=	wd.findElement(By.name("login"));
	return we;
		
	}
}
