package Module_7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Que13 {

	WebDriver driver;
	@Before
	public void OpeningBrowserAndUrl() throws InterruptedException {
		System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/e-11-1390fc9623815e5612d67bb930998-f3b8acd53c5847cda911423b80eee5a5094ac409&dsh=S688778223:1702325699417750&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&theme=glif&TL=AHNYTIQABgeG6rnEAoQ2nc4clpMtjrLMeZNMLyEWOtNZOzb_kAO2vBXn_pFyEeDD");
		Thread.sleep(2000);	
	}
	@Test
	public void CreateAnAcc() throws InterruptedException {
	driver.findElement(By.name("firstName")).sendKeys("Bahubali");	
	Thread.sleep(1000);
	driver.findElement(By.name("lastName")).sendKeys("Thangabali");	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();	
	Thread.sleep(1000);
	}
	@After
	public void closebroswer() {
	driver.close();	
	}
}
