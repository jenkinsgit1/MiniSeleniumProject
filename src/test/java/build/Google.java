package build;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	
  @Test
  
  public void run_google_webpage() {
	  
	 
	  WebDriver driver;
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver=new ChromeDriver();
	  
	  driver.navigate().to("https://www.google.com/");
	  
	  driver.manage().window().maximize();
	  
	  driver.close();
	  
	  
	  
	  
  }
}
