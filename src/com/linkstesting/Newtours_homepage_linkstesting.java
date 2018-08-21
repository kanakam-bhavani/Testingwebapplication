package com.linkstesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtours_homepage_linkstesting {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		int linkscount= links.size();
		System.out.println("total number of links are: "+ linkscount);
		for(int k=0;k<links.size();k++) {
			String linkname= links.get(k).getText();
			System.out.println(k + " " + linkname);
			links.get(k).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			//Navigating back to home page
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
			}
		driver.close();

	}

	
	

}
