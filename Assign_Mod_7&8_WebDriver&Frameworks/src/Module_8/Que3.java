package Module_8;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Que3 {
	@DataProvider(name="Vini")
	public Object[][]  readExcel () throws InvalidFormatException, IOException	{
		Object [][] DTA= null;
		
	/*To get file path*/
	String filepath= "F:\\SauceDemo.xlsx";	
		
	/*To make file*/	
	File f= new File(filepath);

	/*To open an excel file*/
	XSSFWorkbook wrkbuk= new XSSFWorkbook(f);

	/*To open a partiuclar sheet of selected excel sheet*/
	Sheet Sht=wrkbuk.getSheet("Sheet3");

	/*TO get number of rows*/
	int nrow= Sht.getPhysicalNumberOfRows();
	System.out.println("Number of row is "+ nrow);

	/*To select particular row*/
	DTA= new Object [nrow][];
	for (int i = 0; i < DTA.length; i++) {
		Row rw= Sht.getRow(i);			/*Row is an interface
		
	/*To get number of column*/	
	int ncol= rw.getPhysicalNumberOfCells();	
	System.out.println("number of cell is "+ ncol);	
		
	/*To select particular cell of column*/	
	DTA[i]= new Object[ncol];

	for (int j = 0; j < DTA[i].length; j++) {
		Cell cl= rw.getCell(j);			/*Cell is an interface

	/*To convert cell value into string*/
	cl.setCellType(CellType.STRING);

	/* To get data from cell*/
	DTA[i][j]= cl.getStringCellValue();	
		
		}
		}
		
		return DTA;
	}
	
	
		WebDriver driver= null;
		@Test (dataProvider = "Vini")
		public void f(String keyword, String data) throws InterruptedException, InvalidFormatException, IOException {
			 System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");System.setProperty("webdriver.edge.driver", "C:\\Users\\tejas\\edgedriver_win64\\msedgedriver.exe");
			 
			  if (keyword.equals("open browser")) {
				 driver= new EdgeDriver();
				 Thread.sleep(2000);
			  }
			  else if (keyword.equals("enter url")) {
				 driver.get(data);
				 Thread.sleep(1000);
			  }
			  else if (keyword.equals("enter username")) {
				 driver.findElement(By.id("user-name")).sendKeys(data);
				 Thread.sleep(1000);
			  }
			  else if (keyword.equals("enter password")) {
				 driver.findElement(By.id("password")).sendKeys(data);
				 Thread.sleep(1000);
			  }
			  else if (keyword.equals("click login")) {
				 driver.findElement(By.id("login-button")).click();
				 Thread.sleep(1000);
			  }
			  else if (keyword.equals("click logout")) {
				 driver.findElement(By.id("react-burger-menu-btn")).click();
				 Thread.sleep(1000);
				    
				 driver.findElement(By.id("logout_sidebar_link")).click();
				 Thread.sleep(1000);
			  }
			  else if (keyword.equals("close browser")) {
				  driver.close();
			  }
			  		  	
	}
	}
