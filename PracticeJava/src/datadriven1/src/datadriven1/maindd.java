package datadriven1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maindd {

	public static void main(String[] args) throws IOException {
		
		  WebDriver wd;
		  System.setProperty("webdriver.chrome.driver", "/Users/nadimchouglay/Downloads/chromedriver 7");
			wd=new ChromeDriver();
			wd.get("http://newtours.demoaut.com");
		  String usr =null,pass=null;
		for(int i=1;i<2;i++ )
		{ 
			for(int j=0;j<2;j++) 
			{ 
				if(j==0)
				usr = excl_utils.getdata(i, j);
				if(j==1)
                 pass = excl_utils.getdata(i, j);					
			}
			
			System.out.println(usr + " " + pass);
		
		newtours_function.login(wd, usr, pass);
		break;
	
	}

}
}
