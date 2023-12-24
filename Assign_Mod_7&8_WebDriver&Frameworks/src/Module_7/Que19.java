package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//DataProvider
public class Que19 {

@DataProvider(name="T1")	
public Object[][] inputs(){
	return new Object[][] {{"standard_user","secret_sauce"}, {"problem_user","secret_sauce"}};
}

@Test(dataProvider = "T1")
public void name(String username, String password) throws InterruptedException {
 System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");

WebDriver driver= new EdgeDriver();

driver.get("https://www.saucedemo.com");
Thread.sleep(2000);

driver.findElement(By.id("user-name")).sendKeys(username);
Thread.sleep(2000);

driver.findElement(By.id("password")).sendKeys(password);
Thread.sleep(2000);

driver.findElement(By.id("login-button")).click();
Thread.sleep(2000);

driver.close();


}









}
