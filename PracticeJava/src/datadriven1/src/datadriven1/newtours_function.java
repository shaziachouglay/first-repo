package datadriven1;

import org.openqa.selenium.WebDriver;

public class newtours_function {
	
	public static void login(WebDriver wd,String usr,String pass) {
		ObjectRepo.username(wd).sendKeys(usr);
		ObjectRepo.password(wd).sendKeys(pass);
		ObjectRepo.login(wd).click();
	}

}
