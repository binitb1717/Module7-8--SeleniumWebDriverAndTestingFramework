package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

//register yourself in gmail
public class Que4 {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver= new EdgeDriver();

driver.manage().window().maximize();
driver.get("https://accounts.google.com/lifecycle/steps/signup/name?dsh=S-586498014:1702287857221401&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en-gb&ifkv=ASKXGp3RG-oWKFhE55Zvp9Oh4nqbCPqDVTMYp6NQt77PN0Lgdhz4ez9kTlpRSOc9NKOSpkakikqO&theme=glif&TL=AHNYTITND3xgJuVSXAwnDoHdV2Demdk-NgP8ECikfLEkXnCvNe3sAmzwj5qzpVV6");
Thread.sleep(1000);

driver.findElement(By.name("firstName")).sendKeys("Babbii");
Thread.sleep(1000);

driver.findElement(By.name("lastName")).sendKeys("Pehelwan");
Thread.sleep(1000);

driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(1000);

driver.findElement(By.id("day")).sendKeys("1");
Thread.sleep(1000);

WebElement we= driver.findElement(By.id("month"));
Select select= new Select(we);
select.selectByValue("4");
Thread.sleep(1000);

driver.findElement(By.id("year")).sendKeys("2010");
Thread.sleep(1000);

WebElement wee= driver.findElement(By.id("gender"));
Select selectt= new Select(wee);
selectt.selectByValue("1");
Thread.sleep(1000);

driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//div[text()='Create your own Gmail address']")).click();
Thread.sleep(1000);

driver.findElement(By.name("Username")).sendKeys("MajbootiGurantted");
Thread.sleep(1000);

driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(1000);

driver.findElement(By.name("Passwd")).sendKeys("MoyeMoye");
Thread.sleep(1000);

driver.findElement(By.name("PasswdAgain")).sendKeys("MoyeMoye");
Thread.sleep(1000);

driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(1000);

driver.close();


}
}
