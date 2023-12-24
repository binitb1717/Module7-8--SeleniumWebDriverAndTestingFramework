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
import org.testng.annotations.Test;

//Datadriven Framework

public class Que1 {

public String [][] readExcel() throws InvalidFormatException, IOException{
String Data [][]= null;

String filepath= "F:\\SauceDemo.xlsx";

File f= new File(filepath);

XSSFWorkbook wrkbuk= new XSSFWorkbook(f);

Sheet sheet= wrkbuk.getSheet("Sheet1");

int nrow= sheet.getPhysicalNumberOfRows();
System.out.println("Total row are "+nrow);	

Data= new String[nrow][];
for (int i = 0; i < Data.length; i++) {
	Row rw= sheet.getRow(i);


int ncol= rw.getPhysicalNumberOfCells();
System.out.println("number of cell is "+ ncol);
	

Data[i]= new String [ncol];

for (int j = 0; j < Data[i].length; j++) {
	Cell cl =rw.getCell(j);
	
cl.setCellType(CellType.STRING);	

Data [i][j]= cl.getStringCellValue();


}
}
	
return Data;
	
}
	
WebDriver driver;
@Test
public void t() throws InvalidFormatException, IOException, InterruptedException {
	
	System.setProperty("webdriver.edge.driver","F:\\Vinit\\Tops Technologies\\Automation Testing Java Selenium\\edgedriver_win64\\msedgedriver.exe");System.setProperty("webdriver.edge.driver", "C:\\Users\\tejas\\edgedriver_win64\\msedgedriver.exe");	

	String Data[][]=readExcel();
	  for (int i = 0; i < Data.length; i++) {
		
	  driver= new EdgeDriver();
	   
	  driver.get("https://www.saucedemo.com");
	  Thread.sleep(1000);

	  driver.findElement(By.id("user-name")).sendKeys(Data[i][0]);
	  Thread.sleep(1000);

	  driver.findElement(By.id("password")).sendKeys(Data[i][1]);
	  Thread.sleep(1000); 
	   
	  driver.findElement(By.id("login-button")).click();
	  Thread.sleep(1000);
	   
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  Thread.sleep(1000);
	    
	  driver.findElement(By.id("logout_sidebar_link")).click();
	  Thread.sleep(1000);
	  	
	  driver.close();




}

}
	
}
