package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Que3 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver= new EdgeDriver();
driver.manage().window().maximize();

driver.get("https://demo.guru99.com/test/delete_customer.php");
Thread.sleep(2000);

driver.findElement(By.name("cusid")).sendKeys("345");
Thread.sleep(2000);
driver.findElement(By.name("submit")).click();
Thread.sleep(2000);

driver.switchTo().alert().accept();
Thread.sleep(1000);
driver.switchTo().alert().accept();
Thread.sleep(1000);
driver.close();


}
}
