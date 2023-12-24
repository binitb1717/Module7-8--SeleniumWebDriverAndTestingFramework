package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Que8 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
		
	driver.get("http://demo.guru99.com/test/newtours/register.php");	
	Thread.sleep(2000);


WebElement Ho=driver.findElement(By.linkText("Home"));
WebElement Fl=driver.findElement(By.linkText("Flights"));
WebElement Ht=driver.findElement(By.linkText("Hotels"));
WebElement CR=driver.findElement(By.linkText("Car Rentals"));
WebElement C=driver.findElement(By.linkText("Cruises"));
WebElement Dt=driver.findElement(By.linkText("Destinations"));
WebElement Vc=driver.findElement(By.linkText("Vacations"));

Actions act= new Actions(driver);
act.moveToElement(Ho).build().perform();
Thread.sleep(1000);
act.moveToElement(Fl).build().perform();
Thread.sleep(1000);
act.moveToElement(Ht).build().perform();
Thread.sleep(1000);
act.moveToElement(CR).build().perform();
Thread.sleep(1000);
act.moveToElement(C).build().perform();
Thread.sleep(1000);
act.moveToElement(Dt).build().perform();
Thread.sleep(1000);
act.moveToElement(Vc).build().perform();
Thread.sleep(1000);

driver.close();

}
}
