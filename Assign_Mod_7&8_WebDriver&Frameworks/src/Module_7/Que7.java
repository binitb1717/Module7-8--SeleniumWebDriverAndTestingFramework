package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Que7 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");WebDriver driver= new EdgeDriver();
driver.manage().window().maximize();
	
driver.get("http://demo.guru99.com/test/newtours/register.php");	
Thread.sleep(2000);

WebElement we= driver.findElement(By.name("country"));
Select s = new Select(we);
s.selectByVisibleText("UNITED STATES");

driver.close();
}
}
