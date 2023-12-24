package com.Mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple_webdriver {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();	

	driver.get("https://www.saucedemo.com");
	Thread.sleep(2000);

	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(2000);

	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000); 
	 
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	 
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(2000);
	  
	driver.findElement(By.id("logout_sidebar_link")).click();
	Thread.sleep(2000);
		
	driver.close();	
	
	
	}
}
