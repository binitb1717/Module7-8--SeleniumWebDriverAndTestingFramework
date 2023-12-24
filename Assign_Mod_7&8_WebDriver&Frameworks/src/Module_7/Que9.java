package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Que9 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
		
	driver.get("http://demo.guru99.com/test/newtours/register.php");	
	Thread.sleep(2000);
	
	WebElement we= driver.findElement(By.name("userName"));
	Actions act= new Actions(driver);
	act.moveToElement(we).click().keyDown(we, Keys.SHIFT).sendKeys("Hello").keyUp(we, Keys.SHIFT).contextClick().perform();
	
	driver.close();

	
	
	
	
}
}
