package com.webtable;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshots_newtours_homepage_linkstesting {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linkscount=links.size();
		System.out.println(linkscount);
		for(int i=0;i<links.size();i++) {
			String linkname=links.get(i).getText();
			System.out.println(i + " " + linkname);
			
			links.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl()); 
			System.out.println();
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("C:\\Users\\kanak\\Desktop\\Bhavani\\Testing webApplication\\screenshot" +  linkname + ".png"));
			//navigating back to home page
			driver.navigate().back();
			//recreating array list
			links=driver.findElements(By.tagName("a"));
			}
	}

}
