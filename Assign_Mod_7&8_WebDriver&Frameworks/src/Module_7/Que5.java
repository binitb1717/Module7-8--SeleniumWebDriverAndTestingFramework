package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Que5 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver= new EdgeDriver();

driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/radio.html");
Thread.sleep(2000);

for (int i = 1; i < 4; i++) {
driver.findElement(By.id("vfb-7-" +i)).click();	
Thread.sleep(2000);
}

driver.quit();



}
}
