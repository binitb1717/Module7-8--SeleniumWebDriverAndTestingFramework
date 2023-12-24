package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Que15 {

	WebDriver driver;

	@BeforeMethod
	public void SetBroswerAndUrll() throws InterruptedException {
		System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}
	
	@Test
	public void Loginn() throws InterruptedException {
	driver.findElement(By.name("email")).sendKeys("binitb1719@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("pass")).sendKeys("Yamaha");
	Thread.sleep(1000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(1000);
	}
	
	@AfterMethod
	public void CloseBrowserr() {
	driver.close();	
	}
	
}
