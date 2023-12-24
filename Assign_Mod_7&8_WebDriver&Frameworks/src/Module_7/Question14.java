package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Question14 {
	
	
	
	@Test
	@Parameters({"Username","Password"})
	public void SetBrowser(String Username, String Password) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tejas\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	
		driver.findElement(By.name("email")).sendKeys(Username);
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys(Password);
		Thread.sleep(1000);
		driver.close();
}
	
	
}	

