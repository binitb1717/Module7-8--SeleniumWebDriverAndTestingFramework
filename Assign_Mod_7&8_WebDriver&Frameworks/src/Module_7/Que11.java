package Module_7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Que11 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
		
	driver.get("http://demo.guru99.com/test/web-table-element.php");	
	Thread.sleep(2000);	
	
	List<WebElement> total_links= driver.findElements(By.tagName("a"));
	int links= total_links.size();
	System.out.println("Total Links availabale on the webpage is "+links);
	driver.close();
}
}
