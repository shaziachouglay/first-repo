package freshpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class NewTest {
	WebDriver wd = null;
	
  @Test(dataProvider = "dp")
  public void f(int a,String s) {
	  if(a==2)
	  {
	  System.setProperty("webdriver.chrome.driver", "//Users//nadimchouglay//Desktop//seleniumshaziatrainin//chromedriver 7");
		 wd =new ChromeDriver();
	  }
		 else if(a==1) {
		 System.setProperty("webdriver.gecko.driver", "//Users//nadimchouglay//Desktop//seleniumshaziatrainin//geckodriver");
		 wd =new FirefoxDriver();
		 }
	  wd.get("https://uk.yahoo.com");
		//WebElement element =wd.findElement(By.id("Aside"));
		WebElement element = wd.findElement(By.xpath("//div[(text()='Trending now')]"));
		List<WebElement> listval=wd.findElements(By.xpath("//div/ul[@class='Pos(r) Mt(10px)']/li/ul/li/a"));
		for (WebElement e:listval){
			System.out.println(e.getText());
			
		}
		for(int i=1;i<5;i++) {
		WebElement element1 = wd.findElement(By.xpath("//div[(text()='Trending now')]"));
		WebElement e1 = wd.findElement(By.xpath("//ul[@class='Pos(r) Mt(10px)']/li/ul/li["+i+"]"));
		System.out.println(e1.getText());
		e1.click();
		System.out.println(wd.getTitle());
		wd.navigate().back();
		}
	  
  
  }
		

  
  


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "Firefox" },
      new Object[] { 1, "Chorme" },
     
    };
  }
}
