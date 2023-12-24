package Module_7;

import java.sql.Driver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Que12 {

	WebDriver driver;
	
	@Before
	public void SetBrowserAndUrl() throws InterruptedException {
		System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);	
	}
@Test	
public void Login () throws InterruptedException {
	driver.findElement(By.name("email")).sendKeys("tejasgulhane2@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("pass")).sendKeys("Yamaha");
	Thread.sleep(1000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(1000);	
	
}	
@After
public void CLosingbrowser () {
	driver.close();
}


//	
}

