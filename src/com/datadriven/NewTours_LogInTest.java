package com.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest
{

FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		
		 driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void logIn() throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\kanak\\Desktop\\Bhavani\\Testing webApplication\\ApplicationTestDataFiles\\UserLogIn_TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=RowCount;i++)
		{
		
			Row r=sheet.getRow(i);
						
		// <input type="text" size="10" name="userName">
		
	driver.findElement(By.name("userName")).
	            sendKeys(r.getCell(0).getStringCellValue());
				
				// <input type="password" size="10" name="password">
				
	driver.findElement(By.name("password")).
	             sendKeys(r.getCell(1).getStringCellValue());
				
// <input width="58" type="image" height="17" border="0" alt="Sign-In" src="/images/btn_signin.gif?osCsid=e1168ca2990c1c98ace7c6c3453c2060" value="Login" name="login">	
				
	driver.findElement(By.name("login")).click();

				String expected_Title="Find";
				String actual_Title=driver.getTitle();
				
		if(actual_Title.contains(expected_Title))
		{
	
System.out.println("Title Matched -- LogIn SuccessFull - PASS");
r.createCell(2).setCellValue("Title Matched -- LogIn SuccessFull - PASS");
		}
		
		else
				{
System.out.println("Title not Matched -- LogIn Failed -- FAIL");
r.createCell(2).setCellValue("Title not Matched -- LogIn Failed -- FAIL");
				}
				
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\kanak\\Desktop\\Bhavani\\Testing webApplication\\ApplicationTestResultFiles\\UserLogInTestResult.xlsx");
		workBook.write(file1);
			
			driver.navigate().back();
			
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
