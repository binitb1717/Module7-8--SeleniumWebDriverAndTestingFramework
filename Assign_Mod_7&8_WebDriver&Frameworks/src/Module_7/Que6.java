package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Que6 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver= new EdgeDriver();
driver.manage().window().maximize();

driver.get("https://www.facebook.com/help/contact/183000765122339/");
Thread.sleep(2000);
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//*[@id='helpCenterRootID']/div[1]/div/h1/a")).click();
Thread.sleep(2000);



driver.close();

}
}
