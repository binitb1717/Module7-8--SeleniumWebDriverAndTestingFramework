package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Que2 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver= new EdgeDriver();

driver.manage().window().maximize();

driver.get("https://demoqa.com/automation-practice-form");
Thread.sleep(2000);

driver.findElement(By.id("subjectsInput")).click();
Thread.sleep(1000);
driver.findElement(By.id("subjectsInput")).sendKeys("Biology");
Thread.sleep(1000);
driver.findElement(By.id("subjectsInput")).sendKeys("Physics");
Thread.sleep(1000);


driver.close();

}
}
