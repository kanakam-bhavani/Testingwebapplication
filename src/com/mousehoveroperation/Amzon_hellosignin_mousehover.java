package com.mousehoveroperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amzon_hellosignin_mousehover {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//<a id="nav-link-yourAccount"></a>
		WebElement hellosignin= driver.findElement(By.id("nav-link-yourAccount"));
		Actions act= new Actions(driver);
		act.moveToElement(hellosignin).build().perform();
		
	}

}
