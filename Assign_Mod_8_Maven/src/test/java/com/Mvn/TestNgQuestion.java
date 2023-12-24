package com.Mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgQuestion {
	
	WebDriver driver;

	@BeforeTest
	public void Select_Browswer() throws InterruptedException  {
		WebDriverManager.edgedriver().setup();
	}	
	
	@BeforeClass
	public void open_browser() {
		driver= new EdgeDriver();
	}
	
	@BeforeMethod
	public void open_url() throws InterruptedException {
		driver.get("https://www.saucedemo.com");
		Thread.sleep(2000);	
	}
	
	@Test
	public void Final() throws InterruptedException {
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
	}
		
	@AfterMethod
	public void Close_browser() {
		driver.close();
	
	}
	
	@AfterClass
	public void afterclass() {
	System.out.println("this is after class method");
	}
	
	@AfterTest
	public void afterTest() {
	System.out.println("this is after test method");	
	}
}
