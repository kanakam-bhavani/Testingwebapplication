package com.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Newtours_assignment {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Sleeper.sleepTightInSeconds(10);
		FileInputStream file= new FileInputStream("C:\\Users\\kanak\\Desktop\\Bhavani\\Testingwebapplication\\src\\com\\assignment\\Newtours_assignment.java");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
	XSSFSheet sheet= workbook.getSheet("sheet1");
	List<WebElement>links=driver.findElements(By.tagName("a"));
	int linkscount= links.size();
	System.out.println(linkscount);
	
for(int i=0;i<links.size();i++) {
	Row r=sheet.createRow(i);
	Cell c= r.createCell(0);
	String linkname=links.get(i).getText();
	System.out.println(linkname);
	links.get(i).click();
	c.setCellValue(linkname);
	

	String actual_title=driver.getCurrentUrl();
	System.out.println(actual_title);
	
	r.createCell(3).setCellValue(actual_title);
	driver.navigate().back();
	links=driver.findElements(By.tagName("a"));
	actual_title=driver.getCurrentUrl();
	FileOutputStream file1= new FileOutputStream("C:\\Users\\kanak\\Desktop\\Bhavani\\Testing webApplication\\ApplicationTestResultFiles\\assignmentresult.xlsx");
	workbook.write(file1);
}
	}

}
