package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {


	public WebDriver driver;
	 
	  @Test
	  public void openMyBlog() {
	 driver.get("https://www.google.com/");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
	   
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Amulya\\Downloads\\selenium-java-3.8.1\\chromedriver.exe");
		 driver=new ChromeDriver();
			  
	  }
	 
	  
}

