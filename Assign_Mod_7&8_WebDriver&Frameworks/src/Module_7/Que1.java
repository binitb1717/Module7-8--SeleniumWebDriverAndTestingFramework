package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//WAJ Script for locating links by linkText() & Partial Link Text();
public class Que1 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");System.setProperty("webdriver.edge.driver", "C:\\Users\\tejas\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver= new EdgeDriver();

driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
//by link text
//driver.findElement(By.linkText("Forgotten password?")).click();
//Thread.sleep(2000);

//by partial link text
driver.findElement(By.partialLinkText("Forgo")).click();


driver.quit();


}
}
